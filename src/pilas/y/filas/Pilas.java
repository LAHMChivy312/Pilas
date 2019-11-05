/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas.y.filas;

import javax.swing.JOptionPane;

/**
 *
 * @author lilian
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Opcion,a;
        int pila[] = new int[10];
        pila objpilaEnteros = new pila(pila);
        //Agregarmos elementos a la pila de datos
        //el fondo de la pila seria 90 y la cima 12
//        objpilaEnteros.insertar(90);
//        objpilaEnteros.insertar(56);
//        objpilaEnteros.insertar(23);
//        objpilaEnteros.insertar(12);
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Elije la opcion que deseada \n"+
                    "1. Ingresar un Dato\n"+
                    "2. Eliminar un Dato\n"+
                    "3. Ver Datos\n"+
                    "4. Ver Cima\n"+
                    "5. Ver Fondo\n"+
                    "6. Salir\n"
                  
                    ));
             
            switch(Opcion)
            {
                case 1: 
                    a=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrasa el numero"));
                    objpilaEnteros.insertar(a);
                    break;
                case 2: objpilaEnteros.retirar();
                break;
                case 3: objpilaEnteros.mostrarpila();
                break;
                case 4: objpilaEnteros.cima();
                break;
                case 5: objpilaEnteros.fondo();
                break;
                case 6: System.exit(0);break;
                
            }
        }
        while(true);
    }
}
    
    


