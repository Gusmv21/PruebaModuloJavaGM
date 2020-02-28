/**
 * Clase hija Televisor, Proyecto Prueba 1 GM
 */
package prueba1.modelo;

/**
 * @author Gustavo Morales
 *Clase Hija Televisor.
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 *asi como los atributos personales sintonizador TDT y resolucion.
 */
public class Televisor extends Electrodomesticos{
	private float resolucion;
	private boolean sintonizadorTDT;
	public static final float RESOLUCION_DEFECTO = 20;
	

//constructor por defecto objeto televisor.
	public Televisor() {
		super();
		resolucion = RESOLUCION_DEFECTO;
		sintonizadorTDT = false;
	}

//constructor televisor con parametros  heredados de electrodomesticos precio y peso.
	public Televisor(float precioBase, int peso) {
		super(precioBase, peso);
	}

//constructor televisor con todos los parametros que puede tener, tanto propios como heredades desde electrodomesticos.
	public Televisor(float precioBase, int peso, String color, char consumoEnergetico,
			float resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}


//Get de los atributos resolucion y sincronizadorTDT de la clase Televisor
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
//METODO PRECIO FINAL DE TELEVISOR.
	
    public float precioFinal(){
        float precioTelevisor = 0;
    	//Invocamos el método precioFinal del método padre
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

