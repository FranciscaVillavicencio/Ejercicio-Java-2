public class Main {
    public static void main(String[] args) {

        int numerolf = 30;

        if(numerolf > 0){
            System.out.println("es positivo");
        }else if (numerolf < 0){
            System.out.println("es negativo");
        }else if (numerolf == 0){
            System.out.println("es igual a cero");
        }

        //ejercicio 2

        int numeroWhile = 0;

        while (numeroWhile <= 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        }


        //ejercicio 3

         int numero = 3;

         do {
             System.out.println(numero);
             numero = numero + 1;
         }
         while(numero < 3);


         // ejercicio 4

        int numeroFor= 0;

        for (; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }


        // ejercicio 5

        //switch and case

        var estacion = "OTOÑO";

        switch (estacion){
            case "VERANO":
                System.out.println("estamos en  Verano");
                break;
            case "PRIMAVERA":
                System.out.println("estamos en Primavera");
                break;
            case "INVIERNO":
                System.out.println("Estamos en Invierno ");
                break;
            case "OTOÑO":
                System.out.println("Estamos en Otoño ");
                break;
            default:
                System.out.println("No es una estación ");
        }








    }
}