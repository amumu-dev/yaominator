#!/bin/bash 


#tmpfile=/tmp/$$.test
#
#ls -l &> $tmpfile 
#
#cat $tmpfile | grep test
#
#rm -rf $tmpfile

hostgroup=fe

echo ${hostgroup}1

dir='/home/y/bin/test';

echo ${dir%test}
