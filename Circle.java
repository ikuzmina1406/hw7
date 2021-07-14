package ua.GoIT.modul7;

public class Circle extends Shape {

    @Override
    public void printName() {
        System.out.println("Круг");
    }

    @Override
    public void calcCircleSquare() {
        System.out.println("Площадь круга равна " + "S = π * r2");
    }
}
