import java.util.Scanner;
class palindromestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String r = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        } 
        for(int i=str.length()-1;i>=0;i--){
            r +=str.charAt(i);
        }
        if(str.equals(r)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
        

    }
    
}
