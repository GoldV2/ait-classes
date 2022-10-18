package Labs.Employee;

public class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String s = "Name: " + name;
        s += "\nAge: " + age; 
        return s;
    }
}
