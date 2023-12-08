class BankAccount:
	def __init__(self, account_number, account_holder_name, account_type, balance=0.0):
		self.account_number = account_number
		self.account_holder_name = account_holder_name
		self.account_type = account_type
		self.balance = balance
	def deposit(self, amount):
		if amount > 0:
			self.balance += amount
				print(f"Deposit of ${amount} successful. New balance: ${self.balance}")
		else:
			print("Invalid deposit amount. Please enter a positive value.")
	def withdraw(self, amount):
		if 0 < amount <= self.balance:
			self.balance -= amount
