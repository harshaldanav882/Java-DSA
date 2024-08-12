import java.util.Arrays;
import java.util.Collections;;

public class InbuiltSort {

    public static void printArr(Integer arr[]) {
        for(Integer i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
   
    
    //Ascending Order

    // int arr[] = {5,4,1,3,2};
    // Arrays.sort(arr);
    // Arrays.sort(arr, 0, 3);


    //Descending Order

    Integer arr[] = {5,4,1,3,2};
    // Arrays.sort(arr, Collections.reverseOrder());
    Arrays.sort(arr,0,3, Collections.reverseOrder());
    printArr(arr);
    
    }
}
