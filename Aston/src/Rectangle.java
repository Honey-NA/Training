//Задание №2
public class Rectangle extends Figure implements IGeometry {
    public int x;
    public int y;
    public Rectangle(String figureName, int x, int y) {
        this.figureName = figureName;
        this.x = x;
        this.y = y;
    }

    @Override
    public int p() {
        p = 2*(x+y);
        return p;
    }

    @Override
    public double s() {
        s = x*y;
        return s;
    }

    @Override
    public String bgColor(String color) {
        bgColor = color;
        return bgColor;
    }

    @Override
    public String brColor(String color) {
        brColor = color;
        return brColor;
    }

    @Override
    public void info() {
        System.out.println("\nФигура: " + figureName + "\nПериметр: " + p + "\nПлощадь: " + s
                + "\nЦвет заливки: " + bgColor + "\nЦвет границ: " + brColor);
    }
}
