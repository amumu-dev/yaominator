#!/bin/bash 

ARRAY=('Debian' 'RedHat' 'Ubuntu' 'CentOS' 'Fedora' )

NUM=${#ARRAY[@]}

for(( i=0; i<$NUM ; i++)); do
    echo ${ARRAY[${i}]}
    #sleep 1
done

