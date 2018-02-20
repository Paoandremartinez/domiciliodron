
package domiciliodron;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
/**
 *
 * @author pmartinez
 */
public class Archivo {
    
public String leerArchivo (String localFile ,String ruta)   {
   
   String  response="Archivo no fue encontrado";
   
        try {
                        
            if(localFile.equals("1")){
               String cadena;
               FileReader f = new FileReader (ruta);
               BufferedReader b= new BufferedReader (f);
               while ((cadena =b.readLine ())!=null){
               System.out.println(cadena);
               }
                
            }else{
                InputStream file = Archivo.class.getResourceAsStream(ruta) ;
                    int data = file.read();
                while(data != -1) {

                    System.out.print((char) data);
                    data = file.read();
                }
            }
            
            
            
            response="Archivo procesado con exito";
        }
    
    catch (IOException ex) 
    {
        
         
        
    }finally{
            
            return response;
        }
            
    }
}       

