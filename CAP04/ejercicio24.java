public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("1. Programador junior");
        System.out.println("2. Programador senior");
        System.out.println("3. Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        int cargo = Integer.parseInt(System.console().readLine());

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int viajeVisita = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca su estado ciivil (1. Soltero, 2. Casado): ");
        int estadoCivil = Integer.parseInt(System.console().readLine());

        double sueldoBase=0;

        switch(cargo){
            case 1:
                sueldoBase=950;
                break;
            case 2: 
                sueldoBase=1200;
                break;
            case 3: 
                sueldoBase=1600;
                break;
            default:
                System.out.println("No ha elegido correctamente el cargo para el sueldo Base");
        }
        double sueldoDieta =viajeVisita*30;
        double sueldoBruto=sueldoBase + sueldoDieta;
        double irpf = 0;
        if (estadoCivil ==1){
            irpf=25;
        } else if (estadoCivil==2){
            irpf=20;
        } else{
            System.out.println("No ha elegido correctamente el estado civil");
        }
        double importeIrpf=(sueldoBruto*irpf)/100;
        System.out.println("----------------------------------");
        System.out.printf("|Sueldo Base              %7.2f|\n", sueldoBase);
        System.out.printf("|Dietas (%2d viajes)       %7.2f|\n",viajeVisita, sueldoDieta);
        System.out.println("|--------------------------------|");
        System.out.printf("|Sueldo Bruto             %7.2f|\n",sueldoBruto);
        System.out.printf("|Retención IRPF           %7.2f|\n", irpf, importeIrpf);
        System.out.println("|--------------------------------|");
        System.out.printf("|Sueldo neto              %7.2f|\n", sueldoBruto-importeIrpf);
        System.out.println("----------------------------------");
    }
}
