package Modelo;

import javax.swing.JOptionPane;

public class Cuenta {

	private String titular;
	private double cantidad;
	/**
	 *Se ingresa una cantidad a la cuenta, si el digito es negativo no se hara nada
	 * @param cantidad
	 */
	public void ingresar(double cantidad) {
		if(cantidad<0) {
			System.out.println("ingrese un digito correcto");
		}
		else {
		this.cantidad=cantidad;
	
		}
	}
	/**
	 * Se retira una cantidad de la cuenta, si se retira mas de lo que se tiene la cuenta queda en 0
	 * @param cantidad
	 * @return
	 */
	public double retirar(double cantidad) {
		setCantidad(getCantidad()-cantidad);
		//si la cantidad resultante es negativa se hace 0
		if(getCantidad()<0) {
			setCantidad(0);
		}
		return getCantidad();
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
}
