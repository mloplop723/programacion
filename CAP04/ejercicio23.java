public class ejercicio23 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = System.console().readLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = System.console().readLine();
        int tipoIVANum = 0;
        switch(tipoIVA) {
            case "general":
                tipoIVANum = 21;
                break;
            case "reducido":
                tipoIVANum = 10;
                break;
            case "superreducido":
                tipoIVANum = 4;
                break;
            default:
                System.out.println("El tipo de IVA que has introducido es incorrecto");
        }
        double iva = baseImponible * tipoIVANum/100;
        double precioSinDescuento = baseImponible + iva;
        double descuento = 0;
        switch(codigoPromocional) {
            case "nopro":
                break;
            case "mitad": // el precio se reduce a la mitad
                descuento = precioSinDescuento / 2;
                break;
            case "meno5": // se descuentan 5 euros
                descuento = 5;
                break;
            case "5porc": // se descuenta el 5%
                descuento = precioSinDescuento * 0.05;
                break;
            default:
                System.out.println("El código promocional que has introducido es incorrecto");
        }
        double total = precioSinDescuento - descuento;
        System.out.printf("Base imponible       %6.2f\n", baseImponible);
        System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANum, iva);
        System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
        System.out.printf("Código promo (%5s) -%6.2f\n", codigoPromocional, descuento);
        System.out.printf("TOTAL                %6.2f", total);
    }
}
