intoduction_to_python_programming_book_price = 499.00
python_libraries_cook_book_price = 855.00
data_science_in_python_book_price = 645.00
delivery_charge = 250.00
no_of_book1 = int(input("Enter the no of intoduction_to_python_programming_book are wanted: "))
no_of_book2 = int(input("Enter the no of python_libraries_cook_book are needed: "))
no_of_book3 = int(input("Enter the no of data_science_in_python_book are needed: "))
total = (intoduction_to_python_programming_book_price*no_of_book1) + (python_libraries_cook_book_price*no_of_book2) + (data_science_in_python_book_price*no_of_book3)
gst = 0.12
tax = total*gst
total_invoice = total+gst+delivery_charge
print("The total invoice of your puchase is: ",total_invoice)
