#!/bin/bash
read -p "Enter the File Name : " filename
if [ -f $filename ]
then
	echo "File exist"
	if [[ -r $filename && -w $filename ]]
	then
		echo "The File is readable and writable"
	elif [ -r $filename ]
	then
		echo "The file is readable"
	elif [ -w $filename ]
	then
		echo "The file is writable"
	else
		echo "The file is not readable and not writable"
	fi
else
	echo "File not exist"
fi
