import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Number
{

    public static void main(String[] args) throws IOException
    {
        File myFile = new File("num.txt");

        FileWriter fr = new FileWriter("num.txt");
        BufferedWriter br= new BufferedWriter(fr);
        for (int i=1;i<=3000;i++){

            br.write(new String(i + "\n"));
        }
        br.close();


    }

}


