import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Menu {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your choice:");
        System.out.println("1. ADD Employee");
        System.out.println("2. Search Employee");
        System.out.println("3, Edit Employee(salary and department)");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");

        System.out.println("Enter your option:");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            add_employee();
        } else if (opt == 2) {
            searh_employee();
        } else if (opt == 3) {
            edit_employee();
        } else if (opt == 4) {
            delete_employee();
        } else if (opt==5) {
            return;
        } else {
            System.out.println("Enter a valid choice:");
        }
    }

    public static void add_employee() throws IOException {
        /*String choice;
         * do{
         * writeEmployee();
         * System.out.println("Do you want to enter next employee?(yes/no)")}
         * choice=scan.next();
         * }while(choice.equals("yes");*/
        int num = 0;
        Scanner sc = new Scanner(System.in);
        File myFile = new File("emp.txt");

        FileWriter fr = new FileWriter("emp.txt", true);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br);
        while (num != 1) {
            System.out.println("Enter the ID:");
            int id = sc.nextInt();

            System.out.println("Enter the name:");
            String name = sc.next();

            System.out.println("Enter the salary:");
            float salary = sc.nextFloat();

            System.out.println("Enter the department name:");
            String d_name = sc.next();

            System.out.println("Enter the name of the city:");
            String c_name = sc.next();


            String emp = " " + id + " " + name + " " + salary + " " + c_name + " " + d_name + "";
            pr.println(emp);
            //br.write(emp);    if the printwriter is not use

            System.out.println("Do you want to enter the next data?");
            System.out.println("If so enter 0 [yes] and 1[NO]");
            num = sc.nextInt();
        }
        br.close();
    }

    public static void searh_employee() throws IOException
    {
        String emp = null;
        String s,name;
        FileReader fr= new FileReader("emp.txt");
        BufferedReader br= new BufferedReader(fr);
        StringTokenizer stk;
        int i=0;
        while((emp = br.readLine())!=null)
        {
            i=0;
            stk=new StringTokenizer(emp);
            while(stk.hasMoreTokens())
            {
                i++;
                s= stk.nextToken();
                if(s.equalsIgnoreCase("pokhara"))
                {
                    System.out.println(emp);
                }

            }

        }

    }
    public static void edit_employee() throws IOException {
        String n,emp,s,e="";
        int i;
        FileReader fr= new FileReader("emp.txt");
        BufferedReader br= new BufferedReader(fr);
        FileWriter fw=new FileWriter("tmp.txt",true);
        BufferedWriter bw= new BufferedWriter(fw);

        System.out.println("Enter Name of employee to be update:");
        Scanner sc= new Scanner(System.in);
        n=sc.next();

         StringTokenizer stk,stk1;

        while((emp = br.readLine())!=null)
        {
            i=0;
            stk=new StringTokenizer(emp);
            s= stk.nextToken();
            s= stk.nextToken();
            if(s.equalsIgnoreCase(n))
            {
                i=0;
                System.out.println("Enter new salary:");
                Double sal = sc.nextDouble();
                stk1= new StringTokenizer(emp);
                e=" ";
                while(stk1.hasMoreTokens())
                {
                    i++;
                    if(i==3)
                        e += " "+sal+ " ";
                    e += " "+ stk1.nextToken()+ " ";
                }
                bw.write(e+"\n");
            }
            else{
                bw.write(emp+"\n");
                bw.close();
                br.close();
                File f1=new File("emp.txt");


            }
        }


    }
    public static void delete_employee(){

    }
}


