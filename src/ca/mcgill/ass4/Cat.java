package ca.mcgill.ass4;

import java.util.Random;

/*Write a class describing a Cat object. A cat has the following attributes: a name (String), a breed (String),
an age (int) and a mood (String). The mood of a cat can be one of the following: sleepy, hungry, angry,
happy, crazy. The cat constructor takes as input a String and sets that value to be the breed. The Cat
class also contains a method called talk(). This method takes no input and returns nothing. Depending
on the mood of the cat, it prints something different. If the cat’s mood is sleepy, it prints meow. If the
mood is hungry, it prints RAWR!. If the cat is angry, it prints hsssss. If the cat is happy it prints purrrr. If
the cat is crazy, it prints a String of 10 gibberish characters (e.g. raseagafqa).
The cat attributes are all private. Each one has a corresponding public get method (ie: getName(),
getMood(), etc.) which returns the value of the attribute. All but the breed also have a public set
method (ie: setName(), setMood(), etc.) which takes as input a value of the type of the attribute and
sets the attribute to that value. Be sure that only valid mood sets are permitted. (ie, a cat’s mood can
only be one of five things). There is no setBreed() method because the breed of a cat is set at birth and
cannot change.*/
public class Cat {
    private Mood mood;
    private String name;
    private String breed;
    private int age;
    public enum Mood {
        SLEEPY, HUNGRY, ANGRY, HAPPY, CRAZY
    }

    public Cat(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk() {
        switch (mood) {
            case SLEEPY:
                System.out.println("meow");
                break;
            case HUNGRY:
                System.out.println("rawr");
                break;
            case ANGRY:
                System.out.println("hsss");
                break;
            case HAPPY:
                System.out.println("purr");
                break;
            case CRAZY:
                System.out.println(generateGibberish());
                break;
        }
    }
    public String generateGibberish() {
        Random random = new Random();
        StringBuilder gibberish = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char c=(char)('a' + random.nextInt(26));
            gibberish.append(c);
        }
        return gibberish.toString();
    }


}
