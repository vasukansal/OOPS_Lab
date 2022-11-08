import java.util.Scanner;

public class Exp2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Enter the string - ");
        str = sc.nextLine();
        sc.close();
        capital(str);
    }

    public static void capital(String str) {
        StringBuffer stb = new StringBuffer();
        stb.append(str);
        for (int i = 0; i < stb.length(); i++) {
            char a;
            a = stb.charAt(i);
            if (96 < a && a < 128) {
                a = (char) (a - 32);
                String c = Character.toString(a);
                stb.replace(i, i + 1, c);
            }
        }
        System.out.println(stb);
    }
}
