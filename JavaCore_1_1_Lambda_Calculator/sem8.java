// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат.
// В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
package JavaCore_1_1_Lambda_Calculator; 
import java.util.function.*;

public class sem8 
{
public static class Calculator 
{
    public static void main(String[] args)
        
    {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    }
    
} 
} 
 
 

