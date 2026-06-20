import java.util.Scanner;
class AddRowColumn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("1. insert row ");
        System.out.println("2. insert col ");
        int choice = sc.nextInt();
        if(choice==1){
            int newarr[][] = new int[row+1][col];
            int pos = sc.nextInt();
            for(int i=0;i<pos;i++){
                for(int j=0;j<col;j++){
                    newarr[i][j] = arr[i][j];
                }
            }
            for(int j=0;j<col;j++){
                newarr[pos][j] = sc.nextInt();
            }
            for(int i =pos;i<row;i++){
                for(int j=0;j<col;j++){
                    newarr[i+1][j] = arr[i][j];
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(newarr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}