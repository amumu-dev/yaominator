#!/usr/bin/perl -w

use strict ; 


myfunc( "arg1", "arg2" , sub{ print $_[0] , ":" , $_[1] ;});

sub myfunc {

    my( $arg1 ,$arg2 , $sub ) = @_ ;

    &$sub ;

}
