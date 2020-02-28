/**
 * Clase hija Lavadora, Proyecto Prueba 1 GM
 */
package prueba1.modelo;


/**
 * @author Gustavo Morales
 *Clase Hija Lavadora
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 *heredados por la clase electrodomesticos asi como el atributo propio carga y su respectivo metodo de precio final.
 */
public class Lavadora extends Electrodomesticos {
	private int carga;
	public static final int CARGA_DEFECTO = 15;
	
//constructor por defecto;	
	public Lavadora() {
		super();
		carga = CARGA_DEFECTO;
	}
	
//constructor con parametros precio y peso heredados de clase Madre Electrodomesticos
	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		
	}
// constructor con todos los parametros que puede tomar la clase Lavadora
	public Lavadora(float precioBase, int peso, String color, char consumoEnergetico,
			int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
// Get del atributo Carga de la clase Lavadora

	public int getCarga() {
		return carga;
	}
	
	//METODO PRECIO FINAL  Lavadora()
	
	public float precioFinal() {
		float precioLavadora = 0;
		
		//Se llama al metodo de la clase madre precio final
		 float precioBaseElectrodomestico = super.precioFinal();
		        if (carga>30){
		            precioLavadora+=50;
		        }
		
		return  precioBaseElectrodomestico + precioLavadora;
	}
	
}
