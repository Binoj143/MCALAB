#/bin/bash
sum_of_digits()
{
    numbers=$1
    sums=0
    while [ $numbers -gt 0 ];do
         digit=$((numbers % 10))
         sums=$((sums + digit))
	 numbers=$((numbers / 10))
    done
    echo "Sum of Digits: $sums"
}
read -p "Enter a number: " input_number
sum_of_digits $input_number
