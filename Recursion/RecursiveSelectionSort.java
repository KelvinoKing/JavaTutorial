public class RecursiveSelectionSort {
    
    public static void sort(double list[]){
        sort(list, 0, list.length - 1);
    }

    public static void sort(double list[], int low, int high){

        if (low < high){

            int indexOfMin = low;
            double min = list[low];
            for(int i = low + 1; i <= high; i++){
                if (list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args){

        double[] list = {8.9, 2.4, 6, 7.8, 2.4, 10.2, 1, 4.6};

        System.out.print("Array bofore sorting: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }

        System.out.println();
        sort(list);

        System.out.print("Array after sorting: ");
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }
}
