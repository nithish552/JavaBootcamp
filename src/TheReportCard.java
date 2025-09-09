import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int mark=in.nextInt();
        if(mark>=90){
            System.out.println("A");
        }
        else if(mark>=75 && mark<90){
            System.out.println("B");
        }
        else if(mark>=50 && mark<75){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }

    }
}