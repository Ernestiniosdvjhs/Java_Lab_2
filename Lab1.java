package com.company;

public class Lab1 {
    public static void main(String[] args) {

        Point3d point1 = new Point3d(0, 0, 0);  // задаем точки для треугольника
        Point3d point2 = new Point3d(0, 0, 0);
        Point3d point3 = new Point3d(4, 2, 0);

        System.out.println("Площадь треугольника: " + computeArea(point1, point2, point3));

    }

    public static double computeArea(Point3d first, Point3d second, Point3d third) {

        if (first.isCompare(second) || first.isCompare(third) || third.isCompare(first)) {
            System.out.println("Треугольник имеет одинаковые точки");
            return 0.0;
        } else {    // вычисление сторон треугольника
            double a = first.distanceTo(second);
            double b = first.distanceTo(third);
            double c = second.distanceTo(third);

            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));  // вычисление площади по формуле Герона

            double result = Math.ceil(s * Math.pow(10, 2)) / Math.pow(10, 2);      //округление до 2-х знаков после запятой

            return result;

        }
    }


}
