package Lesson6;

 class Dog extends Animal {
     public Dog(String name) {
         super(name,500,20, 0.5); // ограничение
     }


     public Dog(String name, int maxRun, int maxSwim, double maxJump) { // передаются в main
        super(name,maxRun,maxSwim,maxJump);

   }

 }
