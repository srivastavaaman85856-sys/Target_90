import java.util.*;
class StringCompression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        int count =1;
        for(int i=0;i<s.length();i++){
            count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
             System.out.print(s.charAt(i)+""+count);
           
        }
       
    }
}