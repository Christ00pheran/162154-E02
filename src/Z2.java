import java.util.ArrayList;
import java.util.Iterator;

public class zad2 {
    public static <E extends Iterable<?>> void wypiszCoDrugi(E element){
        Iterator<?> iterator = element.iterator();
        System.out.print(iterator.next()+", ");
        while(iterator.hasNext()){
            iterator.next();
            if(iterator.hasNext()){
                System.out.print(iterator.next()+", ");
            }

        }

    }
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        wypiszCoDrugi(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("\na");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        wypiszCoDrugi(list2);
        System.out.print("\n");
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(2.1);
        list3.add(2.2);
        list3.add(2.3);
        list3.add(2.4);
        list3.add(2.5);
        wypiszCoDrugi(list3);




    }
}
