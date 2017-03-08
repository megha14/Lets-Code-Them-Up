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

func factorial (number: Int) -> Int{
    var factorial = 1
    var temp = number
    while(temp>1){
        factorial =  factorial * temp
        temp = temp - 1
    }
    return factorial
}

//functionName(paramName: paramValue)

print("Factorial is \(factorial(number: 7))")
