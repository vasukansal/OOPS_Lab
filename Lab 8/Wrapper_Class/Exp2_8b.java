package Wrapper_Class;

public class Exp2_8b {
    public static void main(String[] args) {
        fF(0);
        FS(null);
        SF(null);
        fS(0);
        SF(null);
        Ff(null);
    }

    public static void fF(float a) {
        Float ans = Float.valueOf(a);
        System.out.println(ans);
    }

    public static void FS(Float a) {
        String ans = a.toString();
        System.out.println();
    }

    public static void Sf(String a) {
        float ans = Float.parseFloat(a);
        System.out.println(ans);
    }

    public static void fS(float a) {
        String ans = String.valueOf(a);
        System.out.println(ans);
    }

    public static void SF(String a) {
        Float ans = Float.valueOf(a);
        System.out.println(ans);
    }

    public static void Ff(Float a) {
        float ans = a.floatValue();
    }
}
