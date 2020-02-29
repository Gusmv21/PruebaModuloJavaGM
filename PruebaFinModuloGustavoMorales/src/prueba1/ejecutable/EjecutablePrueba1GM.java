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
	 * Metodo principal del ejecutable prueba1 GM
	 * metodo que al pasar los datos de electrodomesticos, lavadora y televisor en un arreglo de 10 posiciones, sumara el valor total
	 * de electrodomesticos, de lavadoras y de televisores, previamente comparados por una funcion llamada intanceof.
	 * al tener comparados los precios finales de cada una de las clases mencionadas, imprimira por consola los valores
	 * de la suma total de sus precios. 
	 *  
	 */
	public static void main(String[] args) {
        
        Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomesticos(100, 40, "AZUL", 'A');
        listaElectrodomesticos[1]=new Electrodomesticos(150, 55, "ROJO", 'B');
        listaElectrodomesticos[2]=new Electrodomesticos(100, 90, "BLANCO",'C');
        listaElectrodomesticos[3]=new Electrodomesticos();
        listaElectrodomesticos[4]=new Lavadora();
        listaElectrodomesticos[5]=new Lavadora(250, 10, "NEGRO", 'D', 25);
        listaElectrodomesticos[6]=new Lavadora(300, 60, "GRIS", 'E', 50);
        listaElectrodomesticos[7]=new Televisor(400, 49, "NARANJA", 'F', 80, true);
        listaElectrodomesticos[8]=new Televisor(450, 60,"ROSA", 'C', 36, false);
        listaElectrodomesticos[9]=new Televisor();
   

    	/**
    	 * Metodo principal del ejecutable prueba1 GM
    	 * Se crean tres variables para acumular la suma de los precios finales de cada una de las clases
    	 * sumaElectrodomesticos, sumaTelevisores, sumaLavadoras. el arreglo es recorrido por un for
    	 * y usando la funcion intanceof, cuando una lavadora o un televisor estan creados dentro del array
    	 * tipo electrodomestico, el for pasara tanto por la clase electrodomestico y por la de si clase hija, 
    	 * ya que las clases hijas son electrodomesticos y ademas su clase
    	 */
        float sumaElectrodomesticos=0;
        float sumaTelevisores=0;
        float sumaLavadoras=0;
   
  
        for(int i=0;i<listaElectrodomesticos.length;i++){
    
            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
                sumaTelevisores+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
    	/**
    	 * Metodo principal del ejecutable prueba1 GM
    	 *Con estas instanciaciones se imprimen por consola los resultados solicitados por el problema.
    	 */
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
		
	

}


