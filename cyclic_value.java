import java.util.*;
public class cyclic_value {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        System.out.println("Enter the array ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int temp=a[5-1];
        for(int i=5-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=temp;
        System.out.println("Cyclic array is :");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
