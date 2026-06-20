import java.util.Scanner;
class RotateString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        }
        int k = sc.nextInt();
        k = k % str.length();
        for(int i=k;i<str.length();i++){
            result+=str.charAt(i);
        }
        for(int i=0;i<k;i++){
            result+=str.charAt(i);
        }
        System.out.println(result);

    }
}