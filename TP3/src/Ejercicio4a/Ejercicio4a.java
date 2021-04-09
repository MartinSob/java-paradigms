package Ejercicio4a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio4a {


    public static String LeerArchivo(){

        try{

            BufferedReader Lector = new BufferedReader(new FileReader("TP3/src/Ejercicio4a/Palabras.txt"));

            String linea = Lector.readLine();
            int PalabraElegida = new Random().nextInt(7);
            int Contador = 0;
            while (linea != null){
                if (Contador == PalabraElegida){return linea;}
                Contador++;
                linea = Lector.readLine();
            }

        }
        catch (FileNotFoundException e){}
        catch (IOException e){}

        return null;
    }

    public static void main(String[] args){

        String Palabra;
        String Respuesta;
        Scanner scan = new Scanner(System.in);
        String input;
        String Resultado;

        int Intentos = 5;

        Palabra = LeerArchivo();
        Respuesta = Misterio(Palabra.length());


        while (Intentos != 0 ) {

            System.out.println(Respuesta + "    Numero de intentos: " + Intentos);
            input = scan.next().toUpperCase();


            if(input.length()>1){
                if(input.equals(Palabra)){
                    Intentos = 0;
                    System.out.println(Palabra + "    Felicidades!! ");
                }else{
                    Intentos = 0;
                    System.out.println(Palabra + "    Perdiste");
                }
            }
            if(input.length()==1) {
                Resultado = BucarLetra(Palabra, input,Respuesta);

                if (Resultado.equals("no")){
                    Intentos--;
                } else{
                    Respuesta = Resultado;
                }
                if (Respuesta.equals(Palabra)){
                    Intentos = 0;
                    System.out.println(Respuesta + "    Felicidades!! ");
                }

            }

        }





    }


    public static String BucarLetra (String pPalabra, String pLerta, String pRespuesta){
        int cont = 0;
        StringBuffer Final = new StringBuffer(pRespuesta);

        Boolean Flag = false;

        while (cont != pPalabra.length()){

            if (pPalabra.charAt(cont) == pLerta.charAt(0)) {

                Final.setCharAt(cont,pLerta.charAt(0));
                Flag = true;
            }
            cont++;
        }
        if (Flag == true){return Final.toString();}


            return "no";
    }





    public static String Misterio (int pCantidad){



        String Devolver = new String();
        int i = 0;

        while (i != pCantidad){
            Devolver = Devolver + "-";
            i++;
        }


        return Devolver;
    }

}
