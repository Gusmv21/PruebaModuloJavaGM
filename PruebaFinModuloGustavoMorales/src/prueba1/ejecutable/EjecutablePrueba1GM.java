/**
 * 
 */
package prueba1.ejecutable;
import prueba1.modelo.*;
/**
 * @author Gustavo Morales
 *Clase Ejecutable Prueba 1 GM 
 *clase que ejecuta  a las clases del package prueba1.modelo.
 */
public class EjecutablePrueba1GM {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
        //Creamos un array de Electrodomesticos
        Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomesticos(200, 60, "AZUL", 'D');
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Televisor(500, 80, "NEGRO", 'E' , 56, false);
        listaElectrodomesticos[3]=new Electrodomesticos();
        listaElectrodomesticos[4]=new Electrodomesticos(600, 20,  "GRIS", 'A');
        listaElectrodomesticos[5]=new Lavadora(300, 40, "BLANCO",'Z', 79);
        listaElectrodomesticos[6]=new Televisor(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, "ROJO",'B', 15);
        listaElectrodomesticos[8]=new Televisor(200, 60,"ROSA", 'C', 36, true);
        listaElectrodomesticos[9]=new Electrodomesticos(50, 10);
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        float sumaElectrodomesticos=0;
        float sumaTelevisiones=0;
        float sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
		
	

}


