/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//Sets
// Example ["a", "b", "c", "d"] a set of first four letters of an alphabet

//Initializing Set

//Method 1
var age = Set<Int>()

print(age)

age = [38, 65, 97]

print(age)

//Method 2
//var color : Set<String> = ["Red", "Green", "Yellow"]
var color : Set = ["Red", "Green", "Yellow"]

//Operations on set

//insert
color.insert("Blue")

print(color)

//remove
color.remove("Green")

print(color)

//contains
print(color.contains("a"))

print(color.contains("Red"))

//count
print(color.count)

//Set Operations

var vowels : Set = ["a", "e", "i", "o", "u"]
var nameLetters : Set = ["l", "a", "u", "r", "e", "n"]

//intersection
print(nameLetters.intersection(vowels))

//union
print(nameLetters.union(vowels))

//symmetricDifference
print(nameLetters.symmetricDifference(vowels))

//subtracting
print(nameLetters.subtracting(vowels))





