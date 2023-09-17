// Текст задачи:
// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class sem12 
{ 
public static void main(String[] args)  
{
        List list = new ArrayList(List.of("afdfa", 34, "sfdgfg", "sfg", 25, 100));
        System.out.println(list);
        list.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));
       for (int i = 0; i < list.size(); i++)
           {
           if (list.get(i).getClass().getSimpleName().equals("Integer")) 
               {
               list.remove(i);
               i--;
               }
           }
        System.out.println(list);
}
}



ArrayList arrayList = new ArrayList<>();

        arrayList.add(34);
        arrayList.add("fdsg");
        arrayList.add(674);
        arrayList.add("dshgsehd");
        arrayList.add(0);
        arrayList.add(844);

        arrayList.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));

//        for (int i = 0; i < arrayList.size(); i++) {
//           if(arrayList.get(i) instanceof Integer){
//               arrayList.remove(i);
//               i--;
//           }
//        }
        System.out.println(arrayList.toString());



        public static void task2() {
        List list = new ArrayList(List.of("afdfa", 34, "sfdgfg", "sfg", 25, 100));
        System.out.println(list);
        //list.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer) {
//                list.remove(i);
//                i--;
//            }
//        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }