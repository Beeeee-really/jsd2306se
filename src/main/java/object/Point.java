package object;

public class Point {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }//自动生成Alt+insert

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    void getX(){
        this.x = x;
    }

    void getY(){
        this.y=y;
    }
}



