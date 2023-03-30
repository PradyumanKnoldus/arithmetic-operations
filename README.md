# ArithmeticOperations
## Session 4 Day 1 Assignment 4

Write a function that takes a list of Option of numbers and performs some arithmetic operation ("Addition", "Subtraction", "Multiplication") passed to the function by the user.

Hint: First convert List[Option[T]] to List[T] (use for expressions for this) and then perform the arithmetic function over it (make use of Pattern Matching for this). 

    Sample Input: methodName((List(Some(1), Some(2), Some(3), Some(4)), "Addition")
    Sample Output: 10

## Solution

This program defines a function to perform arithmetic operations on a list of numbers. The function takes a list of optional numbers (represented as List[Option[T]]) and a string representing the desired arithmetic operation as input. The function returns an optional result of the arithmetic operation.

The performArithmeticOperation function first extracts the non-None values from the input list, and then performs the arithmetic operation on those values using the Numeric typeclass.

If the list is empty, the function returns None.

The program also includes a few examples of using the performArithmeticOperation function to perform addition, subtraction, and multiplication on a list of numbers, including an example with an empty list.

To run the program, you can simply execute the main method, which will output the results of the arithmetic operations.

Note: This program assumes that the input list contains only numeric types that are supported by the Numeric typeclass.


