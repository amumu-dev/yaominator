#!/usr/bin/perl -w 
#

use strict;

use YAML;

my $data = { new => [ 'ar1' , 'ar2' , 'ar3' , [ 'in1' , 'in2']] , old => { inner=> 1 }};

print Dump($data);

my @array = qw( 1 3 5 7 9);
print Dump($data , \@array);

