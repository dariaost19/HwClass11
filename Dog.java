package Homework9;

public class Dog {
    //2) Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
String name;
String color;
int age;


    void eat()
    {System.out.println("Eat Chewy");}
    void play(){System.out.println("plays all the time");}

    void sleep()
    {System.out.println("Loves sleep");}


    public static void main(String[] args) {
        Dog Husky=new Dog();
        Husky.name="Baby";
        Husky.age=2;
        Husky.color="Grey and White";
        Husky.sleep();
        Husky.eat();
        Husky.play();


        Dog Bulldog=new Dog();
        Bulldog.name="Whisky";
        Bulldog.color="Brown";
        Bulldog.age=4;
        Bulldog.sleep();
        Bulldog.play();
        Bulldog.eat();

        Dog Labrador =new Dog();
        Labrador.name="Gigi";
        Labrador.color="Grey";
        Labrador.age=3;
        Labrador.sleep();
        Labrador.eat();
        Labrador.play();
    }
    }


