package actividad1;
import java.util.*;
import java.io.*;
public class AccesFileOutputStream43481229M {
    static void UseFileOutputStream(){
    Scanner sc = null;
    FileOutputStream fos = null;
    try{
        sc = new Scanner(System.in);
        System.out.println("Introduce la dirección del fichero");
        String file = sc.nextLine();
        fos = new FileOutputStream(file);
        System.out.println("Introduce que quieres escribir en el fichero");
        String texto = sc.nextLine();
        byte codigos[] = texto.getBytes();
        fos .write(codigos);
    }catch(FileNotFoundException FNFE){
        System.err.println("No se ha encontrado la dirección el archivo");
    }catch(IOException IOE){
        System.err.println("Se ha producido un error en la entrada o salida de datos");
    }catch (Exception e) {
        System.err.println("Ha ocurrido un error");
    }finally{
        sc.close();
        try {
            fos.close();
        } catch (IOException e) {
        }
    }
}
}
