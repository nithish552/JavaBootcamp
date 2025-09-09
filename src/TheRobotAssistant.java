import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int op=in.nextInt();
        if(op==1){
            System.out.println(a+b);
        }
        else if(op==2){
            System.out.println(a-b);
        }
        else if(op==3){
            System.out.println(a*b);
        }
        else if(op==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid Operator Number");
        }

    }
}