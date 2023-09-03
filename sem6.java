// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Пример
// n = 4 -> 10
// n = 5 -> 15

import java.util.Scanner;

public class sem6 
{
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) 
    {
        return (a * (a + 1)) / 2;
    } 
} 