#!/bin/bash
 
# Declare variable choice and assign value 4
choice=4



function usage {
# Print to stdout
 echo "1. Bash"
 echo "2. Scripting"
 echo "3. Tutorial"
 echo -n "Please choose a word [1,2 or 3]? "
# Loop while the variable choice is equal 4
}

usage

# bash while loop
while [ $choice -eq 4 ]; do
 
# read user input
read choice

if [ $choice -eq 1 ] ; then
    echo "You have chosen word: Bash"
elif [ $choice -eq 2 ] ; then
    echo "You have chosen word: Scripting"
elif [ $choice -eq 3 ] ; then
    echo "You have chosen word: Tutorial"
else
    usage
fi

done

S1="Bash"
S2="Bash"
S3="NoBash"

if [ $S1 = $S3 ]; then
    echo "S1 and S3 are equal"
else
    if [ $S2 = $S1 ]; then 
        echo "S1 and S2 are equal"
    else
        echo "not equal"
    fi
fi
