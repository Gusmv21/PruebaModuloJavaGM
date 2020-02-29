/**
 * Clase Madre Electrodomesticos, Proyecto Prueba 1 GM
 */
package prueba1.modelo;

/**
 * @author Gustavo Morales
 *Clase Madre Electrodomesticos
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 *contiene:
 *4 atributos privados.
 *4 constantes de los valores de cada uno de los atributos por defecto.
 *4 metodos get de cada uno de los atributos.
 *3 metodos , compruebaColor(String color), compruebaConsumoEnergetico(char consumoEnergetico) y precioFinal().
 */
public class Electrodomesticos {
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;
	public static final float PRECIO_BASE_DEFECTO=100;
	public static final String COLOR_DEFECTO = "BLANCO";
	public static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	public static final float PESO_DEFECTO = 5;
	
/**
 * Constructor por defecto de objetos de la Clase Madre Electrodomesticos
 * @param precioBase;//por defecto
 * @param color;//por defecto
 * @param consumoEnergetico;//por defecto
 * @param peso;//por defecto
 * los valores por defecto, son asignados por las constantes de cada uno de los atributos.
 */	
	public Electrodomesticos() {
		precioBase = PRECIO_BASE_DEFECTO;
		color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		peso = PESO_DEFECTO;
	}
	/**
	 * Constructor con parametros precio Base y peso de objetos de la Clase Madre Electrodomesticos
	 * el resto de parametros se llena por defecto.
	 * @param precioBase;//introducido
	 * @param color;//por defecto
	 * @param consumoEnergetico;//por defecto
	 * @param peso;//introducido
	 * los valores por defecto, son asignados por las constantes de cada uno de los atributos.
	 */	
	public Electrodomesticos(float precioBase, float peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	/**
	 * Constructor con todos los atributos de la clase Electrodomesticos pasados por parametro.
	 * @param precioBase;//introducido por parametro
	 * @param color;//introducido por parametro y comprobado por el metodo compruebaColor(String color).
	 * @param consumoEnergetico;//introducido por parametro y comprobado por el metodo compruebaConsumoEnergerico(char).
	 * @param peso;//introducido por parametro
	 */	
	public Electrodomesticos(float precioBase, float peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
	}
	/**
	 * Metodo Get atributo precioBase Clase Madre Electrodomestico, devuelve el valor de precioBase
	 * @return precioBase.
	 */	
	public float getPrecioBase() {
		return precioBase;
	}
	/**
	 * Metodo Get atributo color Clase Madre Electrodomestico, devuelve el valor de color
	 * @return color.
	 */	
	public String getColor() {
		return color;
	}
	/**
	 * Metodo Get atributo consumoEnergetico Clase Madre Electrodomestico, devuelve el valor de consumoEnergetico
	 * @return consumoEnergetico.
	 */	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * Metodo Get atributo peso Clase Madre Electrodomestico, devuelve el valor de peso.
	 * @return peso.
	 */	
	public float getPeso() {
		return peso;
	}
	
	/**
	 * Metodo comprobarConsumoEnergetico(char consumoenergetico) Clase Madre Electrodomestico, 
	 * comprueba que el consumo Energetico ingresado sea un caracter, se definio asi por los valores
	 * del codigo ASSCI de las letras mayusculas A hasta la F. al comprobar el caracter lo retorna
	 * en el constructor de objeto electrodomestico con todos los atributos.
	 * @param consumoEnergetico.
	 */	
   public void comprobarConsumoEnergetico(char consumoEnergetico){
        
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
        }
          
    }
	/**
	 * Metodo comprobarColor(String color) Clase Madre Electrodomestico, 
	 * comprueba que el color ingresado sea un String perteneciente al arreglo colores [5],
	 * si el valor ingresado es igual al que esta guardado en el arreglo, un booleano retorna que si se cumple lo anterior
	 * comprobado es verdadero, con ello color toma el valor ingresado, de no ser igual mostrara el valor de color por defecto
	 * "BLANCO".
	 * @param color
	 */	
	
	public void comprobarColor(String color) {

		String colores[] = new String[5];
		colores[0] = "BLANCO";
		colores[1] = "AZUL";
		colores[2] = "NEGRO";
		colores[3]= "ROJO";
		colores[4]="GRIS";
		boolean comprobado= false; 
		for (int i = 0; i < colores.length && !comprobado; i++) {
			if (colores[i].contentEquals(color)) {
				comprobado = true;
			}
		}			
		if (comprobado) {
			this.color = color;
		} else {
			this.color = COLOR_DEFECTO;
		}
	}
	
	
	/**
	 * Metodo precioFinal() Clase Madre Electrodomestico, 
	 * Crea una variable precioBaseELectrodomentico para acumular los valores agregados al precioBase del electrodomestico por concepto
	 * de consumoEnergetico y peso. con un menu donde se evalua el parametro ingresado en consumoEnergetico, segun
	 * sea el caso agregara un valor de consumoEnergetico a la variable creada y para el caso del peso ocurre lo mismo,
	 * segun sea el rango de peso del electrodomestico sumara un valor a la variable creada.
	 * para luego retornar el precio final del electrodomestico dado por la suma de precioBaseElectrodomestico + precioBase.
	 * @param consumoEnergetico
	 * @param peso
	 * @param precioBase
	 * @return  precioBaseElectrodomestico
	 */	
    public float precioFinal(){
    	float precioBaseElectrodomestico = 0;
        switch(consumoEnergetico){
            case 'A':
            	precioBaseElectrodomestico+=100;
                break;
            case 'B':
            	precioBaseElectrodomestico+=80;
                break;
            case 'C':
            	precioBaseElectrodomestico+=60;
                break;
            case 'D':
            	precioBaseElectrodomestico+=50;
                break;
            case 'E':
            	precioBaseElectrodomestico+=30;
                break;
            case 'F':
            	precioBaseElectrodomestico+=10;
                break;
        }
       
        if(peso>=0 && peso<=19){
            precioBaseElectrodomestico+=10;
        }else if(peso>=20 && peso<49){
        	precioBaseElectrodomestico+=50;
        }else if(peso>=50 && peso<=79){
        	precioBaseElectrodomestico+=80;
        }else if(peso>=80){
        	precioBaseElectrodomestico+=100;
        }
        precioBaseElectrodomestico = precioBaseElectrodomestico + precioBase;
       
        return precioBaseElectrodomestico ;
    }
    
    
}
