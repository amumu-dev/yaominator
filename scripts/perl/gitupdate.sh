#!/bin/bash 

msg=$1

git add *.pl
git commit -m "$msg" 
git push
