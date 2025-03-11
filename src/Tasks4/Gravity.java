package Tasks4;

public class Gravity {


    public static int[] flip(char dir, int[] arr) {


        if (dir == 'R') {
            for (int j = 0; j < arr.length; j++)
                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k] > arr[k + 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                }

        }
        if (dir == 'L'){
            for (int j = 0; j < arr.length; j++)
                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k] < arr[k + 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                }


        }
        return arr;
    }
}

