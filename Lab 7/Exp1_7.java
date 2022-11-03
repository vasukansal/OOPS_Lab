import java.util.Scanner;
//Experiment 1 of lab 7
public class Exp1_7 {

    void input(){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] names=new String[10];
        int[] rollno=new int[10];
        try{
            for(int i=0;i<n;i++){
                names[i]=sc.next();
                rollno[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Max. student limit is 10");
        }
    }
}
