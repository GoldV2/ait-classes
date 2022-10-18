import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
        a.add(new ArrayList<String>());
        a.get(0).add("1");
        create(a, 0, 66);
    }

    public static void create(ArrayList<ArrayList<String>> a, int c, int e) {
        if (c == e) {
            write(addNL(format(a)));
            return;
        }
        ArrayList<String> n = new ArrayList<String>();
        n.add("1");
        long l = 1;
        for (int i = 1; i < a.size(); i++) {
            long val = Long.parseLong(a.get(a.size()-1).get(i));
            n.add(String.valueOf(l + val));
            l = val;
        }
        n.add("1");
        a.add(n);
        create(a, c+1, e);
    }

    public static ArrayList<String> format(ArrayList<ArrayList<String>> a) {
        int l = combine(a.get(a.size()-1)).length();
        ArrayList<String> af = new ArrayList<String>();
        for (ArrayList<String> r : a) {
            String combined = combine(r);
            int s = (l-combined.length())/2;
            af.add(multiply(" ", s) + combined + multiply(" ", s));
        }
        return af;
    }

    public static String addNL(ArrayList<String> a) {
        String f = "";
        for (String s : a) {
            f += s + "\n";
        }
        return f;
    }

    public static void write(String a) {
        try {
            FileWriter myWriter = new FileWriter("results.txt");
            myWriter.write(a);
            myWriter.close();
          } catch (IOException e) {}
    }

    public static String combine(ArrayList<String> r) {
        String f = "";
        for (String v: r) {
            f += v + " ";
        }
        return f;
    }

    public static String multiply(String s, int l) {
        String r = "";
        for (int i = 0; i < l; i++) {
            r += " ";
        }
        return r;
    }

}