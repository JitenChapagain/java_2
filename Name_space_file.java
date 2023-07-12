//import java.io.*;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
///*wap in java that writes records of 6 employees to a file name "emp.txt"
//* note that an employee has the following attributes ID, Name , Salary, department, City*/
//public class Name_space_file {
//    public static void main(String[] args) throws IOException {
//
//        /*String choice;
//        * do{
//        * writeEmployee();
//        * System.out.println("Do you want to enter next employee?(yes/no)")}
//        * choice=scan.next();
//        * }while(choice.equals("yes");*/
//        int num = 0;
//        Scanner sc= new Scanner(System.in);
//        File myFile = new File("emp.txt");
//
//        FileWriter fr = new FileWriter("emp.txt",true);
//        BufferedWriter br= new BufferedWriter(fr);
//        PrintWriter pr=new PrintWriter(br);
//        while(num!=1){
//            System.out.println("Enter the ID:");
//            int id= sc.nextInt();
//
//            System.out.println("Enter the name:");
//            String name= sc.next();
//
//            System.out.println("Enter the salary:");
//            float salary= sc.nextFloat();
//
//            System.out.println("Enter the department name:");
//            String d_name=sc.next();
//
//            System.out.println("Enter the name of the city:");
//            String c_name=sc.next();
//
//
//            String emp=" "+id+" "+name+" "+salary+" "+c_name+" "+d_name+"";
//            pr.println(emp);
//            //br.write(emp);    if the printwriter is not use
//
//            System.out.println("Do you want to enter the next data?");
//            System.out.println("If so enter 0 [yes] and 1[NO]");
//            num=sc.nextInt();
//        }
//        br.close();
//
//        ReadEmployee();
//
//    }
//
//    public static void ReadEmployee() throws IOException
//    {
//        int count=0;
//        FileReader fr = new FileReader("emp.txt");
//        BufferedReader br= new BufferedReader(fr);
//
//        while(br.readLine()!=null){
//            count++;
//        }
//        br.close();
//        System.out.println("Total number of employee:"+count);
//    }
//
//    public static void ReadName() throws IOException {
//        String sentence,s;
//        FileReader fr = new FileReader("emp.txt");
//        BufferedReader br= new BufferedReader(fr);
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter the name of the employee to search:");
//        String name=sc.next();
//        sentence = br.readLine();
//
//        StringTokenizer st = new StringTokenizer(sentence);
//
//        while ((st.hasMoreTokens())){
//            s= st.nextToken();
//            if (s.equalsIgnoreCase(name))
//                System.out.println();
//        }
//        System.out.println("The total number of employee from Pokhara are:"+);
//
//    }
//
//}
//
