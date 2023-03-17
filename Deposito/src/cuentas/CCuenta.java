package cuentas;


/**
 * Clase que representa uma cuenta bancaria.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom nombre del titular de la cuenta.
     * @param cue número de cuenta.
     * @param sal saldo inicial de la cuenta.
     * @param tipo tipo de interés de la cuneta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Método para asignar un nombre al titular de la cuenta.
     *
     * @param nom nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método para obtener el nombre del titular de la cuenta.
     *
     * @return nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     *
     * @return saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     *
     * @param cantidad cantidad a ingresar.
     * @throws Exception si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     *
     * @param cantidad cantidad a retirar.
     * @throws Exception si la cantidad es negativa o si no hay suficiente
     * saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Método para obtener el número de cuenta.
     *
     * @return número de cuenta.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Método para obtener el nombre del titular de la cuenta.
     *
     * @return nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del titular de la cuenta.
     *
     * @param nombre nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el tipo de interés de la cuenta.
     *
     * @return tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés de la cuenta.
     *
     * @param tipoInterés tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
