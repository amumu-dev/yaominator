#!/bin/bash 


myargs=("$@")

num=${#myargs[@]}

for(( i=0 ; i<$num ; i++)); do 
   echo number $i argument is ${myargs[${i}]}
done


