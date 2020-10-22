package Lesson6;
import java.util.Random;


public abstract class Animal{
    protected String name;
    protected int  maxRun;
    protected int  maxSwim; // если значение равно 0 то животное не плавает
    protected double  maxJump; // если равно 0, животное не прыгает


    public Animal(String name, int maxRun, int maxSwim, double maxJump)

    {
        this.name = name;
        this.maxRun=maxRun;
        this.maxSwim=maxSwim;
        this.maxJump=maxJump;
    }
         void run(int value) {
             if (value > maxRun) {
                 System.out.println(name + " " + value + " run false");
             } else {
                 System.out.println(name + " " + value + " run true");
             }
         }
         void swim(int value) {
             if (value > maxSwim) {
                 System.out.println(name + " " + value + " swim false");
             } else {
                 System.out.println(name + " " + value + " swim true");
             }
         }
         void jump(double value) {
             if (value > maxJump) {
                 System.out.println(name + " " + value + " jump false");
             } else {
                 System.out.println(name + " " + value + " jump true" );
             }
         }


            public static void main(String[] args) {
//        Animal[] animals = {
//                new Cat("Барсик",150, 30,3.0),
//                new Dog("Шарик", 450, 20, 1.2)
//        };

//Animal n1 = new Animal("margo", 200,54,2.2);
                Dog dog1 = new Dog("Шарик",600, 110, 0.5);
                Dog dog2 = new Dog ("Тубрик");
                Cat cat1 = new Cat("Барсик", 200, 0,2.0);
                Cat cat2 = new Cat ("Муся");

                //IRun[] runDog1 = new IRun[ runDog1.run(150)];

                dog1.run(150);
                dog2.run(510);
                cat1.run(500);
                cat2.run(230);
                dog1.swim(15);
                cat1.swim(15);

                dog1.jump(0.1);
                cat1.jump(2.1);

             }

}

