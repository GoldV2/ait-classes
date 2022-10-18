package Labs.Employee;

public class Main{
    public static void main(String[] args) {
        Person p = new Person("Rafael", 17);
        System.out.println("-------------");
        System.out.println(p);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println("-------------");
        Employee e = new Employee("Deejunae", 16, 13.24);
        System.out.println(e);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getId());
        System.out.println(e.getHourlyPay());
        System.out.println(e.giveRaise());
        System.out.println(e.getHourlyPay());
        System.out.println(e.payDay(10));
        System.out.println(e.payDay(40));
        System.out.println(e.payDay(50));
        System.out.println("-------------");
        Employee e2 = new Employee("Adriana", 42, 15.24);
        System.out.println(e2);
        System.out.println(e2.getName());
        System.out.println(e2.getAge());
        System.out.println(e2.getId());
        System.out.println(e2.getHourlyPay());
        System.out.println(e2.giveRaise());
        System.out.println(e2.getHourlyPay());
        System.out.println(e2.payDay(10));
        System.out.println(e2.payDay(40));
        System.out.println(e2.payDay(50));
        System.out.println("-------------");
        System.out.println(e.equals(e2));
        System.out.println(e.equals(e));
    }
}