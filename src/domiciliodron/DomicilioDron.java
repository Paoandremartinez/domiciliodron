/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domiciliodron;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pmartinez
 */
public class DomicilioDron {
    
    private static String optionTxt ="";
    private static boolean inputEnable = true;
    
    public static String inputText(){
        
        String ruta= "";
        while(inputEnable){
            ruta="domicilio.txt";
            System.out.println("Elija como desea cargar archivo (externa=1 / interna=2): ");
            Scanner scanner = new Scanner(System.in);
            optionTxt = scanner.nextLine().trim();
        
            //System.out.println("optionTxt: "+optionTxt);
        
            if (optionTxt.equals("1")){
                 ruta="C://domicilio.txt";
                 inputEnable = false;
            }else if(optionTxt.equals("2")){
                ruta="domicilio.txt";
                 inputEnable = false;
            }else{
               System.out.println("Opción no existe") ;
            }
        }
       
        return ruta;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // leer TXT
        
        
        
        try {
        
            String ruta = inputText();           
             Archivo doc = new Archivo ();
             String p = doc.leerArchivo(optionTxt, ruta);
             System.out.println(p);
             
        }
    
    catch (Exception ex) 
    {
       
        
    }
    
        
    
    }
}
