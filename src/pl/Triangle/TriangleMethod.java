package pl.Triangle;

public class TriangleMethod {

    public  boolean isRightTriangle(Triangle triangle){
        boolean result;

        if(triangle.getA()*triangle.getA()+triangle.getB()*triangle.getB() == triangle.getC()){
            result = true;
        } else if (triangle.getA()*triangle.getA()+triangle.getC() == triangle.getB()*triangle.getB()){
            result  = true;
        } else if (triangle.getB()*triangle.getB()+triangle.getC()*triangle.getC()==triangle.getA()*triangle.getA()){
            result = false;
        } else {
            return false;
        }

        return  result;
    }

}
