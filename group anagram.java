import java.util.*;
class GroupAnagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char a[] = arr[i].toCharArray();
                char b[] = arr[j].toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if(Arrays.equals(a,b)){
                    System.out.println(arr[i]+ " "+arr[j]);
                }
            }
        }

    }
}