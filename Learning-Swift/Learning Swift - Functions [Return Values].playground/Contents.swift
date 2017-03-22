/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */


/*
 func functionName (paramName: paramType  ) -> returnType{
 
 //block of code
 return object
 
 }
 */

//Example
//Factorial of a Number

func factorial (number : Int) {
    var factorial = 1
    var temp = number
    while(temp>1){
        factorial =  factorial * temp
        temp = temp - 1
    }
    print("Factorial is \(factorial)")

}

//functionName(paramName: paramValue)
factorial(number: 7)


//divide function with two return values quotient and remainder

func divide(numA: Int, numB: Int) -> (quotient: Int, remainder: Int){
    return (numA/numB, numA%numB)
}

let result = divide(numA: 9, numB: 2)

print("Quotient is \(result.quotient) and Remainder is \(result.remainder)")

































