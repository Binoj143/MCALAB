from graphics.rectangle import area as rect_area, perimeter as rect_perimeter
from graphics.circle import area as circle_area, perimeter as circle_perimeter
from ThreeD_graphics.cuboid import area as cuboid_area, volume as cuboid_volume
from ThreeD_graphics.sphere import area as sphere_area, volume as sphere_volume
rect_length, rect_width = 5, 10
circle_radius = 7
cuboid_length, cuboid_width, cuboid_height = 3, 4, 5
sphere_radius = 6
print("Rectangle Area:", rect_area(rect_length, rect_width))
print("Rectangle Perimeter:", rect_perimeter(rect_length,rect_width))
print("Circle Area:", circle_area(circle_radius))
print("Circle Perimeter:", circle_perimeter(circle_radius))
print("Cuboid Area:", cuboid_area(cuboid_length, cuboid_width, cuboid_height))
print("Cuboid Volume:", cuboid_volume(cuboid_length, cuboid_width, cuboid_height))
print("Sphere Area:", sphere_area(sphere_radius))
print("Sphere Volume:", sphere_volume(sphere_radius))


from graphics.rectangle import *
from graphics.circle import *
from ThreeD_graphics.cuboid import *
from ThreeD_graphics.sphere import * 
rect_length, rect_width = 5, 10 
circle_radius = 7
cuboid_length, cuboid_width, cuboid_height = 3, 4, 5
sphere_radius = 6
print("Rectangle Area:", rect_area(rect_length, rect_width))
print("Rectangle Perimeter:", rect_perimeter(rect_length, rect_width))
print("Circle Area:", circle_area(circle_radius))
print("Circle Perimeter:", circle_perimeter(circle_radius))
print("Cuboid Area:", cuboid_area(cuboid_length, cuboid_width, cuboid_height))
print("Cuboid Volume:", cuboid_volume(cuboid_length, cuboid_width, cuboid_height))
print("Sphere Area:", sphere_area(sphere_radius))
print("Sphere Volume:", sphere_volume(sphere_radius))
