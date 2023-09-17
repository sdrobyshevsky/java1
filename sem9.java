// В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Восстановите выражение до верного равенства.
// Предложите хотя бы одно решение или сообщите, что его нет.
// Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла и восстановит его до верного равенства.
// Выведите сначала строку формата "Given the equation: {выражение из файла}".
// А затем верните строку формата "Result: {цельное выражение}".
// Если выражение не имеет решений - верните строку "No solution".

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


class Equation 
{
public class sem9 
{
public static String getSolution(String str)
    {
    public static void main(String[] args)       
        {
        boolean result = true;
            while (result) 
            {
                for (int i = 0; i < 9; i++) 
                {
                    for (int j = 0; j < 9; j++) 
                    {
                        for (int k = 0; k < 9; k++) 
                        {
                           for (int l = 0; l < 9; l++) 
                            {
                                for (int m = 0; m < 9; m++) 
                                {
                                    for (int n = 0; n < 9; n++) 
                                    {
                                    if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) 
                                        {
                                        int a = i * 10 + j;
                                        int b = k * 10 + l;
                                        int c = m * 10 + n;
                                        System.out.printf("%d + %d = %d   ", a, b, c);
                                        
                                        result=false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            
            }
        }   
    }
} 
}
