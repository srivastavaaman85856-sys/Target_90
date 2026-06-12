import java.util.*;
class Leaders{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int leader = arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]>leader){
                leader = arr[i];
                
            }
        }
        System.out.println( leader);
    

    }
}