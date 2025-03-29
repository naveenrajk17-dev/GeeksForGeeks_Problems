public class Second_Largest {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;

        if(n<2){
            return -1;
        }

        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];

            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max=arr[i];
            }
        }

        return sec_max==Integer.MIN_VALUE ? -1:sec_max;
    }
    public static void main(String arg[]){
        Second_Largest sm=new Second_Largest();
        int[] arr={8,7,5,4,3,1,2};
        System.out.println(sm.getSecondLargest(arr));
    }
}
