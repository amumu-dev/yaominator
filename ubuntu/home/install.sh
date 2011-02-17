#!/bin/bash

# This is a script used by jqyao to make things cool
# cool

git config --global user.name "Jiqing Yao"
git config --global user.email "jiqingyao@gmail.com" 

dotfiles=".vimrc .vim .screenrc"

user=jqyao
gitdir=/home/$user/yaominator/ubuntu/home
homedir=/home/$user

for dotfile in $dotfiles; 
do
    echo link $dotfile ;
    #rm -rf $homedir/$dotfile ;
    #ln -s $gitdir/$dotfile $homedir/$dotfile ;
done

#sudo aptitude install ctags
# encrypt and decrypt
# openssl des3 -salt -in infile.txt -out encryptedfile.txt
# openssl des3 -d -salt -in encryptedfile.txt -out normalfile.txt


# processing ssh
rm -rf $homedir/.ssh_backup 
mv $homedir/.ssh $homedir/.ssh_backup
cp -r $gitdir/.ssh $homedir/.ssh

#for salt in `ls $homedir/.ssh/*.salt`;
for salt in `ls .ssh/*.salt | sed s/\.salt$// | sed s/\.ssh.// `;
do 
    echo decrypt file $salt
    openssl des3 -d -salt -in $homedir/.ssh/$salt.salt -out $homedir/.ssh/$salt 
    chmod 600 $homedir/.ssh/$salt 
done

rm -rf $homedir/.ssh/*.salt
