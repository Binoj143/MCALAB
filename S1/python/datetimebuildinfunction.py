from datetime import datetime, timedelta

current_time = datetime.now()
print("Current Date and Time:", current_time)
days_to_add = 7
future_date = current_time + timedelta(days=days_to_add)
print("Date after", days_to_add, "days:", future_date)
