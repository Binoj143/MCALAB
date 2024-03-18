#!/bin/bash
find_greatest()
{
	num1=$1
	num2=$2
	num3=$3
	if [ $num1 -gt $num2 ] && [ $num1 -gt $num3 ]; then
		echo "$num1 is the greatest."
	elif [ $num2 -gt $num1 ] && [ $num2 -gt $num3 ]; then
		echo "$num2 is the greatest."
	else
		echo "$num3 is the greatest."
	fi
}
read -p "Enter the first number: " number1
read -p "Enter the second number: " number2
read -p "Enter the third number: " number3
find_greatest $number1 $number2 $number3
