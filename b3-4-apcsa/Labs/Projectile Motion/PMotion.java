import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class PMotion {
    static String option = "";
    static Scanner scan = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {        
        HashMap<String, Runnable> options = createOptions(); 

        while (true) {
            option += askAxis();
            option += askEqu();
            option += askVar();
            options.get(option).run();
    
            count ++;
            System.out.println("You have solved " + count + " problem(s).");
            option = "";    
        }
        
    }

    public static HashMap<String, Runnable> createOptions() {
        HashMap<String, Runnable> options = new HashMap<String, Runnable>();
        
        Method[] equations = Equations.class.getDeclaredMethods();
        for (Method equ : equations) {
            if (equ.getName().indexOf("pm") != -1) {
                Runnable fun = () -> {
                    try {
                        equ.invoke(null, null);
                    } 
                    catch (IllegalAccessException e) {}
                    catch (IllegalArgumentException e) {}
                    catch (InvocationTargetException e) {}
                };
                options.put(equ.getName().substring(2), fun);
            }        
        }

        return options;
    }

    public static String askAxis() {
        System.out.print("Enter the axis of your equation, y or x\n>>> ");
        return scan.nextLine();
    }

    public static String askEqu() {
        if (option.equals("x")) {
            return "1";
        }

        else {
            System.out.println("1: Vfy = Viy + gt");
            System.out.println("2: Δy = Viyt + 1/2gt^2");
            System.out.println("3: Vfy^2 = Viy^2 + 2gΔy");
            System.out.print("Enter the respective number for the equation you need\n>>> ");
            return scan.nextLine();
        }
    }

    public static String askVar() {
        System.out.println("Enter the variable you want to solve for");
        System.out.print("i.e. x, y, Vix, Viy, Vfy, t\n>>> ");
        return scan.nextLine();
    }

}