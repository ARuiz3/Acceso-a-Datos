package actividad1;
import java.util.*;
import java.io.*;
public class Acces43481229M {
    public static void main(String[] args) {
        try{
        AccesFileWriter43481229M.UseFileWriter();
        AccesFileReader43481229M.UseFileReader();
        AccesFileInputStream.UseFileInputStream();
        AccesFileOutputStream43481229M.UseFileOutputStream();
        AccesRandomAccesFile43481229M.UseRandomAccesFile();
        }catch (FileNotFoundException FNFE) {
            System.err.println("No se ha encontrado la dirección el archivo");
        } catch (IOException IOE) {
            System.err.println("Se ha producido un error en la entrada o salida de datos");
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error");
        }
    }
}
