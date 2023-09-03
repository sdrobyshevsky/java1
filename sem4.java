//  **Текст задачи:**

// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.

// Пример 1: а = 3, b = 2, ответ: 9

// Пример 2: а = 2, b = -2, ответ: 0.25

// Пример 3: а = 3, b = 0, ответ: 1

// </aside> 

import java.util.Scanner;
public class sem4 
{
public static void main(String[]args)
    {
        {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        int result = 1;
        if (b != 0) 
            {
            for (int i = 1; i <= Math.abs(b); i++) 
                {
                result *= a;
                }
            }  
        if (b < 0) 
            {
            System.out.println(1 / (float) result);
            } 
        else 
            System.out.println(result);
        scanner.close();
        }
    } 
} 
