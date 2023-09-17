// **Текст задачи:**
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

import java.util.Scanner;

public class sem16 
{
    
    public static void main(String[] args) 
    {
       
        LinkedList<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            while (work) {
                System.out.println("Введите команду : ");
                String line = scanner.nextLine();

                switch (line) {
                    case "print":
                        for (int i = list.size()-1; i >= 0 ; i--) {
                            System.out.println(list.get(i));
                        }
                        break;
                    case "revert" :
                        list.removeLast();
                        break;
                    case "exit":
                        System.out.println("Пока! ");
                        work = false;
                        break;
                    default:
                        list.add(0, line);
                }
            }
        }
    }
}