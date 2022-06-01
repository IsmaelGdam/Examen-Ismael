/*
*	grupo  : Gdam 1-1
*	alumno : Ismael Domínguez Sánchez
*	n.exp. : 7234
*	fecha  : 01/06/2022
 */
package Cheese;
//version final
/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
        System.out.println("1º Gdam: Entornos de desarrollo");
        ListaProductos lp = new ListaProductos();
         
        Producto p1 = new Producto("123","Semi-Desnatada", 50, 30);
        Producto p2 = new Producto("124","Desnatada", 30, 28);
        
        lp.addProducto(p1);
        lp.addProducto(p2);
        
        p1.imprime_detalle();
         System.out.println("");
        p2.imprime_detalle();
        
    }
}
