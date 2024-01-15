/*

Andrew Layton
COP3330C
10/29/2023

This program serves two purposes: the first part returns the index in an array where a particular element
is located, and the second part runs a custom method to determine which of two objects contains
a larger integer.

The user will not supply any inputs except for those that are already input in the program.
The outputs will be the locations in each of the different arrays for which the search method finds
the desired element, as well as the object that contains the higher integer.
*/

public class ArraySearcher {
    public static void main(String[] args){
        Integer[] integerArray = {3, 6, 9, 12, 15};
        String[] deadNames = {"Jerry", "Bob", "Phil", "Mickey", "Bill", "Brent"};
        Double[] doubleArray = {1.3, 2.6, 3.9, 5.2};

        int integerIndex = GenericArraySearch.genericFinder(integerArray, 9);
        int deadIndex = GenericArraySearch.genericFinder(deadNames, "Mickey");
        int doubleIndex = GenericArraySearch.genericFinder(doubleArray, 2.6);

        System.out.println("The index of 9 in the integerArray is: " + integerIndex); // method working with integers
        System.out.println("The index of Mickey in the deadNames array is: " + deadIndex); //method working with strings
        System.out.println("The index of 2.6 in the doubleArray is: " + doubleIndex); // method working with doubles

        classA object1 = new classA();
        classB object2 = new classB();

        Object result = greaterThan(object1, object2);
        System.out.println("The object with the greater number is :" + result);
    }

    public static <T extends HasReturnValue> T greaterThan(T object1, T object2){ // compares the two objects that are passed in
        int value1 = object1.returnValue();
        int value2 = object2.returnValue();

        if (value1 > value2){
            return object1;
        } else {
            return object2;
        }
    }
}

interface HasReturnValue{ // verifies that object being compared has a returnValue() method
    int returnValue();
}

class classA implements HasReturnValue{ //first of the two objects to be created
    public int returnValue() {
        return 25;
    }
}

class classB implements HasReturnValue{ //second of the two objects to be created
    public int returnValue() {
        return 50;
    }
}


