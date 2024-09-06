package ca.mcgill.ass4;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("white");
        cat.setAge(12);
        cat.setName("ashli");
        cat.setMood(Cat.Mood.ANGRY);
        System.out.println(cat.getMood());
        cat.talk();
        Cat[] cats=new Cat[5];

        cats[0]=new Cat("red");
        cats[0].setMood(Cat.Mood.SLEEPY);
        cats[1]=new Cat("red");
        cats[1].setMood(Cat.Mood.SLEEPY);
       cats[2]=new Cat("red");
        cats[2].setMood(Cat.Mood.SLEEPY);
       cats[3]=new Cat("red");
        cats[3].setMood(Cat.Mood.SLEEPY);
       cats[4]=new Cat("red");
        cats[4].setMood(Cat.Mood.SLEEPY);



for (int i = 0; i < cats.length; i++) {
    cats[i].talk();
}
    }
}
