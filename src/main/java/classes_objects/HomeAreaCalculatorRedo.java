package classes_objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the lenght of your room:");
        double lenght = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(lenght, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return  rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}
