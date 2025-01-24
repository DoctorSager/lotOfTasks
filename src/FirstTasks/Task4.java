package FirstTasks;

import java.util.Arrays;

public class Task4 {
    
    public static void deleteFromArray (){

        int[] fullArray = {2,2,4,4,4,2,2,2};

        System.out.println(Arrays.toString(fullArray));
        
        System.out.println(Arrays.toString(delete(fullArray, 2)));
        
    }

    static int[] delete(int[] array, int numberForDelete){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != count) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(array[i] == numberForDelete){
                offset++;
            } else{
                newArray[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(newArray, array.length -offset);
    }
    }




