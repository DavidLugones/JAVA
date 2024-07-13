/*public class sumandonumeros {
    public static void main(String[] args) {
        int numero1 = 5; 
        int numero2 = 10; 

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}

public class resultadoyparidad {
    public static void main(String[] args) {
        int numero1 = 5; 
        int numero2 = 3; 

        int resultado = numero1 + numero2;

        // Determinar si el resultado es par o impar
        String paridad = (resultado % 2 == 0) ? "par" : "impar";

        // Mostrar el resultado y la paridad
        System.out.println("El resultado es " + resultado + " y es " + paridad);
    }
}


public class NombreCaracteres {
    public static void main(String[] args) {
        char c1 = 'i';
        char c2 = 'n';
        char c3 = 'f';
        char c4 = 'o';
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
//En cuanto a tu pregunta sobre por qué no se puede usar `""` en un `char`, es porque `char` está diseñado para almacenar un solo carácter, mientras que las comillas dobles `""` se utilizan para definir cadenas de texto.

public class CalculoDivisibilidad {
    public static void main(String[] args) {
        // Declarar y asignar los números enteros
        int num1 = 10;  
        int num2 = 5;   
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los dos números es: " + suma);
        
        // Verificando si el primer número es divisible por el segundo número sin usar if o else
        // Usando el operador ternario para determinar el mensaje de salida
        String resultado = (num2 != 0) 
                           ? (num1 % num2 == 0 ? num1 + " es divisible por " + num2 
                                               : num1 + " no es divisible por " + num2)
                           : "No se puede dividir por cero.";
        
        // Mostrar el resultado
        System.out.println(resultado);
    }
}

public class Incrementador {
    public static void main(String[] args) {
       
        int numero = 5;  
        
        // Incrementar el número 20 veces utilizando el operador de incremento
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        
        System.out.println("El número incrementado 20 veces es: " + numero);
    }
}

public class ConversionKilogramos {
    public static void main(String[] args) {
        
        double libras = 150;  
        // Declarando la constante para la conversión
        final double LIBRAS_A_KILOGRAMOS = 0.45359237;
        
        // Realizando la conversión a kilogramos
        double kilogramos = libras * LIBRAS_A_KILOGRAMOS;
        
        System.out.println(libras + " libras es igual a " + kilogramos + " kilogramos.");
    }
}

public class ConversionDolaresPesos {
    public static void main(String[] args) {
        
        double dolares = 50;  
        
        // Declarando la constante para la tasa de cambio
        final double TASA_DE_CAMBIO = 917;  // 1 dólar = 917 pesos
        
        // Realizaando la conversión a pesos
        double pesos = dolares * TASA_DE_CAMBIO;
        
        System.out.println(dolares + " dólares es igual a " + pesos + " pesos.");
    }
}

public class BitcoDolares {
    public static void main(String[] args) {
        
        double bitcoins = 0.5;  
        
        final double TASA_DE_CAMBIO = 50000;  
        double dolares = bitcoins * TASA_DE_CAMBIO;
        
        System.out.println(bitcoins + " bitcoins es igual a " + dolares + " dólares.");
    }
}

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        
        double celsius = 25; 
        
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
    
        System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");
    }
}

public class MediaAritmetica {
    public static void main(String[] args) {
       
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;
        
        final int NUM_ELEMENTOS = 5;
        
        double media = (n1 + n2 + n3 + n4 + n5) / (double) NUM_ELEMENTOS;
        
        System.out.println("La media aritmética de los números es: " + media);
    }
}*/

public class VelocidadFinal {
    public static void main(String[] args) {
        
        double velocidadInicial = 0.0;   
        double aceleracionGravedad = 9.81;  
        double tiempoTranscurrido = 5.0; 
        double velocidadFinal = velocidadInicial + aceleracionGravedad * tiempoTranscurrido;
        
        System.out.println("La velocidad final del objeto es: " + velocidadFinal + " m/s");
    }
}



