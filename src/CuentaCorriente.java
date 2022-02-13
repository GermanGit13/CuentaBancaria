public class CuentaCorriente {

    private float saldo;
    private String nombre;
    private String dni;
    private float limite;

    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        float saldo = 0;
        float limite = 0;
    }

    public float SacarDinero(int cantidad) {
        //No tiene saldo para sacar
        if (saldo == limite) {
            return -1;
        }

        // El usuario tiene menos dinero del que quiere sacar
        if (cantidad > (Math.abs(saldo - limite))) {
            float cantidadRetirada = Math.abs(saldo - limite);
            saldo = limite;
            System.out.println("No Dispone de saldo suficiente para sacar: " + cantidad + " Tu retirada será de: " + cantidadRetirada + " Dejando la cuenta con un saldo: " + saldo);
        }

        // El usuario tiene suficiente dinero pasar sacar la cantidad indicada
        saldo -= cantidad;
        return cantidad;
        }

    public float IngresarDinero(float ingresar) {
        saldo += ingresar;
        return saldo;
    }

    public float MostrarSaldo() {
        return saldo;

    }

    public float getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
