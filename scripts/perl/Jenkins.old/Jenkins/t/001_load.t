# -*- perl -*-

# t/001_load.t - check module loading and create testing directory

use Test::More tests => 2;

BEGIN { use_ok( 'Jenkins' ); }

my $object = Jenkins->new ();
isa_ok ($object, 'Jenkins');


