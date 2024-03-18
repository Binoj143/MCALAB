#!/bin/bash
echo "pls enter first number."
read a
echo "pls entre second number."
read b
s=$(($a + $b))
p=$(($a * $b))
av=$(($s/2))
echo "sum = "$s
echo "product = "$p
echo "average = "$av
