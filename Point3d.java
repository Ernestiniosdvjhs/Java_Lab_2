package com.company;

public class Point3d extends Point2d {

    private double zCoord;  // координата Z

    public Point3d(double x, double y, double z) {  // Конструтор инициализации
        super(x, y);
        zCoord = z;
    }

    public Point3d() {    // Конструктор по умолчанию
        this(0, 0, 0);
    }

    public double getZ() {    // Возвращение координаты Z
        return zCoord;
    }

    public void setZ(double val) {   // Установка значения координаты Z
        zCoord = val;
    }

    public boolean isCompare(Point3d comparedPoint) {   // Возвращение сравнения с другой точкой
        return this.getX() == comparedPoint.getX() & this.getY() == comparedPoint.getY() & this.getZ() == comparedPoint.getZ();
    }

    public double distanceTo(Point3d secondPoint) { // Возвращение расстояния между другой точкой

        // Рассчёт расстояния
        double distance = Math.sqrt(Math.pow((secondPoint.getX() - this.getX()), 2) + Math.pow((secondPoint.getY() - this.getY()), 2) + Math.pow((secondPoint.getZ() - this.getZ()), 2));

        double result = Math.ceil(distance * Math.pow(10, 2)) / Math.pow(10, 2);        // округление до 2 знаков после запятой

        return result;
    }


}
