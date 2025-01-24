// Заполните массив случайным числами 
//и выведите максимальное, минимальное и среднее значение.

public class Task1 {
    
    static void maxMidMinNumber(){

        int n = 100;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        sort(array, 0,  array.length - 1);
      
        System.out.println("Найти минимальное, среднее, максимальное значения:");
        System.out.println("Min = " + array[0]);
        System.out.println("Middle = " + array[array.length/2]);
        System.out.println("Max = " + array[array.length-1]);

    }

    static void sort (double[] array, int low, int hight){
 
        if (array.length == 0 || low >= hight ) return;

        int middle = low + (hight - low) / 2;
        double border = array[middle];
        int i = low , j = hight;

        while (i <= j) {

            while (array[i] < border) i ++;
            while (array[j] > border) j--;
                if (i <= j) {
                double swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
                } 
            if (low < j) sort(array, low, j);
            if (hight > i) sort(array, i, hight);          
            }
    }
}
