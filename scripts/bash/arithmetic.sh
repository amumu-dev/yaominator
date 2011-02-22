#!/bin/bash 

function usage {
    echo $0 2 3
}

if [ -z $1 ] || [ -z $2 ]; then 
    usage 
    exit
fi


let RESULT1=$1+$2
echo $1+$2=$RESULT1 

# necessary
declare -i RESULT2
RESULT2=$1+$2
echo $1+$2=$RESULT2 


# easier
echo $1+$2=$(($1 + $2))

