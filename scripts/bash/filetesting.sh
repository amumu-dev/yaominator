#!/bin/bash 

#-b filenameBlock special file
#-c filenameBlockSpecial character file
#-d directorynameCheck for directory existence
#-e filenameBlockCheck for file existence
#-f filenameBlockCheck for regular file existence not a directory
#-G filenameBlockCheck if file exists and is owned by effective group ID.
#-g filenameBlocktrue if file exists and is set-group-id.
#-k filenameBlockSticky bit
#-L filenameBlockSymbolic link
#-O filenameBlockTrue if file exists and is owned by the effective user id.
#-r filenameBlockCheck if file is a readable
#-S filenameBlockCheck if file is socket
#-s filenameBlockCheck if file is nonzero size
#-u filenameBlockCheck if file set-ser-id bit is set
#-w filenameBlockCheck if file is writable
#-x filenameBlockCheck if file is executable

if [ -z $1 ]; then
    file=$0
else
    file=$1
fi 

if [ -b $file ]; then
    echo $file is block file
elif [ -e $file ]; then
    echo $file exists
elif [ -d $file ]; then 
    echo $file is dir
fi 

