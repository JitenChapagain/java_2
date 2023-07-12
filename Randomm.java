import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Randomm {
    public static void main(String[] args) throws IOException
    {
        File myFile = new File("numm.txt");

        FileWriter fr = new FileWriter("numm.txt");
        BufferedWriter br= new BufferedWriter(fr);
        Random rand=new Random();
        for (int i=1;i<=3000;i++){

//string.valueof
            //Interger.tostring
            br.write(new String(rand.nextInt(500) + "\n"));
        }
        br.close();


    }
}
