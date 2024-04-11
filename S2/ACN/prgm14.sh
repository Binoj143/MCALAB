#!/bin/bash
arith_oper() {
num1=$1
num2=$2
sum=$((num1 + num2))
echo "Sum=" $sum
product=$((num1 * num2))
echo "Product=" $product
differ=$((num1 - num2))
echo "difference=" $differ
division=$(($num1 / num2))
echo "quotient=" $division
}
read -p "Enter the first number:" number1
read -p "enter the second number:" number2
arith_oper $number1 $number2
