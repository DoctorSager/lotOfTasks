package FirstTasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// Реализуйте алгоритм сортировки 
//пузырьком для сортировки массива

public class Task2 {
    

    static void sortArray(){

        int number = 10;
        int[] array = new int[number];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(number);
            //System.out.println(array[i]);
        }
        bubblesort(array);
        System.out.println(Arrays.toString(array));
        

    }

    static void bubblesort(int[] array){

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
