# Exercise 7: Financial Forecasting

## Objective

Develop a financial forecasting tool that predicts future values based on historical growth rates using recursion.

## Recursion

Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem.

A recursive algorithm consists of:

1. Base Case
2. Recursive Case

## Algorithm

Future Value Formula:

FutureValue = PresentValue × (1 + GrowthRate)^Years

Recursive Relation:

FV(n) = FV(n−1) × (1 + GrowthRate)

## Time Complexity

The recursive algorithm makes one recursive call for each year.

Time Complexity: O(n)

Space Complexity: O(n)

because recursive calls are stored on the call stack.

## Optimization

The recursive solution can be optimized by:

1. Using Dynamic Programming (Memoization)
2. Using an Iterative Approach
3. Using the direct mathematical formula

FutureValue = PresentValue × (1 + GrowthRate)^Years

This reduces unnecessary recursive calls and improves performance.

## Sample Output

Predicted Future Value after 5 years: 16105.10
