import java.util.Random;
import java.util.*;
public class rockpaperscissor {
    public static void main(String[] args) {
        Random r=new Random();
        int ran=r.nextInt(3);
        for(int i=1;i<=5;i++){
            System.out.println("0 For rock\n1 For paper\n2 For scissor");
            System.out.println("Computer has generated its random number... Please Enter your Choice:-");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt(3);
            System.out.print("Player Move is:- ");
            System.out.println(a);
            System.out.print("Computer move is:- ");
            System.out.println(ran);
            if(ran==a){
                System.out.println("Match has been tied!!");
            }
            else if(a==0 && ran==1){
                System.out.println("Computer wins!!");
            }
            else if(a==1 && ran==2){
                System.out.println("Computer Wins!!");
            }
            else if(a==2 && ran==0){
                System.out.println("Computer Wins!!");
            }
            else if(a==1 && ran==0){
                System.out.println("Player wins!!");
            }
            else if(a==2 && ran==1){
                System.out.println("Player Wins!!");
            }
            else{
                System.out.println("Player Wins!!");
            }
        }
    }
}