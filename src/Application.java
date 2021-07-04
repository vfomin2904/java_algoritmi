import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10000);
        }
        long start = System.currentTimeMillis();
        bubble(arr); // 15371 ms
//        selection(arr); // 3949 ms
//        insert(arr); //1019 ms
        long end = System.currentTimeMillis();
        System.out.println((end-start)+" ms");
    }

    public static void bubble(int[] arr){
        for(int i = arr.length-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j+1, j);
                }
            }
        }
    }

    public static void selection(int[] arr){
        int min;
        for(int i = 0; i < arr.length; i++){
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void insert(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            int el = arr[i];
           while(j > 0 && arr[j-1] > el){
               arr[j] = arr[j-1];
               j--;
           }
           arr[j] = el;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int el = arr[i];
        arr[i] = arr[j];
        arr[j] = el;
    }
}
