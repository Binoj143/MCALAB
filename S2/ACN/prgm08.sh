#!/bin/bash
check_odd_even()
{
	number=$1
	if [ $((number % 2)) -eq 0 ]; then
		echo "$number is an even number."
	else
		echo "$number is an odd number."
	fi
}
read -p "Enter a number: " input_number
check_odd_even $input_number
