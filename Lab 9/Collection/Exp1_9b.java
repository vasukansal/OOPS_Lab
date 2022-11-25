package Collection;

import java.util.*;

public class Exp1_9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
        System.out.println("Original ------- ");
        System.out.println(arr);
        ArrayList<String> dupli = new ArrayList<String>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            dupli.add(arr.get(i));
        }
        System.out.println("reversed -------- ");
        System.out.println(dupli);
    }
}
