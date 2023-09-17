// *Текст задачи:**
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class sem14 
{
    
public static void arrList() 
    {
        Long start = System.currentTimeMillis();
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) 
            {
            list.add(random.nextInt(100));
            }
        Long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
    }



    public class sem14  
    {
        
    public static void linList() 
    {
        Long start = System.currentTimeMillis();
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) 
            {
            list.add(random.nextInt(100));
            }
        Long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
    } 
} 

  List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0,i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }
