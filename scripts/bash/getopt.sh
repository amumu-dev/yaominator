#!/bin/bash

# http://aplawrence.com/Unix/getopts.html
echo "Before getopt"
for i
do
  echo $i
done
args=`getopt abc:d $*`
set -- $args
echo "After getopt"
for i
do
  echo "-->$i"
done

for i
do
    case "$i"
        in
        -a|-b)
        echo flag $i set; sflags="${i#-}$sflags";
        shift;;
        -o)
        echo oarg is "'"$2"'"; oarg="$2"; shift;
        shift;;
        --)
        shift; break;;
    esac
done
echo single-char flags: "'"$sflags"'"
echo oarg is "'"$oarg"'"

