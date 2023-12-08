class Rectangle:
    def __init__(self, length, width):
        self._length=length
        self._width=width
    
    def area(self):
        return self._length*self._width
        
    def __lt__(self,other):
        return self.area() < other.area()
        
rectangle1= input("Enter the Length and Breadth of the 1st Rectangle:")
rectangle2= input("Enter the Length and Breadth of the 2nd Rectangle:")

if rectangle1<rectangle2:
    print("Rectangle 1 has smaller area than Rectangle 2.")
elif rectangle1>rectangle2:
    print("Rectangle 1 has larger area than Rectangle 2.")
else:
    print("Both rectangles have the same area.")