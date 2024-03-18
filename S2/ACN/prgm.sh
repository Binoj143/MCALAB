#/bin/bash
echo "Hello world"
name="John"
echo "My name is $name"
read -p "Enter your age:" age
echo "you are $age years old."
if [ $age -ge 18 ]; then
    echo "you are adult."
else
    echo "you are a minor."
fi
