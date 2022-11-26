package Collection;

import java.util.*;

public class Exp3_9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        System.out.println("ARRAYLIST ------");
        System.out.println(arr);
        HashSet<Integer> sett = new HashSet<Integer>();
        for (int j = 3; j >= 0; j--) {
            sett.add(arr.get(j));
        }
        System.out.println("COPIED HASJSET ------");
        System.out.println(sett);
        sett.clear();
        System.out.println("HASHSETT CLEARED --");
        System.out.println(sett);
        System.out.print("Enter the no. to search - ");
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        Iterator<Integer> i = sett.iterator();
        while (i.hasNext()) {
            count++;
        }
        if (count == 0) {
            System.out.println("NOT PRESENT");
        }
        if (count > 0) {
            System.out.println("Present");
        }
    }
}
