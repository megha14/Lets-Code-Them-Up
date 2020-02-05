"""
*** Problem ***

Find distinct elements common to all rows of a matrix 
Given a n x n matrix. 
The problem is to find all the distinct elements common to all rows of the matrix. 
The elements can be printed in any order.
Examples:
Input : mat[][] = {  {2, 1, 4, 3},
                    {1, 2, 3, 2},     
                    {3, 6, 2, 3},    
                    {5, 2, 5, 3}  }
                    Output : 2 3
                    
                    
Input : mat[][] = {  {12, 1, 14, 3, 16},
                     {14, 2, 1, 3, 35},   
                     {14, 1, 14, 3, 11},                       
                     {14, 25, 3, 2, 1},                     
                     {1, 18, 3, 21, 14}  }
                     Output : 1 3 14 
                     
                      0  1  2  3
                 0   {2, 1, 4, 3}, 
                 1   {1, 2, 3, 2},     
                 2   {3, 6, 2, 3},    
                 3   {5, 2, 5, 3}
                     
 key= matrix[i][j]  value
 2                  0, 1, 2, 3
 1                  0, 1
 4                  0
 3                  0, 1, 2, 3
 6                  2 
 5                  3          
 
 result = [ 2, 3 ] 
 
time complexity -  O(m x n)    

*** Psuedocode ***

common_elements -
    1 Initialize dictionary
    2 Initialize result array
    3 loop through the matrix rows 
    4   loop through the matrix cols
    5 add matrix[row][col] as key to dictionary, and value is row
    6 loop through the dictionary
    7 if length of value of key is equal to matrix length
    8 add it to result
"""

# *** Solution ***
def common_elements(matrix): 
  # declare dictionary and result array
  keys = {} 
  results = [] 
  
  #initialize dictionary with null list values
  for i in range(0, len(matrix)): 
    for j in range(0, len(matrix[i])): 
      if matrix[i][j] not in keys: 
        keys[matrix[i][j]] = []
  
  # update matrix[row][col] array with values
  for i in range(0, len(matrix)): 
    for j in range(0, len(matrix[i])): 
      if i not in keys[matrix[i][j]]:
        keys[matrix[i][j]].append(i)
  
  # if length of value of key is equal to matrix length add it to result
  for key in keys: 
      if len(keys[key]) == len(matrix):
        results.append(key)

  return results      
    
matrix =   [[2, 1, 4, 3],
          [1, 2, 3, 2], 
          [3, 6, 2, 3],    
          [5, 2, 5, 3]]
          
print(common_elements(matrix))
