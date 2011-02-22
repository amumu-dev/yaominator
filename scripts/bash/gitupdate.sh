#!/bin/bash 

msg=$1

git add *.sh
git commit -m "$msg" 
git push
