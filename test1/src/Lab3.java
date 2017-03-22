/**
 * Created by tarasov on 12.03.2017.
 */
import java.io.*;
import java.util.Stack;
public class Lab3 {
    public static void main() {
        Stack<Punto> points = new Stack<>();
        Punto point1 = new Punto();
        point1.X = -2;
        point1.Y = 3;
        points.push(point1);

        Punto point2 = new Punto();
        point2.X = -4;
        point2.Y = 2;
        points.push(point2);

        Punto point3 = new Punto();
        point3.X = 1;
        point3.Y = -5;
        points.push(point3);
    }
}
