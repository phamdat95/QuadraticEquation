import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    private QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }

    private double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5))/(2*a);
    }

    private double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5))/(2*a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.printf("QuadraticEquation has 2 root: x1 = %.2f, x2 = %.2s", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.printf("QuadraticEquation has 1 root: x = %.2f", quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
