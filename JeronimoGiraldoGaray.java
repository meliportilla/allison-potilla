
public class JeronimoGiraldoGaray {

    public static void main(String[] args) {
        System.out.println("ejercisios sena");
        
        System.out.println(" ");

        // volumen de un cubo
        System.out.println("Volumen del Cubo");
            System.out.println(" ");
        double ladoCubo = 5.0;
        double volumenCubo = ladoCubo * ladoCubo * ladoCubo; 
        System.out.println("El lado del cubo es: " + ladoCubo);
        System.out.println("El volumen del cubo es: " + volumenCubo);
        System.out.println(" ");

        // volumen de una esfera
        System.out.println("Volumen de la Esfera");
            System.out.println(" ");
        double radioEsfera = 3.0;
        double PI = 3.14159;
        double volumenEsfera = (4.0 / 3.0) * PI * radioEsfera * radioEsfera * radioEsfera;
        System.out.println("El radio de la esfera es: " + radioEsfera);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);
        System.out.println(" ");

        // suma de tres primeros números naturales
        System.out.println("Suma de Naturales");
            System.out.println(" ");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int sumaNaturales = num1 + num2 + num3;
        System.out.println("Los primeros tres números naturales son: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("La suma de los tres primeros números naturales es: " + sumaNaturales);
        System.out.println(" ");

        // descuento aplicado a una compra ---
        System.out.println("Descuento de Compra");
            System.out.println(" ");
        double precioCompra = 150.0;
        double porcentajeDescuento = 10.0;
        double montoDescuento = precioCompra * (porcentajeDescuento / 100.0);
        double precioFinalCompra = precioCompra - montoDescuento;
        System.out.println("El precio original de la compra es: $" + precioCompra);
        System.out.println("El porcentaje de descuento es: " + porcentajeDescuento + "%");
        System.out.println("El monto del descuento es: $" + montoDescuento);
        System.out.println("El precio final con descuento es: $" + precioFinalCompra);
        System.out.println(" ");

        // --- Cálculo de la propina a dejar en un restaurante ---
        System.out.println("Propina en Restaurante");
            System.out.println(" ");
        double totalRestaurante = 85.50;
        double porcentajePropina = 15.0;u
        double montoPropina = totalRestaurante * (porcentajePropina / 100.0); 
        double totalAPagar = totalRestaurante + montoPropina; 
        System.out.println("El total de la cuenta del restaurante es: $" + totalRestaurante);
        System.out.println("El porcentaje de propina deseado es: " + porcentajePropina + "%");
        System.out.println("El monto de la propina es: $" + montoPropina);
        System.out.println("El total a pagar incluyendo la propina es: $" + totalAPagar);
    }
    
}

