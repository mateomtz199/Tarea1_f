package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clase para guardar los objetos en un fichero
 * @author Yo
 */
public class GuardarIO {
    /**
     * Variable que almacenara el fichero
     */
    private static File archivo = new File("Archivo.melys");
    public static ArrayList <Licencia> licencias;
    /**
     * metodo para guardar
     * @param licencia Parametro de entrada que es el objeto con los datos ya completos
     */
    public static void guardar(Licencia licencia){
        try {
            FileOutputStream outputStream = new FileOutputStream(archivo, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(licencia);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardarIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void leer(){
        licencias = new ArrayList<>();
        FileInputStream fi = null;
        ObjectInputStream oi = null;
        try {
            fi = new FileInputStream(archivo);
            oi = new ObjectInputStream(fi);
            Licencia lic = (Licencia) oi.readObject();
            licencias.add(lic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardarIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuardarIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int noControl(){
        if(!archivo.exists()) return 0;
        else{
            leer();
            return licencias.size() + 1;
        }
    }
}
