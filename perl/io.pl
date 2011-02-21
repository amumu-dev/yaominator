#!/usr/bin/perl -w 

use strict;
use Carp;
use Data::Dumper;

open my $fh , "<" , "passwd" or croak "cannot open passwd ";

my @lines = <$fh> ;


#my @newlines = grep { /mysql/ } @lines ;

#my %hash = map{  my( $a , $b ) =  $_ =~ /(.*):(.*)/ ; $a => $b  } @lines ;


#my $str = "test:haha";
#my( $a , $b ) = $str =~ /(.*):(.*)/;
#Dumper(\%hash);

#print "$a , $b \n";

my @files = glob('*.pl');

Dumper(\@files);


close $fh;
