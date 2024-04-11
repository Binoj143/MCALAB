#!/bin/bash
copy(){
	read -p "Enter the File Name : " filename
	read -p "Enter the path to copy : " c
	cp $filename $c
}
edit(){
	read -p "Enter the File Name : " filename
	gedit $filename
}
rename(){
	read -p "Enter the File Name : " filename
	read -p "Enter new name : " new
	mv $filename $new
}
delete(){
	read -p "Enter the File Name : " filename
	rm $filename
}
while [ true ]
do
	echo "1.Copy"
	echo "2.Edit"
	echo "3.Rename"
	echo "4.Delete"
	echo "5.Exit"
	read -p "Enter your choice : " ch
	case $ch in
		1) copy
		;;
		2) edit
		;;
		3) rename
		;;
		4) delete
		;;
		5) exit
		;;
		default) echo "Enter a valid choice"
		;;
	esac
done
