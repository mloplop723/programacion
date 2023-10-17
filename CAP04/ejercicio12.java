public class ejercicio12 {
    public static void main(String[] args) {
        int puntos = 0;
        String respuesta;
        System.out.println("1. ¿Quién da la asignatura de programación?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Juan Antonio")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("2. ¿Quién es la profesora de bases de datos?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Eva María Perales Belizón")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("3. ¿Quién es la profesora de lenguajes de marca?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Pilar González")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("4. ¿Quién es el profesor de sistemas informáticos? ");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Fernando Parra Zurrita")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("5. ¿Quién es el profesor de Entornos de desarrollo?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("José")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("6. ¿Quién es la profesora de FOL?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Rosa Carmen Alcázar Rosal")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("7. ¿Es tu curso 1ºDAM?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("si")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("8. ¿Eres del turno de mañana?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Si")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("9. ¿Estás formándote para el DUAL?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Si")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("10. ¿Qué asignatura es la más importante en el módulo?");
        System.out.print(">");
        respuesta=System.console().readLine();
        if(respuesta.equals("Programación")){
            puntos++;
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
        System.out.println("\nHa obtenido "+puntos+" puntos");
    }
}
