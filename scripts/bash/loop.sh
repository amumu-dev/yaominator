#!/bin/bash 

tmpfile="./tmp"

if [ -e $tmpfile ]; then
    rm -rf $tmpfile 
else
    ls /var/ > $tmpfile 
fi
 
for f in $(cat $tmpfile); do 
    echo $f
done


rm -rf $tmpfile


COUNT=0

until [ $COUNT -gt 5 ]; do 
    echo count is $COUNT 
    let COUNT=COUNT+1
done


DIR="."


find $DIR -type f | while read file; do 
if [[ "$file" = *[[:space:]]* ]]; then 
    mv "$file" `echo $file | tr ' ' '_'`
fi;

done
