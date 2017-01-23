/* Copyright (C) {2016} {Megha Rastogi}
 You should have received a copy of the GNU General Public License along with this program. If not, see http://www.gnu.org/licenses/.
 */

//Dictionary

//example a dictionary of antonyms : ["hot" : "cold", "dark" : "light", "big" : "small"]

//Initializing Dictionary
var antonyms = [String : String]()

//print(antonyms)

//var antonyms = [:]
antonyms = [:]

antonyms = ["hot" : "cold", "dark" : "light", "big" : "small"]

print(antonyms)

//var groceryList : [String:Int] = ["potatoes" : 4, "carrots" : 6, "onions" : 10]

var groceryList = ["potatoes" : 4, "carrots" : 6, "onions" : 10]

//Dictionary Operations

//insert
print(groceryList)
    
groceryList["tomatoes"] = 12
groceryList["squash"] = 2

print(groceryList)

//remove
groceryList["squash"] = nil
print(groceryList)

groceryList.removeValue(forKey: "carrots")
print(groceryList)

//count
print(groceryList.count)

//Update
print(groceryList)

groceryList["tomatoes"] = 6
print(groceryList)

groceryList.updateValue(5, forKey: "onions")
print(groceryList)



