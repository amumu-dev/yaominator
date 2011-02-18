#!/bin/bash 


#18.1. STDOUT from bash script to STDERR
echo "Redirect this STDOUT to STDERR" 1>&2 

#18.2. STDERR from bash script to STDOUT
cat $1 2>&1 




