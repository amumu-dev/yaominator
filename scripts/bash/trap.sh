#!/bin/bash

trap functrap INT 

clear;

functrap() {
    echo " CTRL+C detected"
}


for a in 1 2 3 4 5 6 7 8 9 10; do
    echo "$a/10 to exit."
    sleep 1
done

echo " out"
