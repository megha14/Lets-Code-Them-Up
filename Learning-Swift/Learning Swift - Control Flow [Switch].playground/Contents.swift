/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */


//if and else-if
/*var marksOfStudents = 85
if(marksOfStudents >= 75 && marksOfStudents<=100){
    print("First Division")
} else if(marksOfStudents > 30 && marksOfStudents < 75){
    print("Second Division")
}else{
    print("Student Fails")
}*/

/*
 switch conditionalValue {
    case value 1:
        //execute this block
    case value 2:
        //execute this block
    case value 3, value 4:
        //execute this block
    case value5...value6:
        //execute this block
    default:
        otherwise, do something else
 }
 */

var marksOfStudents = 75
switch marksOfStudents {
case 75...100:
    print("First Division")
case 31...75:
    print("Second Division")
case 0...30:
    print("Student Fails")
default:
    print("Out of range")
}


//Counting vowels and spaces in a sentance
var sentence = "I am learning swift"
var countVowels = 0
var countSpaces = 0
for letter in sentence.characters{
    switch letter {
    case "a","A","e","E","i","I","o","O","u","U":
        countVowels += 1
    case " ":
        countSpaces += 1
    default:
        countVowels += 0
    }
}
print("Number of vowels = \(countVowels)")
print("Number of spaces = \(countSpaces)")


