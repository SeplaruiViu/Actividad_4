import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        Operacion oper = new Operacion();


        try {
            
            System.out.println("Introduce una de las siguientes operaciones: +, -, * o /");
            String operacion =   oper.devolverOperacion(scanner.nextLine());

        if("suma".equals(operacion)) {
            System.out.println("Has elegido la operación Suma");
            System.out.println("Introduce el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = "+ Calculadora.suma(num1, num2));
        } else if("resta".equals(operacion)) {
            System.out.println("Has elegido la operación Resta");
            System.out.println("Introduce el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " - " + num2 + " = "+ Calculadora.resta(num1, num2));
        } else if("multiplicacion".equals(operacion)) {
            System.out.println("Has elegido la operación Multiplicacion");
            System.out.println("Introduce el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " - " + num2 + " = "+ Calculadora.multiplicacion(num1, num2));
        } else if("division".equals(operacion)) {
            System.out.println("Has elegido la operación Division");
            System.out.println("Introduce el primer número");
            int num1 = scanner.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = scanner.nextInt();
            System.out.println("num1 - " + num2 + " = "+ Calculadora.division(num1, num2));
        } else {
            System.out.println("La operación introducida no es correcta");
        }
        } finally {
            scanner.close();
        }
        
    }

}
