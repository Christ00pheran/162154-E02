import java.util.ArrayList;

public class zad1 {
    public static <T extends Comparable<T>> void jestPalindromem(T[] arr){
        for(int i=0; i< arr.length/2;i++){
            if(arr[i].compareTo(arr[arr.length-1-i])!=0){
                System.out.print("Nie jest palindromem.");
            }
            System.out.print("Jest palindromem.");
        }

    }
}

