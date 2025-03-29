import java.util.Arrays;

public class Missing_in_Array {
    int missingNumber(int arr[]) {
        int k=0;
        while (k<arr.length){
            if(arr[k]>0 && arr[k]<=arr.length && arr[k]!=arr[arr[k]-1]){
                swap(arr,k,arr[k]-1);
            }
            else{
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
    void swap(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String arg[]){
        Missing_in_Array m=new Missing_in_Array();
        int[] arr={8,7,5,4,3,1,2};
        System.out.println(m.missingNumber(arr));
    }
}

