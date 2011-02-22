#!/usr/bin/perl -w

use strict;
use Data::Dumper;

=pod 

This is a script to test DATA section

=cut 

my @data = <DATA>;

my %hash = map{
            chomp;
            /(\d):(\w+)/;
            } @data;

print Dumper(\%hash);


__DATA__
1:sara
2:para
3:gara
