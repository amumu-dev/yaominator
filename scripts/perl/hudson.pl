#!/usr/local/bin/perl 
#       AUTHOR:  Jiqing Yao (), jqyao@yahoo-inc.com
#      CREATED:  04/23/2011 23:08:18
use strict;
use warnings;
#use Test::More tests=>1 ;


use XML::Simple;
use YAML::Syck;

my $xml = new XML::Simple;

my $data = $xml->XMLin("assembly.xml" , ForceArray => 1 );

DumpFile( "config.yml" , $data );

my $newdata = LoadFile("config.yml");

#print $xml->XMLout($data);


