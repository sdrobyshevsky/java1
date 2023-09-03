    /*Текст задачи:
Дан массив двоичных чисел,
например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/

public class sem2 
{    
public static void main(String[]args)
    { 
  
        int[] arr = {1, 0, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
            } if(arr[i] == 0 || i == arr.length - 1){
                if(count > maxOnes){
                    maxOnes = count;
                }
                count = 0;
            }

        }
        System.out.println(maxOnes);
    }
}