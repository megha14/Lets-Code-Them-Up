/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//For-in loop

/* 
 for index in range {
 // do something
 }
 */

//Square of numbers between 1 and 10

for number in 1...5 {
    print("Square of \(number) is \(number*number)")
}


//Iterating over arrays

var color = ["Red", "Green", "Yellow"]

for element in color{
    print("\(element) is a color")
}

//Iterating over dictionaries

var groceryList = ["potatoes" : 4, "carrots" : 6, "onions" : 10]

for (vegetables,quantity) in groceryList{
    print("We need \(quantity) \(vegetables) from the market")
}

//while loops

/*
 while(condition) {
 // do something
 }
 */


//Factorial of a Number
var number = 7
var factorial = 1
while(number>1){
    factorial =  factorial * number
    number = number - 1
}

print("Factorial is \(factorial)")

//repeat-while

/*
 repeat {
 // do something
 }
 while(condition)
 */

//Binary representation of a number//
var decimalNumber = 25
var binary = ""
repeat{
    binary = (String)(decimalNumber % 2) + binary
    decimalNumber = decimalNumber / 2
}while(decimalNumber != 0)

print("Binary representation is \(binary)")

