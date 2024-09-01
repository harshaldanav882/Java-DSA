public class LastOccurence1 {
    public static int lastOccurence(int arr[], int key, int i) {
        // Base Case condition
        if(i==arr.length) {
            return -1;
        }
        // Looking Forward
        int isFound = lastOccurence(arr, key, i+1);
            if(isFound != -1) {
                return isFound;
            }
        // Checking with self
            if(arr[i]==key) {
                return i;
            }
            return isFound;
        }
        public static void main(String[] args) {
            int arr[] = {8,5,3,6,9,5,10,2,7,3};
            System.out.println(lastOccurence(arr, 5, 0));
        }
    }
 
