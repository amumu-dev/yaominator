#!/usr/bin/perl -w 

use strict;

my @cols = qw( fe1.int1  fe1.int2  fe1.qa1 fe1.qa2 );
my $format = "%20s " x ($#cols + 1) . "\n";

printf $format , @cols ; 
