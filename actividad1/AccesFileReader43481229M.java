package actividad1;

import java.util.*;
import java.io.*;

public class AccesFileReader43481229M {
    static void UseFileReader() throws FileNotFoundException, IOException {
        Scanner sc = null;
        FileReader fr = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Introduzca la dirección del archivo: ");
            String file = sc.nextLine();
            fr = new FileReader(file);
            int valor = fr.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fr.read();
            }
        } catch (FileNotFoundException FNFE) {
            System.err.println("No se ha encontrado la dirección el archivo");
        } catch (IOException IOE) {
            System.err.println("Se ha producido un error en la entrada o salida de datos");
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error");
        } finally {
            sc.close();
            fr.close();
        }
    }
}