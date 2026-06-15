import java.util.*;
class Containermostwater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        int maxwater = 0;
        while(left<right){
            int h;
            if(height[left]<height[right]){
                h = height[left];
            }
            else{
                h = height[right];
            }
            int width = right-left;
            int area = h*width;
            if(area>maxwater){
                maxwater = area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxwater);
        sc.close();
    }
}