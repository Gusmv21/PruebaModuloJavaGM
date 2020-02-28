/**
 * Clase Madre Electrodomesticos, Proyecto Prueba 1 GM
 */
package prueba1.modelo;

/**
 * @author Gustavo Morales
 *Clase Madre Electrodomesticos
 *clase que entrega valores por defecto que pueden tener los objetos del tipo electrodomesticos y sus metodos.
 */
public class Electrodomesticos {
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	public static final float PRECIO_BASE_DEFECTO=100;
	public static final String COLOR_DEFECTO = "BLANCO";
	public static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	public static final int PESO_DEFECTO = 5;
	
/**
 * Constructores objetos de la Clase Madre Electrodomesticos
 * @param precioBase;
 * @param color;
 * @param consumoEnergetico;
 * @param peso;
 */	
	//Constructor por defecto
	public Electrodomesticos() {
		precioBase = PRECIO_BASE_DEFECTO;
		color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		peso = PESO_DEFECTO;
	}
	//constructor con parametros precio y peso
	public Electrodomesticos(float precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	//constructor con todos los atributos de la clase electrodomesticos
	public Electrodomesticos(float precioBase, int peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}
	//Get de los 4 atributos de la clase electrodomesticos.
	public float getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	
	//METODO COMPROBAR EL CONSUMO ENERGETICO
	public void comprobarConsumoEnergetico(char letra) {
		
		for (char i = 'A'; i < 'G'; i++) {
			if (this.consumoEnergetico==i) {
				letra = i;
			
			} else {
				letra = CONSUMO_ENERGETICO_DEFECTO;
			}
		}
	}
 /**   public void comprobarConsumoEnergetico(char consumoEnergetico){
        
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }
*/
	//METODO Comprobar color electrodomestico
	
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
     * Precio final del electrodomestico
     * @return precio final del electrodomestico
     */
    public float precioFinal(){
    	float precioBaseElectrodomestico = 0;
        float precioConsumo = 0;
        switch(consumoEnergetico){
            case 'A':
                precioConsumo+=100;
                break;
            case 'B':
            	precioConsumo+=80;
                break;
            case 'C':
            	precioConsumo+=60;
                break;
            case 'D':
            	precioConsumo+=50;
                break;
            case 'E':
            	precioConsumo+=30;
                break;
            case 'F':
            	precioConsumo+=10;
                break;
        }
        float precioTam = 0;
        if(peso>=0 && peso<=19){
            precioTam+=10;
        }else if(peso>=20 && peso<=49){
            precioTam+=50;
        }else if(peso>=50 && peso<=79){
            precioTam+=80;
        }else if(peso>=80){
            precioTam+=100;
        }
       precioBaseElectrodomestico =precioBase+ precioConsumo + precioTam;
       
        return precioBaseElectrodomestico;
    }
    
    
}
