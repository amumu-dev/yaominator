#!/usr/bin/perl -w
use strict ; 
use warnings;
use FindBin;

package main;
#package Modulino;

print "$FindBin::Bin\n" ;
run() unless caller();

sub run {
    print "Just another Perl hacker, \n" ;
    check_out(3);
    true();
}


sub check_out {
    my $money = shift ;

    return $money;
}

sub true {
    return 1;
}
