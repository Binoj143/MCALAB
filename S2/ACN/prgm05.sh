#!/bin/bash
echo Enter the string
read s
echo $s>temp
rev="$(rev temp)"
echo "Reversed number is : $rev"
if [ $s = $rev ]
then
echo "it is palindrome"
else
echo " it is not a Palindrome"
fi
