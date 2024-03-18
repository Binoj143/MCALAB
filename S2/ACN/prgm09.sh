#!/bin/bash
calculate_factorial()
{
	number=$1
	factorial=1
	for ((i=1; i<=number; i++)); do
		factorial=$((factorial * i))
	done
	echo "Factorial of $number is: $factorial"
}
read -p "Enter a a number: " input_number
calculate_factorial $input_number

