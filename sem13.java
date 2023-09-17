  /*Текст задачи:
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции
 каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
  Напишите метод для заполнения данной структуры.*/
        //фантастика, лдароыфдвла
        //роман, выоалдоыь
        //детектив, фьлждалф, ывьтадоща

public class sem13 {
    
}
static void task2(){
      
        List<List<String>> bookShop = new ArrayList<>();
        addBook("Роман", "Евгений Онегин", bookShop);
        addBook("Роман", "Мастер и Маргарита", bookShop);
        addBook("Детектив", "Шерлок Холмс", bookShop);
        addBook("Фантастика", "Война миров", bookShop);
        addBook("Комедия", "Горе от ума", bookShop);

        System.out.println(bookShop);
    }

    static void addBook(String ganre, String name, List<List<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++) {
            if(bookShop.get(i).get(0).equals(ganre)){
                bookShop.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(name);
        bookShop.add(list);
    }