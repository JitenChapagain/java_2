import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tej implements Comparable<Tej> {
    private int idl;
    private String name;
    private double salary;

    public Tej(int idl, String name, double salary) {
        this.idl = idl;
        this.name = name;
        this.salary = salary;
    }
     public int compareTo (Tej tj){
        return (this.getSalary()< tj.getSalary())?1:-1;
     }
    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tej{" +
                "idl=" + idl +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Tej> list= new ArrayList<Tej>();
        list.add(new Tej(100,"Jiten",100));
        list.add(new Tej(200,"Tej",100000));
        list.add(new Tej(400,"lava",20000));
        list.add(new Tej(300,"jaja",50000));

        display(list);

        Collections.sort(list);
        System.out.println("sorted list");
         display(list);
        System.out.println("Max Salary:"+Collections.max(list));
        System.out.println("Min salary: "+Collections.min(list));

    }

    private static void display(List<Tej>list){
        for (Tej tj:list)
        {
            System.out.print("ID: "+tj.getIdl());
            System.out.print("\tName: "+tj.getName());
            System.out.println("\t\tSalary: "+tj.getSalary());


        }

    }

}


