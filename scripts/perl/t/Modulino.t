#       AUTHOR:  Jiqing Yao (), jqyao@yahoo-inc.com
#      CREATED:  05/14/2011 23:09:50

use strict;
use warnings;

use Test::More tests => 3;                      # last test to print

use lib "../" ;

use_ok('Modulino');

ok( check_out(5) == 5 , "test check out " );
ok( true() , " true function") ;
