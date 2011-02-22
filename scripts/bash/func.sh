#!/bin/bash 

# you have to put the function before you want to call it 
function hello {
    echo hello
    echo $1
    echo $2
}


if [ -z $1 ]; then
    echo arguments is empty
else
    hello $1 niu
    echo argument is $1
fi

