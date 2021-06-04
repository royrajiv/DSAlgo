package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
Given n dice each with m faces, numbered from 1 to m,
find the number of ways to get sum X.
X is the summation of values on each face when all the dice are thrown.
 */
public class DiceRollSumApp {

    /*
    @TODO similarities with binary problem.
    >> it is still recursive,
    >> you still have each call doing some amount of work
    >> and we have to keep track of the work we have done along the way.
    similar to the way we used a String to keep track of work when
    we were making binary numbers.

    @TODO QUESTION 1 > what is the unit of work that each function call might handle ?
    3 dice given hence unit of work = 1 dice. or rolling 1 dice
        i.e: method will handle 1 dice.
        we are talking about exploring, exhausting, backtracking.
    handle to dice means what ? I am deciding what it's value will be.
    then what is it about it's value that I am even going to do with this dice ?
    Any thoughts ?
         subtract its value from TargetSum
    Hence, try out different values to see if it gets me close to the target.
    But, I am going to try all the values,I am going to try 1 thru 6,
    since I dont know what one is going to work.
    Actually,several values might work, coz If I am the 2nd dice thr are lots of values
    that might work, so I have to try them all. Try to find all good combinations.

    So, thats the kind of thought process here.

    @TODO>> So if there are 3 dice then 3 (THREE) function calls each will handle 1 dice

    @TODO QUESTION 2:> base cases ?
    how many dice are easy to roll ?
        0 dice.
        maybe 1 dice is fairly easy to roll, but I am lazier than that, so 0 dice.
    But for BackTracking probllems :
    Base case for 0 dice is :
        all the calls before me have done all the work.
        Hence, my job is to check/print all the great work that guys did before me.

    backtracking:
    common trick : use a helper function since we need to keep track of work done along the way.
     */
    private static int count=0;
    public static void main(String[] args) {
        System.out.println("Calculate diceSum=");
        diceSum(3,7);
        System.out.println("count="+count);
    }

    private static void diceSum(int numberOfDice, int targetSum)
    {
        List<Integer> chosen = new ArrayList<>();
        diceSumHelper(numberOfDice, targetSum, chosen);
    }

    private static void diceSumHelper(int numberOfDice, int targetSum, List<Integer> chosen){

        if(targetSum < 0) //Backtracking since exploring further will not reach optimum solution.
        {
            count++;
            return;
        }
        if(numberOfDice ==0)
        {
            //@TODO base case for backtracking or exhaustive search problem:
            // it means calls before have done work and when it's my turn
            // there is no work left to do because all the other calls did all the work.
            // hence, I am supposed to print all the great work that all the calls did before me.
            // print ALL THE CHOICES that previous calls made.
            //System.out.println(chosen);

            //@TODO without TargetSum check in base case the algorithm exhaustively prints
            // all possible combinations of dice, which is neat :)
            // but that is not what we want.
            // it didnt solve the problem to print all values that add up to particular sum.

            if(targetSum ==0)
                System.out.println(chosen);
        }
        else
        {  // I will handle 1 die
           // try all possible values (1-6) to see if they can work
           // In other words I will try my dice being 1 and see what can happen
           // then, I will try my dice being 2...6 and see what can happen

           //@TODO so to try number 1 thru 6 I can use a for loop for that.

           for(int i =1; i <=6; i++) //FOR each of those values
           {
               //@TODO "choose" i as my value
               // How do you choose things ? in binary problem how did we choose digits ?
               // how did we remember what we had chosen ?
               // we put it into that String right ? great, the output here kind of looks like tht.
               // instead of a String, I want to build Collection of values chosen so far.
               // Hence, helper class needed to store the things I have chosen (Collection of int's).

                chosen.add(i);//CHOOSING is nothing but adding value to "soFar" parameter of recursive method.


               //@TODO "explore" what could follow that (explore means recursion :))
                diceSumHelper(numberOfDice-1, targetSum-i, chosen);

               //@TODO "un-choose" i
               // we have to remove from the chosen "soFar" because we only want 3 values.

               // what we need to do is we need to pick the value one , explore what could follow
               // and when it comes back, we need to unpick one, and then move on to two
               // explore two, come back, unpick two, pick three,
               // explore what could follow three, come back, unpick three.

               // we need to reverse, like if we are adding things to this List
               // and we make recursive calls, when those calls come-back, we should put the vector
               // back how it was before, so that the vector doesnt grow and grow and grow like this
               // so that is what we call un-choose step here.

               // how do I undo my choice ?
               // remove value "i" from vector, but remove(i) will remove the value at index "i"
               // hence remove the last added element from the vector.
               // last element that was added was mine (my choice), hence remove/undo my choice.
               chosen.remove(chosen.size()-1);

           }

        }
        return;
    }

}

