#!/bin/bash

# This is a script used by jqyao to make things cool
# cool


dotfiles=".vimrc .vim .screenrc"

user=jqyao
gitdir=/home/$user/yaominator/ubuntu/home
homedir=/home/$user

for dotfile in $dotfiles; 
do
    echo link $dotfile ;
    rm -rf $homedir/$dotfile ;
    ln -s $gitdir/$dotfile $homedir/$dotfile ;
done

