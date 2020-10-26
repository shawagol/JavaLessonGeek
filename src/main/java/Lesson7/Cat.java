package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;
        if (appetite<0) {
            System.out.println("не может быть отрицательным значением");
        }
    }
    public boolean eat(Plate p) {
        satiety = p.decreaseFood(appetite) ; // функция возвращает true ,если кот сьел свою норму
        if (satiety) {
     //       System.out.println("Кот "+name + " наелся");
        } else {
      //      System.out.println("Кот "+name + " голодный");
        }
        return  satiety;

    }

    public void info_satiety() {
        if (satiety) {
            System.out.println("Кот - "+name + " cытый");
        } else {
            System.out.println("Кот - "+name + " голодный");
        }
    }


}
