from datetime import datetime,timedelta
ct= datetime.now()
print("Current Date and Time:",ct)
dta=7
fd=ct+timedelta(days=dta)
print("Date after",dta, "days:",fd)


