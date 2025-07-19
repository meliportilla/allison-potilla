public class Main {
    public static void main(String[] args) {
        System.out.println("Punto uno");
        String x = "Dayana";
        int y = 15;
        System.out.println("Nombre: " + x + ", Edad: " + y);

        System.out.println("Punto dos");
        int a = 14;
        int b = 27;
        int c = a + b;
        System.out.println(c);

        System.out.println("Punto tres");
        int p = 50;
        int q = 11;
        int r = p - q;
        System.out.println(r);

        System.out.println("Punto cuatro");
        int m = 7;
        int n = 4;
        int o = m * n;
        System.out.println(o);

        System.out.println("Punto cinco");
        double u = 45.0;
        double v = 5.0;
        double w = u / v;
        System.out.println(w);

        System.out.println("Punto seis");
        int t = 9;
        int z = t * t;
        System.out.println(z);

        System.out.println("Punto siete");
        double f = 30.0;
        double g = (f * 9 / 5) + 32;
        System.out.println("F: " + g);

        System.out.println("Punto ocho");
        int l = 8;
        int k = 12;
        int perimetro = 2 * (l + k);
        System.out.println(perimetro);

        System.out.println("Punto nueve");
        double h = 5.0;
        double area = 3.1416 * h * h;
        System.out.println(area);

        System.out.println("Punto diez");
        int ao = 3;
        int dias = ao * 365;
        System.out.println(dias);

        System.out.println("Punto once");
        int j = 11;
        int doble = j * 2;
        int triple = j * 3;
        System.out.println("Doble: " + doble + ", Triple: " + triple);

        System.out.println("Punto doce");
        double km = 2.3;
        double metros = km * 1000;
        double cms = metros * 100;
        System.out.println(km + " km = " + metros + " m y " + cms + " cm");

        System.out.println("Punto trece");
        int ladoC = 5;
        int areaC = ladoC * ladoC;
        int perC = ladoC * 4;
        System.out.println("Área: " + areaC + ", Perímetro: " + perC);

        System.out.println("Punto catorce");
        int ladoCubo = 3;
        int volCubo = ladoCubo * ladoCubo * ladoCubo;
        System.out.println(volCubo);

        System.out.println("Punto quince");
        double radioEsfera = 4.0;
        double volEsfera = (4.0 / 3.0) * 3.1416 * radioEsfera * radioEsfera * radioEsfera;
        System.out.println(volEsfera);

        System.out.println("Punto dieciséis");
        int suma = 1 + 2 + 3;
        System.out.println(suma);

        System.out.println("Punto diecisiete");
        double precio = 523.0;
        double porcentajeDescuento = 10.0; // 10%
        double totalConDescuento = precio - (precio * porcentajeDescuento / 100);
        System.out.println(totalConDescuento);

        System.out.println("Punto dieciocho");
        double totalCuenta = 356.0;
        double porcentajePropina = 15.0; // 15%
        double propina = totalCuenta * porcentajePropina / 100;
        System.out.println(propina);
    }
}