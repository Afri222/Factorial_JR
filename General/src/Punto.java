public class Punto {
    private int x;
    private int y;

    private Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método fábrica / factoría // Método factory
    public static Punto of(int x, int y) {
        return new Punto(x, y);
    }

    public static Punto axis() {
        return new Punto(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }






}
