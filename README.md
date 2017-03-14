# StringsIntersectionSolution

Time difference in execution as the dataset size grows, between the 2 implementations:

1. BruteForce Algorithm:

 @description: ArrayList's contains() is O(n) and is called in a loop
 which could be O(n²) for difficult cases traversing by for loop for 1st
 ArrayList object ArrayList's contain() method
 
 
2. HashSet DataStructure:

 @description: use the property of HashSet: access is O(1), which means we
 can achieve this in O(n) time traversing by for loop for 2nd ArrayList
 bject but using HashSet's contains() to achieve fast O(1)
       

Data/Records  |   BruteForce Algo Time (sec)   |   HashSet DataStructure Time (sec)
      1                0.002                              0.007
      5                0.002                              0.006
      50               0.002                              0.006
      500              0.001                              0.008
      5000             0.106                              0.017
      10000            0.446                              0.021
      20000            1.352                              0.033
      35000            5.316                              0.299
      50000            14.39                              0.575
      80000            39.097                             0.876
      100000           63.548                             1.392
      
