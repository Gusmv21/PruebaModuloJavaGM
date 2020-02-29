/**
 * Clase hija Televisor, Proyecto Prueba 1 GM
 */
package prueba1.modelo;

/**
 * @author Gustavo Morales
 *Clase Hija Televisor.
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 *asi como los atributos personales sintonizador TDT y resolucion.
 *extiende de la clase Madre Electrodomesticos.
 */
public class Televisor extends Electrodomesticos{
	private float resolucion;
	private boolean sintonizadorTDT;
	public static final float RESOLUCION_DEFECTO = 20;
	

	/**
	 * Constructor por defecto de objetos de la Clase hija Televisor
	 * @param precioBase;//heredados por defecto de la clase Madre
	 * @param color;//heredados por defecto de la clase Madre
	 * @param consumoEnergetico;//heredados por defecto de la clase Madre
	 * @param peso;//heredados por defecto de la clase Madre
	 * @param resolucion;//entregado por defecto desde la constante de resolucion por defecto.
	 * @param sintonizadorTDT;//booleano entregado por defecto, es falso;
	 */	
	public Televisor() {
		super();
		resolucion = RESOLUCION_DEFECTO;
		sintonizadorTDT = false;
	}

	/**
	 * Constructor con parametros precioBase y peso, heredados desde la clase madre Electrodomesticos 
	 * de la Clase hija Televisor
	 * @param precioBase;//heredados por ingreso desde la clase Madre
	 * @param color;//heredados por defecto de la clase Madre
	 * @param consumoEnergetico;//heredados por defecto de la clase Madre
	 * @param peso;//heredados por ingreso de la clase Madre
	 * @param resolucion;//entregado por defecto desde la constante de resolucion por defecto.
	 * @param sintonizadorTDT;//booleano entregado por defecto, es falso;
	 */
	public Televisor(float precioBase, int peso) {
		super(precioBase, peso);
	}

	/**
	 * * Constructor con todos los parametros heredados desde la clase madre Electrodomesticos y sus atributos propios
	 * pasado por parametros de la Clase hija Televisor.
	 * @param precioBase;//heredados por ingreso desde la clase Madre
	 * @param color;//heredados por ingreso de la clase Madre y comprobados por metodo compruebaColor().
	 * @param consumoEnergetico;//heredados por ingreso de la clase Madre y comprobados por metodo compruebaConsumoEnergetico().
	 * @param peso;//heredados por ingreso de la clase Madre
	 * @param resolucion;//ingresado por parametro.
	 * @param sintonizadorTDT;//ingresado por parametro.
	 */
	public Televisor(float precioBase, int peso, String color, char consumoEnergetico,
			float resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}


	/**
	 * Metodo Get atributo resolucion Clase hija Televisor, devuelve el valor de resolucion.
	 * @return resolucion.
	 */	
	public float getResolucion() {
		return resolucion;
	}
	/**
	 * Metodo Get atributo resolucion Clase hija Televisor, devuelve el valor de sintonizadorTDT.
	 * @return sintonizadorTDT.
	 */	
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	/**
	 * Metodo precioFinal() Clase hija Televisor, 
	 * Crea una variable precioTelevisor para acumular los valores agregados al precioBase del electrodomestico por concepto
	 * de resolucion y sintonizadorTDT. Para ello llama al metodo de la clase madre Electrodomesticos con super.precioFinal(), para el caso de la resolucion
	 * segun sea el rango de la resolucion del televisor multiplicara por el 30% al precioBaseElectrofomestico, valor que sera guardado en precioTelevisor y 
	 * para el caso de sintonizadorTDT si la televisor da true, sumara 50 al
	 * valor final dle televisor.
	 * para luego retornar el precio final del Televisor dado por la suma de precioBaseElectrodomestico + precioTelevisor.
	 * @param resolucion
	 * @param sintonizadorTDT
	 * @return precioBaseElectrodomestico + precioTelevisor.
	 */
    public float precioFinal(){
        float precioTelevisor = 0;
        float precioBaseElectrodomestico=super.precioFinal();
        if (resolucion>40){
            precioTelevisor = (float) (precioBaseElectrodomestico*0.3);
        }
        if (sintonizadorTDT){
            precioTelevisor+=50;
        }
        return precioBaseElectrodomestico + precioTelevisor;
    }
}    

