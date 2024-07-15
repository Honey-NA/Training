public class Figure implements IGeometry {
    protected String figureName;
    protected int p;
    protected double s;
    protected Figure(String figureName){
        this.figureName = figureName;
    }
    @Override
    public int Prec(int x, int y){
        p = 2*(x+y);
        return p;
    }
    @Override
    public double Srec(int x, int y){
        s = x*y;
        return s;
    }
}
// treugolnik = s = koren iz p(p-a)(p-b)(p-c)
//krug = p = 2piR, s=r*r*Pi
