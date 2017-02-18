/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//Switch

/*
 switch ( switchValable ){
 case value1:
    //execute block
 case value2, value3:
    //execute block
 case value4:
    //execute block
 case value5...value6:
 default:
    //execute block
 */


//Print division of students based upon their marks.

//Using if
var marksOfStudents = 45
if ( marksOfStudents >= 75 ){
    print("First Division")
} else if (marksOfStudents > 30 && marksOfStudents < 75) {
    print("Second Division")
} else {
    print("Student fails")
}

//Using Switch
switch(marksOfStudents){
    case 0...30:
        print("Student fails")
    case 30...75:
        print("Second Division")
    case 75...100:
        print("First Division")
    default:
        print("Incorrect Input")
}

//Another Example
var day = "Saturday"
switch day {
case "Monday","Wednesday","Friday":
    print("Go to Gym")
case "Tuesday":
    print("Do Yoga")
case "Thursday":
    print("Dance class")
case "Saturday","Sunday":
    print("Rest Day")q
default:
    print("Incorrect Input")
}

