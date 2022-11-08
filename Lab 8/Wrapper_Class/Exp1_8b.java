package Wrapper_Class;

public class Exp1_8b {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 2;
        String s = "abcd";
        System.out.println(iI(a));
        System.out.println(IS(b));
        System.out.println(Si("81"));
        System.out.println(iS(a));
        System.out.println(SI("5"));
        System.out.println(Ii(b));
    }

    public static Integer iI(int a) {
        Integer ans = a;
        return ans;
    }

    public static String IS(Integer a) {
        int b = a;
        String ans = Integer.toString(b);
        return ans;
    }

    public static int Si(String a) {
        int ans = Integer.valueOf(a);
        return ans;
    }

    public static String iS(int a) {
        String ans = Integer.toString(a);
        return ans;
    }

    public static Integer SI(String a) {
        int b = Integer.valueOf(a);
        Integer ans = b;
        return ans;
    }

    public static int Ii(Integer a) {
        int ans = a;
        return ans;
    }
}
