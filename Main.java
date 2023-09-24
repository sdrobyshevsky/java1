public class Main 
{
    public static void main(String[] args) {
        //1)	Создать класс Cat с полями:
        // имя,цвет,кол-во лет. Поработать с полями напрямую
        Cat barsik = new Cat("Барсик", "Рыжий", 5);
        barsik.setAge(-20);
        barsik.setAge(200);
        barsik.setAge(7);
        //2)	Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
        System.out.println("cat1 = имя-" + barsik.getName() +
                " цвет - " + barsik.getColor() +
                " возраст - " + barsik.getAge());
    }
}

