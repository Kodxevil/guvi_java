import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean f=false;
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                System.out.print(i+1);
                f=true;
            }
        }
        if(!f){
            System.out.println("-1");
        }
    }
}