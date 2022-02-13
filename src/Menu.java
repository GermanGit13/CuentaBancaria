import java.util.Scanner;

public class Menu {

    public Menu() {
        String opcion = null;
        String nombre;
        String dni;
        Scanner teclado = new Scanner(System.in);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(null,null);
        do{
            System.out.println("1. Crear Cuenta Bancaria");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Ingresar Dinero");
            System.out.println("4. Retirar Dinero");
            System.out.println("5. Salir");
            opcion = teclado.nextLine();
            int cantidad;

            switch (opcion) {
                case "1":
                   System.out.println("Introduzca su Nombre");
                   cuentaCorriente.setNombre(nombre = teclado.nextLine());
                   System.out.println("Introduzca su DNI");
                   cuentaCorriente.setDni(dni = teclado.nextLine());
                   break;
                case "2":
                   System.out.println(cuentaCorriente.getSaldo());
                   break;
                case "3":
                    System.out.println("Teclee la cantidad a ingresar");
                    cantidad = Integer.parseInt(teclado.nextLine());
                    cuentaCorriente.IngresarDinero(cantidad);
                    break;
                case "4":
                    System.out.println("Teclee la cantidad a retirar");
                    cantidad = Integer.parseInt(teclado.nextLine());
                    cuentaCorriente.SacarDinero(cantidad);
            }

        } while (!opcion.equals("5"));

    }
}
