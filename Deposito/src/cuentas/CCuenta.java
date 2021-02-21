package cuentas;

/**
 * 
 * La clase CCuenta tiene declaradas cuatro variables (nombre, cuenta, saldo y tipoInterés)
 * que son usadas en varios métodos para obtener información sobre la cuenta, como el estado o 
 * saldo de la misma y realizar operaciones de ingresar o retirar dinero
 * @author ivan-_000
 * 
 *
 */
public class CCuenta {
	
	private String nombre;//esta es la variable nombre para identificar la cuenta
    private String cuenta;//esta es la variable cuenta para su identificación
    private double saldo;// la variable saldo es una cantidad que nos indicará el estado de la cuenta
    private double tipoInterés;//la variable tipoInterés es una cantidad que nos da información de la cuenta

    public CCuenta()
    {
    }

    /**
     * Aquí se especifican los parametros usados
     * @param nom - nombre
     * @param cue - cuenta
     * @param sal - saldo
     * @param tipo - tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Este método nos indica el estado de la cuenta
     * @return - nos devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * A través de este método se realizan los ingresos en cuenta
     * @param cantidad - este parametro indica la cantidad a ingresar
     * @throws Exception - se incluye la excepción para que no se realicen ingresos en negativo
     * y la cantidad ingresada se sume al saldo existente en la cuenta.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Este método al contrario que ingresar sirve para restar dinero a la cuenta
     * @param cantidad - igual que en ingresar
     * @throws Exception - la excepción evita que se retire cantidad negativa y si es mayor
     * que el saldo dispuesto, no se pueda realizar la operación
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	

}
