import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int time1=in.nextInt();
        int time2=in.nextInt();
        if(time1>time2){
            System.out.println("Varun");
        }
        else if(time1<time2){
            System.out.println("Arjun");
        }
        else{
            System.out.println("Tie");
        }
    }
}