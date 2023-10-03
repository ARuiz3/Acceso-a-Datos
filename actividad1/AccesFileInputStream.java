package actividad1;

import java.util.*;
import java.io.*;
public class AccesFileInputStream {
    static void UseFileInputStream(){
        Scanner sc= null;
        FileInputStream fis = null;
        try{
            sc = new Scanner(System.in);
            System.out.println("Introduzca la dirección del archivo");
            String file = sc.nextLine();
            fis = new FileInputStream(file);

            int valor=fis.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fis.read();
            }
        }catch(FileNotFoundException FNFE){
            System.err.println("No se ha encontrado la dirección el archivo");
        }catch(IOException IOE){
            System.err.println("Se ha producido un error en la entrada o salida de datos");
        }catch (Exception e) {
            System.err.println("Ha ocurrido un error");
        }finally{
            sc.close();
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
    }
}