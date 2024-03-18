
echo "Student Marksheet"
echo "Enter Operating System Marks:"
read OS
echo "Enter Networking Marks:"
read Networking
echo "Enter Java Marks:"
read Java
echo "*****************"
total=`expr $OS + $Networking + $Java`
echo "Total Marks:"$total
percentage=`expr $total / 3`
echo "Percentage:" $percentage %
if [ $percentage -ge 60 ]
then
echo "Class: First Class Distinction"
elif [ $percentage -ge 50 ]
then
echo "Class: First class"
elif [ $percentage -ge 40 ]
then
echo "Class: Second class"
else
echo "Class: Fail"
fi

