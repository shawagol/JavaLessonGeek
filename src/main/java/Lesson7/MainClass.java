package Lesson7;

public class MainClass {
    public static void main(String[] args) {
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать
// из этой тарелки и потом вывести информацию о сытости котов в консоль
        Cat[] cats = {
            new Cat("Barsik", 20),
                new Cat("Musy", 30),
                new Cat( "Margo", 25)
        };

//        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(60, "мясо");
       // Plate plate2 = new Plate(15,"рыбка");
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info_satiety();
        }
        plate.info();
        plate.increaseFood(30);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info_satiety();
        }
//        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.eat(plate);
//        plate2.info();
//        cat.eat(plate2);

//        plate.info();

    }

}
