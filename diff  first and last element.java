import java.util.*;
class DiffFirstLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        int last = arr[n-1];
        for(int i=0;i<n;i++){
            int diff = Math.abs(first - last);
            System.out.println(diff + " ");
        }
    }
}