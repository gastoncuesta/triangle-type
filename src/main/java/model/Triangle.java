package model;

public class Triangle {
    public enum TriangleType {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
        INVALID
    }

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleType getType() {

        if (isEquilateral()) {
            return TriangleType.EQUILATERAL;
        }
        if (isIsosceles()) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.INVALID;
    }

    public boolean isEquilateral() {
        return this.side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    public boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }

}
