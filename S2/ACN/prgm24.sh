echo " enter file:"
read str
if test -f $str
then echo "file exists n it is an ordinary file"
elif test -d $str
then echo "directory file"
else
echo "not exists"
fi
