#Collect and print sum
from datetime import date

from dateutil.utils import datetime


def collect_and_print_sum(scores):
    add_scores = 0
    for score in scores:
        add_scores += score
    return add_scores

def collect_and_print_average(scores):
    add_scores = 0
    average = 0
    for score in scores:
        add_scores += score
    average = (add_scores / len(scores))
    return average

def divisible_by_five(number):
    if number % 5 == 0:
        return number * number
    return number % 5

#print(divisibleByFive(32))

#Print numbers from 1 to 10
for num in range (1, 11, 1):
    print(num, end= " ")

print()

#Print even numbers from 1 to 10
for num in range (1, 11, 1):
    if num % 2 == 0:
        print(num, end= " ")

print()

#Print your name 5 times
for num in range (0, 5, 1):
    print("Kelvin Ifeanyi")

print()

#Print all numbers from 50 to 100
for num in range(50, 101, 1):
    print(num, end= " ")

print()

#Print all odd numbers between 1 and 30
for num in range (1, 31, 1):
    if num % 2 != 0:
        print(num, end= " ")

print()

#Print numbers in reverse from 10 to 1
for num in range (10, 0, -1):
    print(num, end= " ")

print()

#Print first 10 multiples of 3
count = 1
num = 3
while count < 11:
    if num % 3 == 0:
        print(num, end= " ")
        count += 1
    num = num+1

print()

#Print all numbers divisible by 5 between 1 and 100
for num in range (1, 101, 1):
    if num % 5 == 0:
        print(num, end= " ")

print()

#Print a message inside a box made of stars
for row in range(1, 11, 1):
    for col in range(1, 11, 1):
        if row == 1 or row == 10 or col == 1 or col == 10:
            print("* ", end= " ")
        elif row == 5 and col == 5:
            print("OK", end= " ")
        else:
            print(" " + " ", end= " ")
    print()

print()

#today = date.today()
#print(today)
print(f"Happy birthday Mrs. Glory Lawrence on ", date.today())