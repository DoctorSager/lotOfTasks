// Реализуйте алгоритм сортировки 
//пузырьком для сортировки массива

public class Task2 {
    

    static void sortArray(){

        int number = 100;
        double[] array = new double[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*100;
            //System.out.println(array[i]);
        }
        bubblesort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    static void bubblesort(double[] array){

        int n = array.length;
        for (int j = 1; j < n; j++) {
            boolean isSorted = true;
            for (int i = 0; i < n-j; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] + array[i+1];
                    array[i+1] = array[i] - array[i+1];
                    array[i] = array[i] - array[i+1];
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        
    }
    

    
}
