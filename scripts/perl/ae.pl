use strict;
use warnings;

use AnyEvent;
use IO::Socket;
use Fcntl qw(:flock);

my $port = 9010;
my $socket = IO::Socket::INET->new( 'LocalPort' => $port,
    'Listen' => SOMAXCONN,
    'Reuse' => 1) or die "can't create listen socket:$!";
my @pids;
for my $pi (1 .. 5) {
    my $pid = fork();
    if ($pid > 0) {
        push @pids, $pid;
    } elsif ($pid == 0) {
        my $cv = AnyEvent->condvar;
        my $w = AnyEvent->io('fh' => $socket, "poll" => 'r', 'cb' => sub {
                open my $fh, ">test.lock" or return;
                my $csock = undef;
                if (flock($fh, LOCK_EX|LOCK_NB)) {
                    $csock = $socket->accept();
                }
                if (defined($csock)) {
                    print $csock  "aaaaa\n";
                    close $csock;
                    print "accept one $pi $$\n";
                }
                close $fh;
            });

        $cv->recv;
        exit;
    } else {
        die "can not fork";
    }
}


waitpid($_, 0) for @pids;
