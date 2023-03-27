package lesson13;

import lesson11.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {
        MyFunctionalInterface myFunctionalInterface = (x, y) ->
                System.out.println("X: " + x + ", Y: " + y + ", sum: " + (x + y));

        myFunctionalInterface.calculate(10, 20);
    }
}
