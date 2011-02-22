#!/bin/bash

STR="Hello World";
NUM=2012


echo $STR in year $NUM

function localtest {
    # local is like the local in perl
    local STR="local variable"
    echo $STR
}

echo before: STR is $STR
localtest
echo after: STR is $STR


echo test argument 

echo $1 $2 $3 

# store in array
args=("$@")

#echo arg0 is ${args[0]}
echo ${args[0]} ${args[1]} ${args[2]} ' -> args=("$@"); echo ${args[0]} ${args[1]} ${args[2]}'


# test user input 

echo -e "Please , your name "
#read word
echo "Hello $word"


# test read into an array 
# read command stores a reply into the default build-in variable $REPLY
echo -e " test reply"
#read 
echo -e " your reply is $REPLY"

#read -a read into an array
echo " how many laptops do you have ?"
#read -a laptops 
echo " You have ${laptops[0]} , ${laptops[1]}"


