package clase.pkg2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase2 {
    private static Scanner teclado = new Scanner(System.in);

    public static void ejemplo_clase2(){
    String EdadCadena = "20";
        int edad;
        EdadCadena = "3.14159";
        double ValorPi = Double.parseDouble(EdadCadena);
        
        char c = "Hola".charAt(1);
        System.out.println("c Valor de charArt 3 =" + c);
        
        
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt(); 
        System.out.println("EdadCadena tu edad es = " + edad);
        
        EdadCadena = String.valueOf(22);
        System.out.println("EdadCadena = " + EdadCadena);  
        
        short s = 129;
        byte b = (byte)s;
        s = b;
    }
  
    public static void radio(){
        System.out.println("Ingresa el radio: ");
        double radio = Double.parseDouble(teclado.nextLine());
        double area = Math.PI * Math.pow(radio, 2 );
        System.out.println("area = " + area);
               
        
    }
    
    public static void area(){
        String entrada = JOptionPane.showInputDialog("Introduce un radio");
        double radio = Double.parseDouble(entrada);
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("area = " + area);
        
    }
    
    public static void CodigosASCII(){
        String texto;
        int codigo=0;
        System.out.println("Ingresa un codigo ASCII");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);
        char carcter = (char) codigo;
        System.out.println("Carcter = " + carcter);
        
    }
    
    public static String LetrasASCII(String palabra){
        int codificar=0; 
        String resultado = "";
        int llave = 0;
        
        for ( int x=0; x<palabra.length(); x++){
            
            codificar = (int)palabra.charAt(x);
            codificar = codificar + llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
            
        }
        return resultado;
        
        
        
        
    }
        
    public static void main(String[]args){
        //ejemplo_clase2();
        //radio();  
        //area();
        //CodigosASCII();
        
        String res = LetrasASCII("HOLA JESUS");
        System.out.println("res = " + res);
        
        System.out.println("La palabra a pasar a codigo ASCII es = " + res);
        byte[] bytes = res.getBytes(StandardCharsets.US_ASCII);
        
        System.out.println("ASCII :" + bytes[0]);
        System.out.println("ASCII :" + bytes[1]);
        System.out.println("ASCII :" + bytes[2]);
        System.out.println("ASCII :" + bytes[3]);
        System.out.println("ASCII :" + bytes[4]);
        System.out.println("ASCII :" + bytes[5]);
        System.out.println("ASCII :" + bytes[6]);
        System.out.println("ASCII :" + bytes[7]);
        System.out.println("ASCII :" + bytes[8]);
        System.out.println("ASCII :" + bytes[9]);
       

    }
    
}