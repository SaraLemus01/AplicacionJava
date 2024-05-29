import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> listEmpleado = new ArrayList<>();
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Ingrese el id del Empleado");
            int idEmpleado = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el nombre del Empleado");
            String nombreEmpleado = scanner.nextLine();

            System.out.println("Ingrese el apellido del Empleado");
            String apellidoEmpleado = scanner.nextLine();

            System.out.println("Ingrese el departamento");
            String departamentoEmpleado = scanner.nextLine();

            System.out.println("Ingrese el Salario");
            double salarioEmpleado = scanner.nextDouble();
            scanner.nextLine();

            Empleado empleado = new Empleado(idEmpleado, nombreEmpleado, apellidoEmpleado, departamentoEmpleado,salarioEmpleado);
            listEmpleado.add( empleado);

            System.out.println("Desea agregar otro registro de empleados? (s/n)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("Lista de empleados registrados:");
        Iterator<Empleado> empleadoIterator = listEmpleado.iterator();
        while (empleadoIterator.hasNext()) {
            Empleado empleado = empleadoIterator.next();
            System.out.println(empleado);
        }

        scanner.close();
    }
}