package Lesson7;

public class Plate {
    private int food;
    private final String namePlate;
    private  final int maxFood; // количество ед ,которое помещяется в тарелку
    public Plate(int food, String namePlate, int maxFood) {
        this.food = food;
        this.namePlate=namePlate;
        this.maxFood=maxFood;
        if (maxFood<0) {
            System.out.println("Не может быть отрицательным значением");
        }

    }
    public Plate(int food, String namePlate) {
        this.food = food;
        this.namePlate=namePlate;
        this.maxFood=150; // обычная тарелка

    }


    //Соответствует пункту 3
//    public boolean decreaseFood(int n) {
//        food -= n;
//        if (food <0 ){
//            food =0;
//            System.out.println("Тарелка "+namePlate+ " пустая");
//            return false;
//        }
//        return true;
//    }

// Вариант для пункта 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
    public boolean decreaseFood(int n) {
        if (n>food ){
            System.out.println("Кот из тарелки - "+namePlate+ ". Кот не может съесть свою норму");
            return false;
        } else {
            food = food - n;
            System.out.println("Кот поел из тарелки - "+namePlate+ ". В тарелке осталось: " + food);
            return true;
        }
    }
  public void increaseFood(int n) {
        if (n+food>maxFood) {
            System.out.println("Невозможно добавить "+ n + " в тарелку: " + namePlate);
        } else  {
            food= food+n;
            System.out.println("В тарелку " +namePlate+ " положили: " +n+ " еды");
        }

  }
    public void info() {
        System.out.println("В тарелке " +namePlate + ": "+ food);
    }

}
