import java.util.Scanner;
public class Fibanocci {
    public static void main (String[] args){
        int Num,j=0, k=1, result;
        Scanner Inp=new Scanner(System.in);
        System.out.println("enter a number:");
        Num=Inp.nextInt();
        for (int i=1; i<=Num; i++){
             result=j+k;
             j=k;
             k=result;
             System.out.println(j+ "+" + k + " = " +result);
        }
    }
}
