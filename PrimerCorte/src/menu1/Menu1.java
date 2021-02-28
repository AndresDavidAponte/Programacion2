package menu1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu1 {
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        String seguir = "si";
        while (seguir.equals("si")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("---Menú---");
            System.out.println("1. Ejecución de Instrucciones.");
            System.out.println("2. Suma, Producto y Diferencia.");
            System.out.println("3. Suma, Promedio, Producto, Cociente y Modulo Decimales.");
            System.out.println("4. Longitud y Área de un Circulo.");
            System.out.println("5. Conversion de Caracter.");
            System.out.println("6. Calcular BMI.");
            System.out.println("7. Promedio de Utilidad de un Producto.");
            System.out.println("8. Mostrar un Menú (Visualmente Realizado).");
            System.out.println("9. Calculo Total de un Viaje.");
            System.out.println("10. Conversion de Kg.");
            System.out.println("11. Unidades, Decenas, Centenas.");
            System.out.print("Digite la opcion que desea relizar: ");
            opcion = teclado.nextInt();
            
            
            switch(opcion){
                case 1:
                    punto1();
                    break;
                    
                case 2:
                    punto2();
                    break;
                
                case 3:
                    punto3();
                    break;
                
                case 4:
                    punto4();
                    break;
                
                case 5:
                    punto5();
                    break;
                
                case 6:
                    punto6();
                    break;
                
                case 7:
                    punto7();
                    break;
                    
                case 8:
                    punto8();
                    break;
                    
                case 9:
                    punto9();
                    break;
                
                case 10:
                    punto10();
                    break;    
                
                case 11:
                    punto11();
                    break;
                            
                default:
                    System.err.println("Opcion invalida");
                    break;
            }
            System.out.print("¿Desea seguir utilizando el programa? (si/no): ");
            seguir = teclado.next();
        }
        System.out.println("Muchas Gracias");
        System.out.println("By Andres Aponte"); 
    }
    public static void punto1(){
        System.out.println("\n");
        System.out.println("---Ejecucion de Instrucciones---");
        int num1, num2;
        System.out.print("Digite el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.printf("x = %d\n",num1 );
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
        System.out.printf("x=%d.2f\n", num1 );
        //System.out.printf(“x=%.2f”, x ); ENVIABA UN ERROR PORQUE EL NUMERO DEBE SER FLOTANTE (FLOAT) PARA MOSTRAR LOS DECIMALES
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) ); 
    }
    public static void punto2(){
        System.out.println("\n");
        System.out.println("---Suma, Producto y Diferencia---");
        int num1, num2;
        System.out.print("Digite el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.printf("El valor de %d + %d es %d\n", num1, num2, ( num1 + num2 ) );
        System.out.printf("El valor de %d * %d es %d\n", num1, num2, ( num1 * num2 ) );
        System.out.printf("El valor de %d - %d es %d\n", num1, num2, ( num1 - num2 ) );
    }
    public  static void punto3(){
        System.out.println("\n");
        System.out.println("---Operaciones Basicas---");
        double num1, num2, suma, promedio, producto, cociente, modulo;
        System.out.print("Digite el primer numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Digite el segundo numero: ");
        num2 = teclado.nextFloat();
        suma = num1 + num2;
        promedio = (num1 + num2)/2;
        producto = num1 * num2;
        cociente = num1 / num2;
        modulo = num1 % num2;
        DecimalFormat df = new DecimalFormat("#.00");//LIMITO LOS DECIMALES A APARECCER
        System.out.println("La Suma es: " + df.format(suma));
        System.out.println("El Promedio es: " + df.format(promedio));
        System.out.println("El Producto es: " + df.format(producto));
        System.out.println("El Cociente es: " + df.format(cociente));
        System.out.println("El Modulo es: " + df.format(modulo));
    }
    
    public static void punto4(){
        System.out.println("\n");
        System.out.println("---Longitud y Área de una Circunferencia---");
        double radio, area, longitud;
        System.out.print("Digite el Radio de la Circunferencia: ");
        radio = teclado.nextFloat();
        area = (Math.PI * Math.pow(radio,2)); //MULTIPLICO PI POR RADIO AL CUADRADO
        longitud = (2 * Math.PI * radio) ;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La Longitud de la Circunferencia es: " + df.format(longitud) + " cm");
        System.out.println("El Área de la Circunferencia es: " + df.format(area) + " cm^2");
    }
    
    public static void punto5(){
        System.out.println("\n");
        System.out.println("---Conversion de Char---");
        String stringCaracter;
        System.out.print("Digite el caracter: ");
        stringCaracter = teclado.next();
        char caracter = stringCaracter.charAt(0);
        int conversion = (int)caracter;
        System.out.println(stringCaracter + " es en la tabla del codigo Ascii: " + conversion);
    }
    
    public static void punto6(){
        System.out.println("\n");
        System.out.println("---Calcular BMI---");
        double kg, metros, BMI;
        System.out.print("Digite Cuanto Pesa en Kg: ");
        kg = teclado.nextDouble();
        System.out.print("Digite Cuanto Mide en m: ");
        metros = teclado.nextDouble();
        BMI = kg/(Math.pow(metros,2));
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Su BMI es de: " + df.format(BMI));  
    }
    
    public static void punto7(){
        System.out.println("\n");
        System.out.println("---Porcentaje de Utilidad---");
        double precioProducto, precioVenta, ganancia;
        System.out.print("Digite el Valor del Producto: ");
        precioProducto = teclado.nextDouble();
        System.out.print("Digite el Valor de la Venta: ");
        precioVenta = teclado.nextDouble();
        ganancia = precioVenta - precioProducto;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("El % de Utilidad del producto es: " + df.format(ganancia));
    }
    
    public static void punto8(){
        System.out.println("\n");
        System.out.println("---Impresion de un Menú---");
        System.out.println("Visualmente realizado debido a que ya estamos trabajando un menú");
    }
    
    public static void punto9(){
        System.out.println("\n");
        System.out.println("---Calculo Total de un Viaje---");
        int dias, totalkm; double costo_gas, promedioKm_Gas, pago_Estacionamiento, peajes, paso1, paso2, paso3, paso4, total;
        System.out.print("Digite la Cantidad Total de Días: ");
        dias = teclado.nextInt();
        System.out.print("Digite la Cantidad Total de Kilometros: ");
        totalkm = teclado.nextInt();
        System.out.print("Digite el Precio de la Gasolina por Litro: ");
        costo_gas = teclado.nextDouble();
        System.out.print("Digite el Promedio de Kilometros por Litros de Gasolina: ");
        promedioKm_Gas = teclado.nextDouble();
        System.out.print("Digite el Pago por Estacionamiento Diario: ");
        pago_Estacionamiento = teclado.nextDouble();
        System.out.print("Digite el Pago por Peaje Diario: ");
        peajes = teclado.nextDouble();
        paso1 =  totalkm / promedioKm_Gas;
        paso2 = paso1 * costo_gas;
        paso3 = peajes * dias;
        paso4 = pago_Estacionamiento * dias;
        total = paso2 + paso3 + paso4;
        System.out.println("El Costo Total del Viaje es " + total);       
    }
    
    public static void punto10(){
        System.out.println("\n");
        System.out.println("---Conversion de Kilogramos---");
        double kg, g, libras, toneladas;
        System.out.print("Digite los Kilogramos a Convertir: ");
        kg = teclado.nextDouble();
        g = kg * 1000;
        libras = kg * 2.205;
        toneladas = kg / 1000;
        System.out.println(kg + "Km son: " + g + "g.");
        System.out.println(kg + "Km son: " + libras + " libras.");
        System.out.println(kg + "Km son: " + toneladas + " toneladas.");             
    }
    
    public static void punto11(){
        System.out.println("\n");
        System.out.println("---Unidades, Decenas y Centenas---");
        int num, unidades, decenas, centenas;
        System.out.print("Digite el Número Separar: ");
        num = teclado.nextInt();
        if (num >= 0 && num <=999){
            centenas = num / 100;
            unidades = num % 10;
            if (centenas != 0){
                num = num - (centenas * 100);
            }
            decenas = num / 10;
            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        }else{
            System.out.println("El Número Está Fuera de Rango");
        }    
    }
}
    
    
        