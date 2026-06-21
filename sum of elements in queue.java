import java.util.*;
class SumElementsByQueue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new  LinkedList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            q.add(x);
            sum+=x;

        }
        System.out.println(sum);
    }

}