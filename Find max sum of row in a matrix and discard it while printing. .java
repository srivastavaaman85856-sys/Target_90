import java.util.*;
class MaxRowSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] =  new int[n][n];
        int maxsum = 0;
        int maxrow = -1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                
            }
            
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
                
            }
            if(sum>maxsum){
                    maxsum=sum;
                    maxrow=i;
            }
        }
        System.out.println("after removing max row ");
        for(int i=0;i<n;i++){
            if(i==maxrow)
            continue;
            for(int j=0;j<n;j++){
               
                System.out.print(arr[i][j]+ " ");
                
            }
             System.out.println();
            
        }
       



    }
}