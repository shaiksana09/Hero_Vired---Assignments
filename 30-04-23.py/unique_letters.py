string = input("Enter a string: ")
string_lower = string.lower()
main_string = set(string_lower)
length = len(main_string)
print("UniqueLetters = ", end = " ")
for i in main_string:
    print(i, end = " ")
    if length - 1 > 0:
        print(",", end = " ")
        length = length -1