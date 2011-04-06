#!/usr/local/bin/perl 
use strict;
use warnings;

use Punk;
#use Person;


#my $p = Person->new();
my $p = Punk->new();

$p->name( 20 );

$p->punked();
print $p->name . "\n";
