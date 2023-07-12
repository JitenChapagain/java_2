

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable implements Comparable<comparable> {
    int id;
    String name;
    double salary;

    public comparable(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int compareTo(comparable eob){
        //return ((this.getName().compareTo(eob.getName()))>0)?1:-1;
        return (this.getSalary()>eob.getSalary())?1:-1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static void main(String[] args) {
        List<comparable> list = new ArrayList<>();
        list.add(new comparable(1,"Arjun",45000.0f));
        list.add(new comparable(2,"Shyam",2900.0));
        list.add(new comparable(3,"Milan",90000.0));
        list.add(new comparable(4,"Karun",90000.0));
        list.add(new comparable(5,"Lili",451.2));
        display(list);

        Collections.sort(list);
        System.out.println("Sorted list:");
        System.out.println("\n");
        display(list);

        comparable c = Collections.max(list);
        System.out.println(c.getName());
    }
    private static void display(List<comparable>list)
    {
        for(comparable e:list){
            System.out.print("ID: "+e.getId());
            System.out.print("\tName: "+e.getName());
            System.out.println("\t\tSalary: "+e.getSalary());
        }
    }
}






