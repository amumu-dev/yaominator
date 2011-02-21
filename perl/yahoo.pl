use Net::YahooMessenger;

my $yahoo = Net::YahooMessenger->new(
    id       => 'jiqingyao',
    password => '1234567',
);
$yahoo->login or die "Can't login Yahoo!Messenger";
$yahoo->send('yaojiqing', 'Hello World!');
