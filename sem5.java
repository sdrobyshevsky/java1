// Текст задачи:
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class sem5    
{
public static void main(String[]args)
   {
    String text_nach = "Welcome gear frends!";
    String[] text_massiv = text_nach.split(" ");
    String tempSlovo = "";
    for (int i = 0; i < text_massiv.length - 1 - i; i++)
        {
        tempSlovo = tempSlovo + text_massiv[text_massiv.length - 1 - i];
        }
    System.out.println(tempSlovo);

    } 
} 



