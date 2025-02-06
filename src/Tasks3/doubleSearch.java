package Tasks3;

public class doubleSearch {
    public static int bruteForse(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== key) {
                return i;
            }   
        }
        return -1;    
    }

    public static int binarySearshRecursively (double[] sortedArray,double key ){
        return binarySearchRecursively(sortedArray, key,0,sortedArray.length);
    }

    private static int binarySearchRecursively (double[]sortedArray, double key, int low, int hight){

        int middle = ( low + hight)/2;

        if (hight < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        }else if (key < sortedArray[middle]) {
            return binarySearchRecursively(sortedArray,key,low,middle -1);

        }else {
            return binarySearchRecursively(sortedArray, key,middle + 1, hight);

        }
    }
    public static double[] generateRandomArray(int length){
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
}
