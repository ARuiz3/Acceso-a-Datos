package actividad1;
import java.util.*;
import java.io.*;

public class AccesFileWriter43481229M {
    static void UseFileWriter(){
        Scanner sc = null;
        FileWriter fw = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Introduzca la dirección del archivo donde deseas guardar lo que escriba");
            String file = sc.nextLine();
            fw = new FileWriter(file);
            System.out.println("Que deseas escribir en el archivo?");
            String content = sc.nextLine();
            fw.write(content);
            fw.flush();
        }catch(FileNotFoundException FNFE){
            System.err.println("No se ha encontrado la dirección el archivo");
        }catch(IOException IOE){
            System.err.println("Se ha producido un error en la entrada o salida de datos");
        }catch (Exception e) {
            System.err.println("Ha ocurrido un error");
        }finally{
            sc.close();
            try {
                fw.close();
            } catch (IOException e) {
            }
        }
    }
}
