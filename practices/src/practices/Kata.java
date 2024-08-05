/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practices;

/**
 *
 * @author KelvinCi
 */
public class Kata {
    /*Dados dos números enteros a y b, que pueden ser positivos o negativos, 
    hallar la suma de todos los números enteros comprendidos entre
    ellos e incluyéndolos y devolverla. Si los dos números son iguales devuelve a o b.*/
    
    //pequeñp cambio
    public static int GetSum(int a, int b){
        int suma=0;
        if(a==b){
            return a;
        }
        
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
            
        }
        for (int i = a; i <= b; i++) {//1,2
            suma+=i;
        }
        return suma;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//CREAR UNA FUNCION QUE COMPRUEBE UNA PALABRA ISOGRAMATICA
    public static boolean isoDef(String word) {
        int cantidad = 0;
        String abece = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < abece.length(); i++) {
            char letra = abece.charAt(i);//-----------
            for (int j = 0; j < word.length(); j++) {
                char letras = word.charAt(j);
                if (Character.toLowerCase(letras) == Character.toLowerCase(letra)) {
                    cantidad++;
                }
            }
            if (cantidad > 1) {
                return false;
            }
            cantidad=0;

        }
        return true;
    }

    public static int conteoLetras(String word, char letra) {
        int cant = 0;
        for (int i = 0; i < word.length(); i++) {
            char letras = word.charAt(i);
            if (letras == letra) {
                cant++;
            }
        }
        return cant;
    }

    public static boolean isograma(String word) {
        String abece = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < abece.length(); i++) {
            char letra = abece.charAt(i);
            int cantidad = Kata.conteoLetras(word, letra);
            if (cantidad > 1) {
                return false;
            }

        }
        return true;
    }

    //separar las letras cuando encuentre un camel case
    public static String SepararCamelCase(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        StringBuilder finalWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letra = word.charAt(i);
            // Si la letra es mayúscula y no es la primera letra, añadir un espacio antes
            if (Character.isUpperCase(letra) && i != 0) {
                finalWord.append(' ');
            }
            finalWord.append(letra);
        }

        return finalWord.toString();
    }

    public static String parOimpar(int[] array) {
        if (array.length == 0) {
            return "even";
        }

        int suma = 0;
        for (int numb : array) {
            suma += numb;

        }
        if (suma % 2 != 0) {

            return "odd";
        }
        return "even";
    }

    public static boolean validarr(String num) {
        if (num.length() != 4) {
            return false;
        }

        for (int i = 0; i < num.length(); i++) { // Comenzar desde 0
            char letra = num.charAt(i);
            if (!Character.isDigit(letra)) {
                return false;
            }
        }
        return true; // Todos los caracteres son dígitos
    }

    public static boolean validar(String num) {
        if (num.length() != 4) {
            return false;
        }

        for (int i = 0; i < num.length(); i++) {
            char letra = num.charAt(i);
            if (!Character.isDigit(letra)) {
                return false;

            } else {
                return false;
            }
        }

        return true;
    }

    public static int sumaDisminitiva(int numbers) {//entra un numero x y se tiene que sumar como si fueran individuales
        //ejemplo;entra 123->1+2+3->6
        //192->1+9+2->12->3
        //creo variable vacia
        if (numbers > 0) {
            if (numbers < 10) {
                return numbers;
            } else {
                int suma = 0;
                //pasare los numeros a string
                String numeros = Integer.toString(numbers);
                //recorro el largo del numero siendo un string
                for (int i = 0; i < numeros.length(); i++) {
                    //los paso a char para que sea individual
                    char num = numeros.charAt(i);
                    //les resto su valor numchar
                    int numEnnum = num - '0';
                    //lo agrego en caso de que este vacio, y si tiene algo,
                    //lo sumara con lo que tiene ya agregado.
                    suma += numEnnum;

                }
                return sumaDisminitiva(suma);

            }
        } else {
            System.out.println("Insertar valores positivos");
            return 0;
        }

    }
}
