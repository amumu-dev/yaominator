#!/usr/bin/perl -w 
#

use strict;

#use YAML::Syck;
use YAML;
use Data::Dumper;

#my $data = { new => [ 'ar1' , 'ar2' , 'ar3' , [ 'in1' , 'in2']] , old => { inner=> 1 }};

#print Dump($data);

#my @array = qw( 1 3 5 7 9);
#print Dump($data , \@array);

my $data;
my $yaml;
{
    local $/=undef;
    $yaml= <DATA>;
    $data = Load($yaml) ;
}

print Dumper($data);
=pod
colo:
  corp: test
  sp2: more 
env:
  prod:
  sandbox:
host:
=cut

#[colo: prod, env: sandbox]
__DATA__
settings: 
   - test: [colo: prod]
