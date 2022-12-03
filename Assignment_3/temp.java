public class temp {

    public static void swap(float[] arr, int i, int j) {
        float tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        float[] arr1 = {0,22,43,36,66,5,33,45,78,87,66,55,33,235,547,889,554,2434,6789};

        boolean flag = false;
        long start = System.nanoTime();
        while(!flag){
            for(int i = 0; i<arr1.length-1; i++){
                if(arr1[i] > arr1[i+1]){
                    swap(arr1, i, i+1);
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end-start)/1000000 + "ms");

        


    }
    
}
