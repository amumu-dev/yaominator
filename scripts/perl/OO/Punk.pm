package Punk ;

use Moose ;

extends 'Person' ;

sub punked {
    my $self = shift ;
    print "I am punked \n";
}
1;
