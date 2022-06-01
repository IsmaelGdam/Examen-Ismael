/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }

    /**
     * Añade un nuevo producto a nuestra lista de productos creada
     * @param prod producto que se desea agregar
     * @return objeto producto añadido y, si ya existe, devuleve nulo
     */
    public Producto addProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    /**
     * Elimina uno de los productos que tengamos registrados
     * @param codigo busca los productos segun el codigo que tengan vinculado
     * @return devuelve el producto eliminado
     */
    public Producto eliminarProducto(String codigo) { 
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }

    /**
     * Busca productos registrados existentes
     * @param codigo busca los productos registrados segun el codigo que tengan asociado
     * @return devuelve una lista de los productos con ese codigo registrados
     */
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }

    /**
     * Genera una lista con todos los productos que tengamos registrados
     * @return devuelve una lista con todos los productos registrados
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * Busca el numero total de productos que tengamos registrados
     * @return Devuelve el numero total de productos que tengamos registrados
     */
    public int totalProductos(){
            return this.getN();
    }
}
