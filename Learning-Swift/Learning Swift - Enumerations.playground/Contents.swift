/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//Enumeration definition
/*
 enum EnumerationName {
 // cases
 }
 */

//enum without default values
/*
 enum DaysOfWeek{
 case monday
 case tuesday
 case wednesday
 case thursday
 case friday
 case saturday
 case sunday
 }

 */


//enum with raw values
enum DaysOfWeek: Int{
    case monday = 61
    case tuesday = 71
    case wednesday = 81
    case thursday = 91
    case friday = 101
    case saturday = 111
    case sunday = 121
}

//Initializina a vairable of enumeration type
var today = DaysOfWeek.thursday

//printing the raw value associated with today
print("\(today.rawValue)")

//using switch with enumeration
switch today{
case .monday, .tuesday, .wednesday, .thursday, .friday:
    print("Working Days")
case .saturday, .sunday:
    print("Holidays")
}

//Enum with associated values
enum EmployeeRecord{
    case name(String, String)
    case age(Int)
    case weight(Float)
}

//Initializina a vairable of enumeration type
var employee = EmployeeRecord.name("John", "Doe")

//using switch with enumeration
switch employee {
case .name(let first, let last):
    print("First Name: \(first)")
    print("Last Name: \(last)")
case .age(var age):
    print("Age: \(age)")
case .weight(let weight):
    print("Weight: \(weight)")
default:
    print("Invalid value")
}

//employee = .age(45)

//employee = .weight(178.56)
