#!/usr/bin/perl -w

use strict;
use Data::Dumper;
use Log::Log4perl qw(:easy);

use Getopt::Long ;

my %opts ;


my $res = GetOptions( \%opts , 'debug|d' , 'verbose|v' );
if( $opts{debug} )
{
    Log::Log4perl->easy_init($DEBUG);
}
elsif( $opts{verbose})
{
    LOGDIE "byebye";
    Log::Log4perl->easy_init($ERROR);
}

DEBUG Dumper( \%opts );

