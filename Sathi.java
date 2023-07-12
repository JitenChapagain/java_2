import java.awt.*;
import java.util.ArrayList;

public class Sathi {
    public static void main(String[] args) {

        int[] jiten = {1,2,4,8,3};

        for (int i=0; i< jiten.length;i++){
            System.out.println( jiten[i]);
        }
        System.out.println("\n\nLength of the array is: "+jiten.length);

        jiten[1]=10;
        System.out.println(jiten[1]);

    }
}
