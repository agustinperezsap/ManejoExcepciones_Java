package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        
        try {
            resultado = division(10, 0);
            //si hay varios catch, se ponene de menor a mayor gerarquia
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exeption:");
            //mandamos a imprimir la pila de excepciones
           // e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        //este bloque de codigo siempre se ejecuta
        //este bloque se usa normalmente para cerrar recursos
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
