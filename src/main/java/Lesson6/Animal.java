package Lesson6;



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
                 System.out.println(name + " " + value + " run: false");
             } else   if (value ==0) {
                 System.out.println(name + " - животное не бежит!");
             }  else {
                 System.out.println(name + " " + value + " run: true");
             }
         }
         void swim(int value) {
             if (value > maxSwim) {
                 System.out.println(name + " " + value + " swim: false");
             } else   if (value ==0) {
                 System.out.println(name + " - животное не плывет!");
             } else {
                 System.out.println(name + " " + value + " swim: true");
             }

         }
         void jump(double value) {
             if (value > maxJump) {
                 System.out.println(name + " " + value + " jump: false");
             }else   if (value ==0) {
                     System.out.println(name + " - животное не прыгает!");
             } else {
                 System.out.println(name + " " + value + " jump: true" );
             }
         }


            public static void main(String[] args) {

                Dog dog1 = new Dog("Шарик",600, 15, 0.5);
                Dog dog2 = new Dog ("Тубрик");
                Cat cat1 = new Cat("Барсик", 300, 0,3.0);
                Cat cat2 = new Cat ("Муся");


                dog1.run(150);
                dog2.run(510);
                cat1.run(180);
                cat2.run(230);

                dog1.swim(15);
                dog2.swim(15);
                cat1.swim(0);
                cat2.swim(15);

                dog1.jump(0.4);
                dog2.jump(0.6);
                cat1.jump(2.8);
                cat2.jump(2.1);
             }

}

