import java.util.Arrays;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] list, int key){
        return binarySearch(list, key, 0, list.length - 1);
    }

    public static int binarySearch(int[] list, int key, int low, int high){

        if (low > high){
            return -low - 1;
        }

        int mid = (high + low) / 2;

        if(key < list[mid]){
            return binarySearch(list, key, low, mid - 1);
        }else if(key == list[mid]){
            return mid;
        }else{
            return binarySearch(list, key, mid + 1, high);
        }
    }

    public static void main(String[] args){
        int[] list = {3, 4, 1, 8, 2, 6, 9, 7, 5};
        Arrays.sort(list);

        System.out.println("Index of 8 in list is: " + binarySearch(list, 8));
    }
}
