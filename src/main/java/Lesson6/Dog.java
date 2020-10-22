package Lesson6;

 class Dog extends Animal {
     public Dog(String name) {
         super(name,500,20, 0.5);
     }


     public Dog(String name, int maxRun, int maxSwim, double maxJump) {
        super(name,maxRun,maxSwim,maxJump);

   }

//     @Override
//     void run(int value) {
//         super.run(value);
//     }
 }
