package archivos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuenta = new Cuenta();
		
		cuenta.setNombreCliente("Rogelio Mejía");
		cuenta.setNumeroCuenta("0002564");
		cuenta.setSaldo(226.52);
		cuenta.setTipoInteres(0.10);
		
		//Imprimiendo en consola
		System.out.println("VALORES DE LA CUENTA BANCARIA:");
		System.out.println("Nombre del Cliente: "+cuenta.getNombreCliente());
		System.out.println("Número de Cuenta: "+cuenta.getNumeroCuenta());
		System.out.println("Saldo actual: "+cuenta.getSaldo());
		System.out.println("Tipo de interés: "+cuenta.getTipoInteres());
	}

}
