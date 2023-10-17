public class ejercicio15 {
    public static void main(String[] args) {
        System.out.print("Introduce el carácter que desee: ");
        String l = System.console().readLine();
        System.out.println("Pulse un número del 1 al 4 para saber como quieres la pirámide");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        int opc = Integer.parseInt(System.console().readLine());
        switch (opc){
            case 1:
                System.out.println("  " + l);
                System.out.println(" " + l + l + l);
                System.out.println(l + l + l + l + l);
                break;
            case 2: 
                System.out.println(l + l + l + l + l);
                System.out.println(" " + l + l + l);
                System.out.println(" " + l);
                break;
            case 3:
                System.out.println("    " + l);
                System.out.println("  " + l + " " + l);
                System.out.println(l + " " + l + " " + l);
                System.out.println("  " + l + " " + l);
                System.out.println("    " + l);
                break;
            case 4:
                System.out.println(l);
                System.out.println(l + " " + l);
                System.out.println(l + " " + l + " " + l);
                System.out.println(l + " " + l);
                System.out.println(l);
                break;
            default:
        }
    }
}
