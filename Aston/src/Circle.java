//Задание №2
public class Circle extends Figure implements IGeometry {
    public int r;
    public Circle(String figureName, int r) {
        System.out.println("Круг создан.");
        this.figureName = figureName;
        this.r = r;
    }

    @Override
    public int p() {
        p = (int) (2*Math.PI*r);
        return p;
    }

    @Override
    public double s() {
        s = r*r*Math.PI;
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
    public void getValues() {
        System.out.println("\nФигура: " + figureName + "\nПериметр: " + p + "\nПлощадь: " + s
                + "\nЦвет заливки: " + bgColor + "\nЦвет границ: " + brColor);
    }
}

