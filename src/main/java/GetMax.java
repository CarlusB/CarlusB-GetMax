public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        //for loop is not required, just more simple
        int counter = 1;
        int arrMax = arr[0];

        while(counter != arr.length){
            if(arr[counter] > arrMax){
                arrMax = arr[counter];
            }
            counter++;
        }

        /*
         * for(int i = 1; i < arr.length; i++){
         *     if(arr[i] > arrMax){
         *         arrMax = arr[counter];
         *     }
         * }
         */
        
        return arrMax;
    }
}
