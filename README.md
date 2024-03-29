# practice-java
1. Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to a given number.
2. A prime number e.g. 3, 5, 7, 11, 13, 17, etc.
3. String Palindrome
4. Integer Palindrome
5. Armstrong Number
6. Factorial
6. Reverse String
7.    
1. How to find the missing number in integer array of 1 to 100?
You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array. One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing number.

2. How to find duplicate number on Integer array in Java?
An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in the array. You need to write a program to find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. Actually, this problem is very similar to previous one and you can apply the same trick of comparing actual sum of an array to expected sum of series to find out that duplicate.

3. How to check if array contains a number in Java?
Array doesn't provide any built-in method to check if any number exists or not. This problem is essentially how to search an element in the array. There are two options sequential search or binary search. You should ask the interviewer about whether an array is sorted or not, if the array is sorted then you can use binary search to check if given number is present in an array or not. if interviewer says that array is not sorted then you can still sort and perform binary search otherwise you can use sequential search.

4. How to find largest and smallest number in unsorted array?
You have given an unsorted integer array and you need to find the largest and smallest element in the array. Of course, you can sort the array and then pick the top and bottom element.

5. How to find all pairs on integer array whose sum is equal to given number?
You have given an integer array and a number, you need to write a program to find all elements in the array whose sum is equal to the given number. Remember, the array may contain both positive and negative numbers, so your solution should consider that. Don't forget to write unit test though, even if the interviewer is not asked for it, that would separate you from a lot of developers. Unit testing is always expected from a professional developer.

6. How to find repeated numbers in an array if it contains multiple duplicates?
an array contains n numbers ranging from 0 to n-1 and there are 5 duplicates on it, how do you find it? You can use the approach, we have learned in similar String based problem of finding repeated characters in given String.

7. Write a program to remove duplicates from array in Java?
You have given an array which contains duplicates, could be one or more. You need to write a program to remove all duplicates from array in Java. For example if given array is {1, 2, 1, 2, 3, 4, 5} then your program should return an array which contains just {1, 2, 3, 4, 5}. This array question is also comes at intermediate category because there is no way to delete an element from an array. If substituting with another value is not an option then you need to create another array to mimic deletion.

8. How to sort an array in place using QuickSort algorithm? (solution)
You will often see sorting problems on array related questions because sorting mostly happen on array data structure. You need to write a program to implement in place quick sort algorithm in Java. You can implement either recursive or iterative quicksort, it's your choice but you cannot use additional buffer, array or list, you must sort array in place.

9.   Write a program to find intersection of two sorted arrays in Java? (solution)
Another interesting array interview question, where you need to treat the array as Set. Your task is to write a function in your favorite language e.g. Java, Python, C or C++ to return the intersection of two sorted arrays. For example, if the two sorted arrays as input are {21, 34, 41, 22, 35} and {61, 34, 45, 21, 11}, it should return an intersection array with numbers {34, 21}, For the sake of this problem you can assume that numbers in each integer array are unique.

10. There is an array with every element repeated twice except one. Find that element? (solution)
This is an interesting array coding problem, just opposite of question related to finding duplicates in array. Here you need to find the unique number which is not repeated twice. For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3. Also, don't forget to write couple of unit test for your solution.

11. How to find kth smallest element in unsorted array? (solution)
You are given an unsorted array of numbers and k, you need to find the kth smallest number in the array. For example if given array is {1, 2, 3, 9, 4} and k=2 then you need to find the 2nd smallest number in the array, which is 2. One way to solve this problem is to sort the array in ascending order then pick the k-1th element, that would be your kth smallest number in array because array index starts at zero, but can you do better? Once you are able to solve this array coding question, you can solve many similar questions easily e.g. our next question.

12. How to find kth largest element in unsorted array? (solution)
This problem is exactly same as previous question with only difference being finding kth largest element instead of kth smallest number. For example if given array is {10, 20, 30, 50, 40} and k = 3 then your program should return 30 because 30 is the 3rd largest number in array. You can also solve this problem by sorting the array in decreasing order and picking k-1th element. I often seen this array question on Java interviews with 2 to 3 years experienced guys.

13. How to find common elements in three sorted array? (solution)
Now we are coming on territory of tough array questions. Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
Examples:
input1 = {1, 5, 10, 20, 40, 80}
input2 = {6, 7, 20, 80, 100}
input3 = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

14. How find the first repeating element in an array of integers? (solution)
Given an array of integers, find the first repeating element in it. We need to find the element that occurs more than once and whose index of the first occurrence is smallest.
Examples:
Input:  input [] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 [5 is the first element that repeats]

