import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sreader {
    public static void main(String[] args) throws IOException {
        String sentence,s,res="";
        int i=0;
        System.out.println("Enter the sentence:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        sentence = br.readLine();

        StringTokenizer st = new StringTokenizer(sentence);// it trim the whitespace and make seperate string of tokrn

        /*StringTokenizer  st = new StringTokenizer(sentence,",");
         the comma will separate the word of the sentence. it trim the comma */
        while ((st.hasMoreTokens())) {
            s = st.nextToken();
            res = res + s.charAt(0);
        }
        res = res.toUpperCase();
        System.out.println("Abbreviation:"+ res);
    }
}
