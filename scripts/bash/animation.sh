#!/bin/bash 

ARRAY=("|" / - "\\" )

while ((1)); do
    for (( i=0 ; i<4 ;i++)); do
        echo -n ${ARRAY[${i}]}
        echo -n -e "\b" 
        sleep 0.5
    done
done
