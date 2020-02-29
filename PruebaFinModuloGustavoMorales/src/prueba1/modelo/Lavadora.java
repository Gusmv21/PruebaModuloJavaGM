/**
 * Clase hija Lavadora, Proyecto Prueba 1 GM
 */
package prueba1.modelo;


/**
 * @author Gustavo Morales
 *Clase Hija Lavadora
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 *heredados por la clase electrodomesticos asi como el atributo propio carga y su respectivo metodo de precio final.
 *extiende desde Clase Madre Electrodomesticos.
 */
public class Lavadora extends Electrodomesticos {
	private int carga;
	public static final int CARGA_DEFECTO = 15;
	
	/**
	 * Constructor por defecto de objetos de la Clase hija Lavadora
	 * @param precioBase;//heredados por defecto de la clase Madre
	 * @param color;//heredados por defecto de la clase Madre
	 * @param consumoEnergetico;//heredados por defecto de la clase Madre
	 * @param peso;//heredados por defecto de la clase Madre
	 * @param carga;//enregado por defecto desde la constante de carga por defecto.
	 */		
	public Lavadora() {
		super();
		carga = CARGA_DEFECTO;
	}
	/**
	 * Constructor con parametros precioBase y peso, heredados desde la clase madre Electrodomesticos
	 * de la clase hija Lavadora.
	 * @param precioBase;//heredados por ingreso desde la clase Madre
	 * @param color;//heredados por defecto de la clase Madre
	 * @param consumoEnergetico;//heredados por defecto de la clase Madre
	 * @param peso;//heredados por ingreso de la clase Madre
	 * @param carga;//enregado por defecto desde la constante de carga por defecto.
	 */	
	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		carga = CARGA_DEFECTO;
	}
	/**
	 * Constructor con todos los parametros heredados desde la clase madre Electrodomesticos y su atributo propio
	 * pasado por parametros.
	 * @param precioBase;//heredados por ingreso desde la clase Madre
	 * @param color;//heredados por ingreso de la clase Madre y comprobados por metodo compruebaColor().
	 * @param consumoEnergetico;//heredados por ingreso de la clase Madre y comprobados por metodo compruebaConsumoEnergetico().
	 * @param peso;//heredados por ingreso de la clase Madre
	 * @param carga;//ingresado por parametro.
	 */
	public Lavadora(float precioBase, int peso, String color, char consumoEnergetico,
			int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
	
	/**
	 * Metodo Get atributo carga Clase hija Lavadora, devuelve el valor de carga.
	 * @return carga.
	 */	
	public int getCarga() {
		return carga;
	}
	
	
	
	/**
	 * Metodo precioFinal() Clase hija lavadora, 
	 * Crea una variable precioLavadora para acumular los valores agregados al precioBase del electrodomestico por concepto
	 * de carga. Para ello llama al metodo de la clase madre Electrodomesticos con super.precioFinal(), para el caso de la carga
	 * segun sea el rango de la carga de la lavadora sumara un valor a la variable creada.
	 * para luego retornar el precio final de la Lavadora dado por la suma de precioBaseElectrodomestico + precioLavadora.
	 * @param carga
	 * @return precioBaseElectrodomestico + precioLavadora
	 */
	
	public float precioFinal() {
		float precioLavadora = 0;
		 float precioBaseElectrodomestico = super.precioFinal();
		        if (carga>30){
		            precioLavadora+=50;
		        }
		return  precioBaseElectrodomestico + precioLavadora;
	}
	
}
