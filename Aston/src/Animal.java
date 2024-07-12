public abstract class Animal {
    static int number = 0;
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void run(int x);
    public abstract void swim(int y);
}

