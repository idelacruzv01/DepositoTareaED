package cuentas;

/**
 * 
 * La clase CCuenta tiene declaradas cuatro variables (nombre, cuenta, saldo y tipoInter�s)
 * que son usadas en varios m�todos para obtener informaci�n sobre la cuenta, como el estado o 
 * saldo de la misma y realizar operaciones de ingresar o retirar dinero
 * @author ivan-_000
 * 
 *
 */
public class CCuenta {
	
	private String nombre;//esta es la variable nombre para identificar la cuenta
    private String cuenta;//esta es la variable cuenta para su identificaci�n
    private double saldo;// la variable saldo es una cantidad que nos indicar� el estado de la cuenta
    private double tipoInter�s;//la variable tipoInter�s es una cantidad que nos da informaci�n de la cuenta

    public CCuenta()
    {
    }

    /**
     * Aqu� se especifican los parametros usados
     * @param nom - nombre
     * @param cue - cuenta
     * @param sal - saldo
     * @param tipo - tipo de inter�s
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Este m�todo nos indica el estado de la cuenta
     * @return - nos devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * A trav�s de este m�todo se realizan los ingresos en cuenta
     * @param cantidad - este parametro indica la cantidad a ingresar
     * @throws Exception - se incluye la excepci�n para que no se realicen ingresos en negativo
     * y la cantidad ingresada se sume al saldo existente en la cuenta.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Este m�todo al contrario que ingresar sirve para restar dinero a la cuenta
     * @param cantidad - igual que en ingresar
     * @throws Exception - la excepci�n evita que se retire cantidad negativa y si es mayor
     * que el saldo dispuesto, no se pueda realizar la operaci�n
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

	private double getTipoInter�s() {
		return tipoInter�s;
	}

	private void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
	

}
