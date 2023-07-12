public class Splits {
    public static void main(String[] args) {
        String name="Jiten";
        int i=0;
        String res="";

        for(i=0; i<name.length();i++)
        {
            res=res+name.charAt(i)+name.charAt(i);

//            System.out.print(name.charAt(i));
//            System.out.println(name.charAt(i));
        }
        System.out.println(res);

}}
