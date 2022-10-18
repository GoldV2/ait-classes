import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
        HashMap<String, Integer> r_n = new HashMap<>();
        r_n.put("M", 1000);
        r_n.put("D", 500);
        r_n.put("C", 100);
        r_n.put("L", 50);
        r_n.put("X", 10);
        r_n.put("V", 5);
        r_n.put("I", 1);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a roman numeral: ");
        String numeral = scan.nextLine();

        int r = 0;
        // MMMCMXCIX = 3999
        for (int i = 0; i < numeral.length(); i++) {
            String c = numeral.substring(i, i+1);
            try {
                String a = numeral.substring(i+1, i+2);
                if (r_n.get(c) < r_n.get(a)) {
                    r += r_n.get(a) - r_n.get(c);
                    i++;
                }
                else {
                    r += r_n.get(c);
                }
            } catch(Exception e) {
                r += r_n.get(c);
            }
        }

        System.out.println("Answer: " + r);
        System.out.print("Enter a number: ");

        int num = scan.nextInt();
        TreeMap<Integer, String> n_r = new TreeMap<>(Collections.reverseOrder());
        n_r.put(1000, "M");
        n_r.put(900, "CM");
        n_r.put(500, "D");
        n_r.put(400, "CD");
        n_r.put(100, "C");
        n_r.put(90, "XC");
        n_r.put(50, "L");
        n_r.put(40, "XL");
        n_r.put(10, "X");
        n_r.put(9, "IX");
        n_r.put(5, "V");
        n_r.put(4, "IV");
        n_r.put(1, "I");

        String ans = "";
        for (Map.Entry<Integer, String> entry: n_r.entrySet()) {
            Boolean fits = true;
            while (fits) {
                if (num >= entry.getKey()) {
                    ans += entry.getValue();
                    num -= entry.getKey();
                }
                else {
                    fits = false;
                }
            }
            }
        System.out.println("Answer: " + ans);
        }
    }
}