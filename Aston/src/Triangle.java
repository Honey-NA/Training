//Задание №2
public class Triangle extends Figure implements IGeometry {
    public int x;
    public int y;
    public int z;
    public Triangle(String figureName, int x, int y, int z) {
        this.figureName = figureName;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int p() {
        p = x+y+z;
        return p;
    }

    @Override
    public double s() {
        s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
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