15. How to find first non-repeating element in array of integers? (solution)
This array interview question is exactly opposite of previous problem, In that you need to find first repeating element while in this you need to find first non-repeating element. I am sure you can use similar approach to solve this problem, just need to consider non repeating element though.

16. How to find top two numbers from an integer array? (solution)
This is another one of the easy array questions you will find on telephonic round of Interviews, but its also little bit tricky. You are asked to find top two numbers not just the top or highest numbers? Can you think of how you would do it without sorting? before looking at solution.

17. How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? (solution)
This is another tough array question you will see on Amazon, Microsoft or Google. You have given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set. What makes it more challenging is expected time complexity of O(n).
Examples:
Input: {1, 3, 6, 10, 11, 15};
Output: 2

18. How to rearrange array in alternating positive and negative number? (solution)
Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance.
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array. This is also a difficult array problem to solve and you need lot of practice to solve this kind of problems in real interviews, especially when you see it first time. If you have time constraint then always attempt these kind of questions once you are done with easier ones. 
Example:
Input: {1, 2, 3, -4, -1, 4}
Output: {-4, 1, -1, 2, 3, 4}
Input: {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0} 

19. How to find if there is a sub array with sum equal to zero? (solution)
There is whole set of array related questions which are based upon sub-array or only selective elements of array e.g. from some range, this is one of such problem. Here you are given an array of positive and negative numbers, find if there is a sub-array with 0 sum.
Examples:
Input: {4, 2, -3, 1, 6}
Output: true 
There is a sub-array with zero sum from index 1 to 3.

20. How to remove duplicates from array in place? (solution)
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example, Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2].
When you see a questions which asked you do to sorting or task in place, it means you cannot use additional array or buffer, but using couple of variables is fine.

21. How to remove a given element from array in Java? (solution)
This is another array coding questions similar to previous one. Here you don't have to find and remove duplicates but a given number. In this problem you are given an array and a value, remove all instances of that value in place and return the new length. The order of elements can be changed. It doesn't matter what you leave beyond the new length. 

22. How to merge sorted array? (solution)
Given two sorted integer arrays A and B, merge B into A as one sorted array. You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively. This is another intermediate array coding question, its not as simple as previous one but neither very difficult.

23. How to find sub array with maximum sum in an array of positive and negative number? (solution)
Another array coding question based upon sub-array. Here you have to find the contiguous sub-array within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous sub array [4,−1,2,1] has the largest sum = 6. 

24. How to find sub array with largest product in array of both positive and negative number? (solution) 
In this problem, your task is to write a program in Java or C++ to find the contiguous sub-array within an array (containing at least one number) which has the largest product.
For example, given the array [2,3,-2,4],
the contiguous sub array [2,3] has the largest product = 6. 

25. Write a program to find length of longest consecutive sequence in array of integers? (solution)
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

26. How to find minimum value in a rotated sorted array? (solution)
This is another advanced level array coding question and you should only attempt this one, once you have solved the easier ones. Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element. You may assume no duplicate exists in the array. One follow-up question of this question is What if duplicates are allowed? Would this affect the run-time complexity? How and why?

27. Given an array of of size n and a number k, find all elements that appear more than n/k times? (solution)
Another tough array based coding questions from Interviews. You are given an array of size n, find all elements in array that appear more than n/k times. For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3.
1. Returns the largest sum of contiguous integers in the array
Example: if the input is (-10, 2, 3, -2, 0, 5, -15), the largest sum is 8

2. Return the sum two largest integers in an array

3. Given an array of integers write a program that will determine if any two numbers add up to a specified number N. Do this without using hash tables

28. How to reverse array in place in Java? (solution)
Now let's see one of the most frequently asked array interview question. You need to write a program which accepts an integer array and your program needs to reverse that array in place, which means you cannot use additional buffer or array, but one or two variables will be fine. Of course you cannot use any open source library or Java API method to directly solve this problem, you need to create your own logic. Here is one such logic to solve this problem :
Array Coding Interview Questions and Answers 

29. Difference between array and linked list data structure? (answer)
This is a theoretical questions from phone interviews. There are several differences between array and linked list e.g. array stores element in contiguous memory location while linked list stores at random places, this means linked list better utilizes the places. Consequently, its possible to have large linked list in limited memory environment compare to array of same size. Advantage of using array is random access it provides if you know the index, while in linked list you need to search an element by traversing which is O(n) operation.

30. How to check if array contains a duplicate number? (answer)
This may look a repeated question because we have already done similar question, but in this question, most from Java interviews, you need to write a contains() like method from Collections, which returns true or false if you pass an element and it is repeated or not.
