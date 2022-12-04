package org.example.PartA;

import java.util.concurrent.ThreadLocalRandom;

class singleProcess {
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
}

class multiProcess1 extends Thread{

    float[] arr;
    int start;
    int end;

    public multiProcess1(float[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }
            for (int i = 0; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }

        }
    }
}

class multiProcess2 extends Thread{

    float[] arr;
    int start;
    int end;

    public multiProcess2(float[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }
            for (int i = 0; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }

        }
    }
}

class multiProcess3 extends Thread{

    float[] arr;
    int start;
    int end;

    public multiProcess3(float[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }
            for (int i = 0; i < end - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    singleProcess.swap(arr, i, i + 1);
                    flag = false;
                }
            }

        }
    }
}



public class partA{
    static singleProcess sp = new singleProcess();

    //Main method
    public static void main(String[] args) throws Exception {

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

        //With Parallelization Algo Time Complexity

        // Array 1
        long start1a = System.nanoTime();
        multiProcess1 mp1 = new multiProcess1(arr1, 0, arr1.length);
        mp1.start();
        long end1a = System.nanoTime();
        long timeElapsed1a = end1a - start1a;

        long start1b = System.nanoTime();
        multiProcess2 mp2 = new multiProcess2(arr1, 0, arr1.length);
        mp2.start();
        long end1b = System.nanoTime();
        long timeElapsed1b = end1b - start1b;

        long start1c = System.nanoTime();
        multiProcess3 mp3 = new multiProcess3(arr1, 0, arr1.length);
        mp3.start();
        long end1c = System.nanoTime();
        long timeElapsed1c = end1c - start1c;

        // Array 2
        long start2a = System.nanoTime();
        multiProcess1 mp4 = new multiProcess1(arr2, 0, arr2.length);
        mp4.start();
        long end2a = System.nanoTime();
        long timeElapsed2a = end2a - start2a;

        long start2b = System.nanoTime();
        multiProcess2 mp5 = new multiProcess2(arr2, 0, arr2.length);
        mp5.start();
        long end2b = System.nanoTime();
        long timeElapsed2b = end2b - start2b;

        long start2c = System.nanoTime();
        multiProcess3 mp6 = new multiProcess3(arr2, 0, arr2.length);
        mp6.start();
        long end2c = System.nanoTime();
        long timeElapsed2c = end2c - start2c;

        // Array 3
        long start3a = System.nanoTime();
        multiProcess1 mp7 = new multiProcess1(arr3, 0, arr3.length);
        mp7.start();
        long end3a = System.nanoTime();
        long timeElapsed3a = end3a - start3a;

        long start3b = System.nanoTime();
        multiProcess2 mp8 = new multiProcess2(arr3, 0, arr3.length);
        mp8.start();
        long end3b = System.nanoTime();
        long timeElapsed3b = end3b - start3b;

        long start3c = System.nanoTime();
        multiProcess3 mp9 = new multiProcess3(arr3, 0, arr3.length);
        mp9.start();
        long end3c = System.nanoTime();
        long timeElapsed3c = end3c - start3c;

        // Array 4
        long start4a = System.nanoTime();
        multiProcess1 mp10 = new multiProcess1(arr4, 0, arr4.length);
        mp10.start();
        long end4a = System.nanoTime();
        long timeElapsed4a = end4a - start4a;

        long start4b = System.nanoTime();
        multiProcess2 mp11 = new multiProcess2(arr4, 0, arr4.length);
        mp11.start();
        long end4b = System.nanoTime();
        long timeElapsed4b = end4b - start4b;

        long start4c = System.nanoTime();
        multiProcess3 mp12 = new multiProcess3(arr4, 0, arr4.length);
        mp12.start();
        long end4c = System.nanoTime();
        long timeElapsed4c = end4c - start4c;

        // Array 5
        long start5a = System.nanoTime();
        multiProcess1 mp13 = new multiProcess1(arr5, 0, arr5.length);
        mp13.start();
        long end5a = System.nanoTime();
        long timeElapsed5a = end5a - start5a;

        long start5b = System.nanoTime();
        multiProcess2 mp14 = new multiProcess2(arr5, 0, arr5.length);
        mp14.start();
        long end5b = System.nanoTime();
        long timeElapsed5b = end5b - start5b;

        long start5c = System.nanoTime();
        multiProcess3 mp15 = new multiProcess3(arr5, 0, arr5.length);
        mp15.start();
        long end5c = System.nanoTime();
        long timeElapsed5c = end5c - start5c;

        System.out.println("Time Complexity of Parallelized Algo: \n");
        System.out.println("Array 1: " + "Thread 1: " + timeElapsed1a + "ns" + " Thread 2: " + timeElapsed1b + "ns" + " Thread 3: " + timeElapsed1c + "ns");
        System.out.println("Array 2: " + "Thread 1: " + timeElapsed2a + "ns" + " Thread 2: " + timeElapsed2b + "ns" + " Thread 3: " + timeElapsed2c + "ns");
        System.out.println("Array 3: " + "Thread 1: " + timeElapsed3a + "ns" + " Thread 2: " + timeElapsed3b + "ns" + " Thread 3: " + timeElapsed3c + "ns");
        System.out.println("Array 4: " + "Thread 1: " + timeElapsed4a + "ns" + " Thread 2: " + timeElapsed4b + "ns" + " Thread 3: " + timeElapsed4c + "ns");
        System.out.println("Array 5: " + "Thread 1: " + timeElapsed5a + "ns" + " Thread 2: " + timeElapsed5b + "ns" + " Thread 3: " + timeElapsed5c + "ns");

        System.out.println();

        System.out.println("Average Time Complexity of Parallelized Algo: \n");
        System.out.println("Array 1: " + (timeElapsed1a + timeElapsed1b + timeElapsed1c)/3 + "ns");
        System.out.println("Array 2: " + (timeElapsed2a + timeElapsed2b + timeElapsed2c)/3 + "ns");
        System.out.println("Array 3: " + (timeElapsed3a + timeElapsed3b + timeElapsed3c)/3 + "ns");
        System.out.println("Array 4: " + (timeElapsed4a + timeElapsed4b + timeElapsed4c)/3 + "ns");
        System.out.println("Array 5: " + (timeElapsed5a + timeElapsed5b + timeElapsed5c)/3 + "ns");

        System.out.println();

        System.out.println("------------------------------------------------------------------");
        //----------------------------------------------------------------------------------------------------------

        //Without Parallelization Algo Time Complexity
        System.out.println();
        System.out.println("Time Complexity without Parallelization: \n");

        // Array 1
        long start1 = System.nanoTime();
        sp.oddEvenTranspositionSortSeries(arr1);
        long end1 = System.nanoTime();
        long arr1Time = (end1 - start1);
        System.out.println("Array 1: " + arr1Time + "ns");

        // Array 2
        long start2 = System.nanoTime();
        sp.oddEvenTranspositionSortSeries(arr2);
        long end2 = System.nanoTime();
        long arr2Time = (end2 - start2);
        System.out.println("Array 2: " + arr2Time + "ns");

        // Array 3
        long start3 = System.nanoTime();
        sp.oddEvenTranspositionSortSeries(arr3);
        long end3 = System.nanoTime();
        long arr3Time = (end3 - start3);
        System.out.println("Array 3: " + arr3Time + "ns");

        // Array 4
        long start4 = System.nanoTime();
        sp.oddEvenTranspositionSortSeries(arr4);
        long end4 = System.nanoTime();
        long arr4Time = (end4 - start4);
        System.out.println("Array 4: " + arr4Time + "ns");

        // Array 5
        long start5 = System.nanoTime();
        sp.oddEvenTranspositionSortSeries(arr5);
        long end5 = System.nanoTime();
        long arr5Time = (end5 - start5);
        System.out.println("Array 5: " + arr5Time + "ns");
    }
}
