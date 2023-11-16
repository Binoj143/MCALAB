color_names=input("enter comma seperated color names:")
colors=color_names.split(",")
colors=[color.strip() for color in colors]
if len(colors)>=2:
	print("1st color:",colors[0])
	print("last color:",colors[-1])
else:
	print("enter atlest two color names.")
