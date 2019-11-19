package archivosejercicios6;
import java.io.*;

public class ArchivosEjercicios6 {

        public static void main(String[] args) {
            final int BUFFER_SIZE = 312 * 1024;
            System.out.println("Copiando archivo binario...");
            try {
                InputStream archivoEntrada = new FileInputStream (new File("it's miku hours.mp4"));
                OutputStream archivoSalida = new FileOutputStream(new File("it's miku hours again.mp4"));
                
                byte[] buf = new byte[BUFFER_SIZE];
                int cantidadLeida;
                while((cantidadLeida = archivoEntrada.read(buf,0,BUFFER_SIZE)) > 0) {
                    archivoSalida.write(buf,0,cantidadLeida);
                }
                archivoEntrada.close();
                archivoSalida.close();
            }
            catch (Exception errorDeArchivo){
                System.out.println("Ha habido problemas : " + errorDeArchivo.getMessage());
            }
            System.out.println("Terminado!");
        
    }
    
}
