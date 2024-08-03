import java.util.*;

public class DisplayNumberUptoARange{
    public static void main(String[] gg){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the range upto which you want numbers to display: ");

        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            System.out.print(i + " ");
        }
    }
}