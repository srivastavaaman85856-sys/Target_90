import java.util.*;
class LongestSubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLen =0;
        for(int i=0;i<s.length();i++){
            String temp = "";
            for(int j=i;j<s.length();j++){
                 char ch = s.charAt(j);
                 boolean visited = false;
                for(int k=0;k<temp.length();k++){
                    if(temp.charAt(k)==ch){
                        visited = true;
                        break;

                    }
                }
                if(visited)
                    break;
                    
                
                temp+=ch;
                if(temp.length() > maxLen)
                    maxLen = temp.length();
            }
           
           
           
        }
         System.out.println(maxLen);
    }
}