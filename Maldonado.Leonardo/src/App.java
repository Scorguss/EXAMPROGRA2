import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
   
 public static void main(String[] args) throws Exception {
        int cedula= 1755315916 ;
        String correo= "BRAYAN.MALDONADO@EPN.EDU.EC";
        String nombre= "BRAYAN LEONARDO MALDONADO MAFLA";
        System.out.println("CEDULA: " +cedula);
        System.out.println("CORREO: " +correo); //octubre 11/13 chuncho jimenes
        System.out.println("NOMBRE: " +nombre);
        Login login = new Login();
        login.Login();
            

     }

    //public Menu lmmenu(){
    //public boolean lmlogin(){
    


public static void egLeerArchivo(String archivo) throws IOException {
            String cadena;
    FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);
    while((cadena = b.readLine())!=null) {
        String datos[]= cadena.split(";");
        for (String string : datos) {
            System.out.println("Materia" + datos[2]);
        }
        //System.out.println(cadena);
    }
    b.close();
   }
  
}