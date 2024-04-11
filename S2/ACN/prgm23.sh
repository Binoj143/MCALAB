c=0
echo "enter number"
read num
x=$num
echo "enter the digit whose occurance has to be found"
read digit
while [ $num -ne 0 ]
do
rem=$((num % 10 ))
if [ $rem -eq $digit ]
then
c=$((c+1))
fi
num=$((num/10))
done
echo "no of occurence of " $digit "is " $c "times"
