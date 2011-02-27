#!/usr/bin/perl -w

use strict ; 
sub myfunc2 {
    my $msg = shift ;
    print "\n $msg \n";
}

myfunc( "arg1", "arg2" , sub{ print $_[0] , ":" , $_[1] ;});

sub myfunc {

    my( $arg1 ,$arg2 , $sub ) = @_ ;

    &$sub ;

}

myfunc2 "test" ;

