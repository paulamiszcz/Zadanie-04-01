package pl.dataTriangle;

import pl.Triangle.TriangleMethod;
import pl.Triangle.Triangle;

public class TriangleTest {
    public static void main(String[] args){
        Triangle trian = new Triangle();
        TriangleMethod method = new TriangleMethod();

        trian.setA(30);
        trian.setB(20);
        trian.setC(10);

        boolean istrian = method.isRightTriangle(trian);
        System.out.println("A: " + trian.getA() + " B: " + trian.getB() + " C: " + trian.getC());
        System.out.println("Czy trójkąt jest prostokątny? " + istrian);
    }
    }
