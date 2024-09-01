package ca.mcgill.ass4;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("white");
        cat.setAge(12);
        cat.setName("ashli");
        cat.setMood(Cat.Mood.ANGRY);
        System.out.println(cat.getMood());
        cat.talk();
    }
}
