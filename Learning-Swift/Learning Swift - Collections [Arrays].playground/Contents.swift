/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//Array

//Example : [1,2,3,4.....10] Array of Integers from 1 to 10

//Initializing Array

//Method 1
//Array storing Odd Numbers
var oddNumber = Array<Int>()

print(oddNumber)

oddNumber = [3, 5, 7, 9]

//Method 2
//Array storing price of oranges
var priceOranges = [Double]()

priceOranges.append(14.6)
priceOranges.append(56.4)
priceOranges.append(14.6)

//Method 3
//Array story houses of Hogwarts
//var house : [String] = ["Gryffindor", "Hufflepuff"]

var house = ["Gryffindor", "Hufflepuff"]

print(house)

//Operations on array

//append
house.append("Ravenclaw")


//insert
house.insert("Slytherin", at: 1)


//remove

house.remove(at: 1)

print(house)


//count
print(house.count)



//retrieve
print(house[2])


