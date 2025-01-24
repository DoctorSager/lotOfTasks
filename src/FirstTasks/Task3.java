package FirstTasks;

// Напишите программу, которая выводит на консоль простые числа
// в промежутке от [2, 100].
// Используйте для решения этой задачи 
// оператор "%" (остаток от деления) и циклы.


public class Task3 {
    

    static void numbers(){
    int max = 50;


    fillSimpleNumbers( max);

    }

    static void fillSimpleNumbers(int max){
        
       for (int i = 2; i < max + 1; i++) {
        boolean isPrime = true;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(i + ",");
        }
        
       }
            
    }
}
