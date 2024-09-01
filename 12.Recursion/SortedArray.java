public class SortedArray {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1) {  // Base case condition
            return true;
        }

        if(arr[i] > arr[i+1]) {   // Comparing the 1st and 2nd number  
            return false;
        }

        return isSorted(arr, i+1);  // If the above condition is true, mns array no. 1 nd 2 is sorted
                                    // then check if the next(array beyond) 1 n 2 is sorted or not
                                    // Here if the condition return true then our o/p will be true it mns our arr is sorted
    }                              
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr, 0));
    }
}
