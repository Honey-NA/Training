public abstract class Animal {
    protected static int number = 0;
    protected String name;
    protected Animal(String name) {
        this.name = name;
    }
    protected abstract void run(int x);
    protected abstract void swim(int x);
}

