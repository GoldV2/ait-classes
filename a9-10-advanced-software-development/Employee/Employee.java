package Labs.Employee;

import java.util.ArrayList;
import java.lang.Math;

public class Employee extends Person {
    final private int id;
    private double hourlyPay;
    ArrayList<Integer> ids = new ArrayList<Integer>();
    double workWeek = 40;

    public Employee(String n, int a, double p) {
        super(n, a);
        
        int i = 0;
        while (true) {
            i = (int) (Math.random() * (99999 - 10000)) + 10000;
            if (!ids.contains(i)) {
                break;
            }
        }
        id = i;

        hourlyPay = p;
    }

    public int getId() {
        return id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double giveRaise() {
        hourlyPay *= 1.15;
        return hourlyPay;
    }

    public double payDay(double hours) {
        double extra = hours-workWeek;
        double pay = 0;
        if (extra > 0) {
            pay = (hours-extra)*hourlyPay;
            pay += (extra)*hourlyPay*1.5;
        }
        else {
            pay = hours*hourlyPay;
        }
        return pay;
    }

    public String toString() {
        String s = super.toString();
        s += "\nHourly Pay: " + hourlyPay;
        s += "\nID: " + id;
        return s;
    }

    public boolean equals(Employee other) {
        if (id == other.getId() && name.equals(other.getName())) {
            return true;
        } 
        return false;
    }

}
