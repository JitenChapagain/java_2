public class Abs {
    public static void main(String[] args) {
        Emp list[]=new Emp[3];
        list [0]=new FullTime(1,"Ankit",2,2000);
        list [1]=new PartTime(2,"Arjun",5,30000);

        for (Emp e:list){
            System.out.println(e.getsalary());
        }
    }
} abstract class Emp{
    private int id;
    private String name;
    private int work_hours;

    public Emp(int id, String name, int work_hours) {
        this.id = id;
        this.name = name;
        this.work_hours = work_hours;
    }
    public abstract float getsalary();
    public int getWork_hours(){
        return work_hours;
    }

    @Override
    public String toString() {
    return "Emp{" +"id=" + id +", name='" + name + '\'' +", work_hours=" + work_hours +'}';
    }
}
class FullTime extends Emp{
    float salary;

    @Override
    public float getsalary() {
        return salary;
    }

    public FullTime(int id, String name, int work_hours, float salary) {
        super(id, name, work_hours);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ " FullTime{" +
                "salary=" + salary +
                '}';
    }
}
class PartTime extends Emp{
    float wage_hr;

    public PartTime(int id, String name, int work_hours, float wage_hr) {
        super(id, name, work_hours);
        this.wage_hr = wage_hr;
    }

    @Override
    public float getsalary() {
        return wage_hr*getWork_hours();
    }
}


