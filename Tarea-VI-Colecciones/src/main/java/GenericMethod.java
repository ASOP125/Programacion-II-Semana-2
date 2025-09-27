import java.util.Arrays;

public class GenericMethod {

    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Java" , "Generics" , "Ejemplo"};
        Integer[] integerArray = {1, 2, 3, 4, 5};

        System.out.println("String Array:");
        printArray(stringArray);
        System.out.println("Integer Array:");
        printArray(integerArray);

    }

}
