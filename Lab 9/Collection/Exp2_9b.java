package Collection;

import java.util.*;

public class Exp2_9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> mm = new HashMap<Integer, String>();
        mm.put(1, "A");
        mm.put(2, "B");
        mm.put(3, "C");
        System.out.println("Enter the key to search");
        Integer n = sc.nextInt();
        int count = 0;
        for (Map.Entry m : mm.entrySet()) {
            if (m.getKey() == n) {
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println("Key is Present");
        } else {
            System.out.println();
        }
        String v;
        System.out.println("Enter the value to search");
        v = sc.next();
        sc.close();
        if (mm.containsValue(v)) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value does not exists");
        }
        for (Map.Entry m : mm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
