public class GenericArraySearch {
    public static <T> int genericFinder(T[] array, T value){ // takes a generic array and value
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){ //uses a for loop to search through the array
                return i; 
            }
        }
        return -1; // returns -1 if the element is not found in the array
    }
}
