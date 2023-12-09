import java.io.*;
import java.util.*;

public class NumberSpiral {

    public static void main(String... args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
           
            int x = sc.nextInt();
            int y = sc.nextInt();
             //check below or above diagnol
            if(x > y){
                //check if row is even or odd
                if(x%2==0){
                    System.out.println(x*x-y+1);
                } else {
                    System.out.println((x-1)*(x-1)+y);
                }
            }
            else{
                //check if column is even or odd
                if(y%2==1){
                    System.out.println(y*y-x+1);
                } else {
                    System.out.println((y-1)*(y-1)+x);
                }
            }
        }

    }
}
