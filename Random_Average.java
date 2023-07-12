
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Random_Average {
    public static void main(String[] args)throws IOException {
        FileReader fr =new FileReader("num.txt");
        BufferedReader ber = new BufferedReader(fr);
        String s;
        int a=0,n,b=0;
        //String s = ber.readLine();
        while((s=ber.readLine())!=null){
            System.out.println(s);
            n=Integer.parseInt(s);
            a=a+n;
            b++;
        }
        System.out.println("Average of the number is :"+ a/b);
        ber.close();
    }
}