// Текст задачи:
// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class sem11 
{
 
    public static void main(String[] args)  
    {
    Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) 
            {
            array.add(random.nextInt(100, 200));
            }
        Collections.sort(array);
        System.out.println(array);
    }
}