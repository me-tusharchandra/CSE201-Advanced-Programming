import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main{

    public static void oddEvenTranspositionSortSeries(float[] arr) { 
        // Source: https://www.youtube.com/watch?v=5-xExK9Wf1o
        int n = arr.length;
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = false;
                }
            }
            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = false;
                }
            }
        }
    }

    public static void swap(float[] arr, int i, int j) {
        float tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // ------------------------------

    //Main method
    public static void main(String[] args) {

        // Declare arrays
        float[] arr1 = new float[1];
        float[] arr2 = new float[10];
        float[] arr3 = new float[100];
        float[] arr4 = new float[1000];
        float[] arr5 = new float[10000];

        // Fill arrays with random numbers
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (float) Math.round((ThreadLocalRandom.current().nextFloat(0,10))*1000)/1000;
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (float) Math.round((ThreadLocalRandom.current().nextFloat(0,10))*1000)/1000;
        }

        for(int i = 0; i < arr3.length; i++){
            arr3[i] = (float) Math.round((ThreadLocalRandom.current().nextFloat(0,10))*1000)/1000;
        }

        for(int i = 0; i < arr4.length; i++){
            arr4[i] = (float) Math.round((ThreadLocalRandom.current().nextFloat(0,10))*1000)/1000;
        }

        for(int i = 0; i < arr5.length; i++){
            arr5[i] = (float) Math.round((ThreadLocalRandom.current().nextFloat(0,10))*1000)/1000;
        }


        //Without Parallelization Algo Time Complexity

        // Array 1
        long start1 = System.nanoTime();
        oddEvenTranspositionSortSeries(arr1);
        long end1 = System.nanoTime();
        long arr1Time = (end1 - start1)/1000000;
        // System.out.println("Array 1: " + arr1Time);

        // Array 2
        long start2 = System.nanoTime();
        oddEvenTranspositionSortSeries(arr2);
        long end2 = System.nanoTime();
        long arr2Time = (end2 - start2)/1000000;
        // System.out.println("Array 2: " + arr2Time);

        // Array 3
        long start3 = System.nanoTime();
        oddEvenTranspositionSortSeries(arr3);
        long end3 = System.nanoTime();
        long arr3Time = (end3 - start3)/1000000;
        // System.out.println("Array 3: " + arr3Time);

        // Array 4
        long start4 = System.nanoTime();
        oddEvenTranspositionSortSeries(arr4);
        long end4 = System.nanoTime();
        long arr4Time = (end4 - start4)/1000000;
        // System.out.println("Array 4: " + arr4Time);

        // Array 5
        long start5 = System.nanoTime();
        oddEvenTranspositionSortSeries(arr5);
        long end5 = System.nanoTime();
        long arr5Time = (end5 - start5)/1000000;
        System.out.println("Array 5: " + arr5Time);



    }
}
