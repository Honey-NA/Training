//Задание №1
public abstract class Animal {
    public static int animalNumber = 0;
    public String name;
    public abstract void run(int x);
    public abstract void swim(int x);
    public Animal(String name) {
        this.name = name;
    }
    public static String number(){
        return "Сейчас " + Animal.animalNumber + " животных, " + Cat.catNumber + " котов, " + Dog.dogNumber + " собак.";
    }
}

