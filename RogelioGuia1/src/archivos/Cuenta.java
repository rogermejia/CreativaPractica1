package archivos;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private Double tipoInteres;
	private Double saldo;

	public Cuenta() { //constructor por defecto

	}

	public Cuenta(String nombreCliente, String numeroCuenta, Double tipoInteres, Double saldo) {
		//Constructor con todos los parámetros
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	public Cuenta(Cuenta b) { //Constructor copia
		nombreCliente = b.getNombreCliente();
		numeroCuenta = b.getNumeroCuenta();
		tipoInteres = b.getTipoInteres();
		saldo = b.getSaldo();
	}

	//METODOS GETTERS Y SETTERS
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}

