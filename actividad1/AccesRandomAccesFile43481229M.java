package actividad1;

import java.util.*;
import java.io.*;

public class AccesRandomAccesFile43481229M {
    static void UseRandomAccesFile() {
        Scanner sc = null;
        RandomAccessFile raf = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Introduzca la dirección del archivo donde deseas guardar lo que escriba");
            String file = sc.nextLine();
            System.out.println("Introduzca el modo en el que esta el fichero (por ejemplo rw)");
            String modo = sc.nextLine();
            raf = new RandomAccessFile(file, modo);
            System.out.println("Que deseas escribir en el fichero?");
            String texto = sc.nextLine();
            raf.writeChars(texto);

            System.out.println("Has escrito " + raf.readLine());
        } catch (FileNotFoundException FNFE) {
            System.err.println("No se ha encontrado la dirección el archivo");
        } catch (IOException IOE) {
            System.err.println("Se ha producido un error en la entrada o salida de datos");
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error");
        } finally {
            sc.close();
            try {
                raf.close();
            } catch (IOException e) {

            }
        }
    }
}