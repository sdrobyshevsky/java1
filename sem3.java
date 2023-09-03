 /*Текст задачи:
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.*/ 

import java.util.Arrays;

public class sem3 
{    
public static void main(String[]args)
    {      
        {
        int[] nums = {3,2,2,3,3,123,123,66,3,23,87,2,1,3,3,8};
        int val = 2;
        int[] tempArr =new int[nums.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if(nums[i] != val)
               {
               tempArr[current++] = nums[i];
               }
        }
        System.out.println(Arrays.toString(tempArr)); 
        }
    }
}       



