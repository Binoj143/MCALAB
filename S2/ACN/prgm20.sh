#!/bin/bash
echo -n “Enter a 7 digit number:- ”
read number
len=`echo $number | wc -c`
flag=1
while test $flag -le $len
do
echo $number | cut -c$flag
flag=`expr $flag + 2`
done
