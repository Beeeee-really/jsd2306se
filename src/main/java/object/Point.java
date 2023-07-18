package object;

import java.util.Objects;

/**
 * <p>java中所有的类都继承自Object。
 * <p>当我们定义的类没有使用extends显示的继承一个类时，编译器编译时会补充extends Object
 * <p>
 * <p>使用当前类测试子类经常重写Object的两个方法:toString和equals
 * <p>Point类比如用于表示一个直角坐标系中的一个点
 * <p>
 *
 * @author Beeeee
 */
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

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }
    /**
     * p.equals(p2);
     * <p>
     * <p>o:p2
     * <p>this:p
     */

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    void getX() {
        this.x = x;
    }

    void getY() {
        this.y = y;
    }
}



