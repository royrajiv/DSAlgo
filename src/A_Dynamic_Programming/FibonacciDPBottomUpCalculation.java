package A_Dynamic_Programming;

/*
last video 1 variant of DP
     memoization  (top-down code but ran in linear time)

today : another variant of DP
    bottom-up recursion (preferred by various interviewers)

Changes from Top-down approach:
Change 1>
    Arrows pointing up in rec tree: arrow from F(1) -> F(2)
    i.e: from sub-problem to main problem, because in-order to compute F(2) I need value of F(1)
Change 2>
    remove duplicate nodes and collapse them to unique nodes.
    draw all the edges in the recursion tree
    F(1) ->  F(2), F(3)
    F(0) -> F(2)
    F(2) -> F(3), F(4)

So we have moved from recursive tree to a dependency graph.
This dependency graph shows the dependency between different sub-problems.
So, F(4) depends on computation of F(3) and F(2) that's why there are 2 in-coming edges into F(4)
similaryly, F(3) has 2 incoming edges , F(2), F(1)

while : F(1) & F(0) dont have incoming edges, since they are base-cases and dont depend on smaller sub-problems for their values to be computed.

Directed Dependency Graph
A-cyclic graph, since no cycles present, you will never have any edges directed from larger sub-problem to smaller sub-problem.

Hence, DAG, Directed a-cyclic graph.

DAG -> can be sorted (topological) so that edges are always going in a single direction , left-> right
and that kind of sorting of vertices is called a topological sort.

@TODO One way to avoid repetition in recursion is to:

    Calculate values of F in this Topological sort order (F(0)->F(2) ...)
    So, in Topological sort order whenever we come to a vertex say F(3) we would already have computed the values of
    sub-problems it depends on.
    So, just look-up answers to those sub-problems assuming that we are caching those sub-problems.

    In this case, values will be stored in a table of size n+1
    Instead, of recursive code we will write iterative code, which will go bottom-up.
    i.e: in increasing sub-problem size order/direction
    ...go on till "n"

   T(n) = O(n)
   S(n) = O(n)
 */
public class FibonacciDPBottomUpCalculation {


    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fib for nth term="+fibBottomUp(n));
    }

    private static int fibBottomUp(int n) {
        int[] arrOfValue =  new int[n+1];
        arrOfValue[0] = 0;
        arrOfValue[1] = 1;

        if(n< 2)
            return arrOfValue[n];

        for(int i =2; i<= n;i++ )
            arrOfValue[i] = arrOfValue[i-1] + arrOfValue[i-2];
        return arrOfValue[n];
    }


}
