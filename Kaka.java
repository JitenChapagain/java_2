import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kaka {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(Integer.valueOf(14));
        list.add(10);
        list.add(5);
        list.add(11);
        System.out.println(list);
        System.out.println("max value"+ Collections.max(list));
        System.out.println("max value"+ Collections.min(list));

    }
    public static void display(List<Integer> list){
        for(Integer I:list){
            System.out.println(I);
        }
    }
}
