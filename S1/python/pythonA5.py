class Publisher:
    def __init__(self, name):
            self.name = name
class Book(Publisher):
    def __init__(self, name, title, author):
            super().__init__(name)
            self.title = title
            self.author = author
    def display_info(self):
        print(f"Publisher: {self.name}")
        print(f"Title: {self.title}")
        print(f"Author: {self.author}")
class Python(Book):
    def __init__(self, name, title, author, price, no_of_pages):
        super().__init__(name, title, author)
        self.price = price
        self.no_of_pages = no_of_pages
    def display_info(self):
        super().display_info()
        print(f"Price: ${self.price}")
        print(f"Number of Pages: {self.no_of_pages}")

python_book = Python("O'Reilly", "Python Programming", "Eric Matthes", 599.99, 560)

python_book.display_info()
