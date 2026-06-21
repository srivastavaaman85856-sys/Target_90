import java.util.*;
class ReverseStringUsingStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }


    }
}