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


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleType getType() {
        if (isNotATriangle()) {
            return TriangleType.INVALID;
        }
        if (isEquilateral()) {
            return TriangleType.EQUILATERAL;
        }
        if (isIsosceles()) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.SCALENE;

    }

    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    public boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }

    public boolean isNotATriangle() {
        return side1 < 0 || side2 < 0 || side3 < 0 || side1 >= side2 + side3 || side3 >= side1 + side2 || side2 >= side1 + side3;
    }

}
