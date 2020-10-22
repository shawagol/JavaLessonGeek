package Lesson6;

class Cat extends Animal {
    public  Cat(String name){
        super(name, 200, 0, 2);
    }

    public  Cat(String name, int maxRun, int maxSwim, double maxJump){
        super(name,maxRun,maxSwim,maxJump);
    }


    @Override
    void swim(int value) {
        if ((value == value)||(value ==0) ) {
            System.out.println(name + " - кот, а коты не умеют плавать!");

        }

    }

}