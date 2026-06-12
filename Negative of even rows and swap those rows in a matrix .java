import java.util.Scanner;
class negateevenrows{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i+=2){
            for(int j=0;j<n;j++){
                arr[i][j]=-arr[i][j];
            }
            
        }

        for(int i=n-1;i>=0;i--){
            
            for(int j=0;j<n;j++){
                
                System.out.print(arr[i][j]);
                
            }
            System.out.println();
        }

    }
}