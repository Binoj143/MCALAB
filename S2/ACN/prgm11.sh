#!/bin/bash
arith_oper(){
num1=$1
num2=$2
add = $((num1 + num2))
echo "add=" $add
mul = $((num1 * num2))
echo "mul=" $mul
sub = $((num1 - num2))
echo "sub=" $sub
div = $((num1 / num2))
echo "div=" $div
}
read -p "Enter the number: " number1
read -p "Enter the number: " number2
arith_oper $num1 $num2
