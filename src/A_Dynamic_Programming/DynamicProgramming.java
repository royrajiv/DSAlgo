package A_Dynamic_Programming;

/*
Remember : In recursion tree nodes of only 1 path exist at a given point of time.
           i.e: Call-stack of 1 DFS traversal path.

DP = it can be used to solve problems in Polynomial time O(n^c) c = constant ex: O(n^2)
     while brute-force approach will take exponential time. ex: O(c^n) = O(2^n)
What does this mean? This means that
@TODO DP is an Optimization technique. It is a method to optimize the solution to a problem.
As we have said above, in many cases exponential time can be reduced to polynomial time complexity.
Sometimes it is possible to reduce complexity further to O(n) runtime complexity.

If you want to solve a problem using DP it has to have 2 properties. Lets look at those.
@TODO 1> Optimal sub-structure.
Optimal means : best or most favourable
sub-structure means: a sub-problem of the main problem.

Textbook definition says a problem has optimal substructure property when its optimal solution can
be constructed from the optimal solutions of its subproblems so by solving each sub problem in its most
optimal way we obtain optimal solution to the original problem

okay as a very simple example let's imagine that we need to solve some abstract problem so
this is our abstract problem it's a complex problem and we don't know how to
solve it at once but what we do know is that generally
complex problems can be solved step-by-step so what do we do instead of
solving the entire problem at once we first solve a small piece of the problem.
say X 1 right X 1 so X 1 is our subproblem so we solve X 1 in its most
optimal way and when we have a solution we can extend our problem space and
solve x2 right but here is the thing in order to solve x2 we don't have to
recalculate everything from the start you don't have to do it why because we
can use the result of x1 to solve x2 and by doing so we get optimal solution to
x2 and we repeat this process until we solve the entire problem right so we do
X 3 X 4 and so on to get an optimal solution to the main problem we simply
broken down into many sub problems and solve those in optimal way in cases when
it's possible to do so we say a problem has an optimal substructure property.

@TODO 2> Overlapping sub-problems (recursion without repetition)
this one is pretty easy to understand basically when you break a problem into
many subproblems you will notice that sometimes you need to recalculate some
work multiple times many textbooks use the Fibonacci recursion tree as an example.
Fib(5) = Fib(4) + Fib(3)
Fib(4) = Fib(3) + Fib(2)
Fib(3) is calculated twice, hence it is overlapping sub-problem.


@TODO 2 types of DP problems
1> Combinatorial type: These problems answer the question how many.
Ex: how many ways to make a change
how many ways to traverse a graph
how many steps needed to get from point A to point B
In this type of problems your end goal is to count something.

2> Optimization problems:
In optimization problems we're interested in finding a strategy which maximizes or minimizes
some function.
One of the combinatorial examples that we just mentioned was how
many steps needed to get from point A to point B in this example we are
interested in the exact number of steps but if this was an optimization problem
it could sound something like what is the minimum number of steps needed to
get to a certain destination because it's possible that there are many ways
to get to point B.
what is the maximum profit gained by buying and selling a stock ?
what is the minimum cost to travel from New York to Mumbai ?

@TODO Framework to solve DP problems:

1> Define objective function: what is an objective function ?
The objective function is the function that you want to minimize or maximize in your problem.
F(i) = F(i-1) + i.

when we solve problems with dynamic programming we'll learn
that we don't want to recalculate things we want to rely on existing solutions on
the information that we already know right this is the core idea.
so: for sum of natural numbers example:
F(n) = F(n-1) + n.
F(5)= 1+2+3+4+5 = 15
F(6)=15+6 = 21. Hence we are not calculating it from the beginning. we are re-using already
calculated values. In this case reused F(5) to calculate F(6).

2> Identify base cases:  now the second step is to break the problem down into simpler sub problems
and identify the base cases. Remember dynamic programming is always
about breaking down the problem into simpler/smaller sub problems.
And we need base cases to identify boundaries of the problem.
How do we do that, what I usually do is solve the problem for such input values
that a computer is not even needed.
Base Cases: Solve the problem when computer is not even needed.

3> Recurence relation:
Transition function: lets think of the problem as if it is already solved.
The third step is to write down the recurrence relation for the optimized
objective function so how do we determine the recurrence relation ?
sometimes you can spot the pattern by solving the problem for a few more input
values right so if we would solve the problem for f3 f4 and then maybe f5 we
would notice that there is a certain pattern and we would be able to devise
the formula for any given n. Sometimes it is hard and you have to think :).

4> Order of computation. It means we need to determine the order in which sub
problems are solved.
In our case (climbing stairs problem) we rely on for the problem that we were just
solving we were relying on (n-1) and (n-2) so we have a certain order,
here we need to calculate smaller values first.

5> Location of the answer.
This basically means where we are looking for the answer.
So in our case (climbing stairs) the answer is in F(n) right.
Sometimes the answer to the problem can reside in F(0).


From the beginning you jumped ahead to tabulation (bottoms up) algorithms.
That helped solidify my understanding of the bottoms up approach and the
other approaches as a result. Also tabulation generally results in a more
terse program but it might be worth noting the other two implementations:

1. Recursion (use stack) - space complexity O(n), time complexity O(2^n)
2. Memoization (top down, recursion with hash map for lookup) -
        space complexity O(n) stack and
        additional space complexity O(n) for the hash map, time complexity O(n)
3. Tabulation (bottoms up) - space complexity O(1)
        additional space complexity O(n) for list (table), time complexity O(n)

You discussed this time complexity savings (exponential vs polynomial)
in one of your early videos but without noting the distinction between these three options.
*/



public class DynamicProgramming {

}
