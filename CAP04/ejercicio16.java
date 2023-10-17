public class ejercicio16 {
    public static void main(String[] args) {
        String respuesta;
        int puntos = 0;
        System.out.println("Creamos el test para saber si tu pareja te es infiel o no");
        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("2. Ha aumentado sus gastos de vestuario. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer). \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("5. No te deja que mires la agenda de su teléfono móvil. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tu delante. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. \n(t)rue o (f)alse: ");
        respuesta =System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("9. Has notado que últimamente se perfuma más. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo. \n(t)rue o (f)alse: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("t")){
            puntos +=3;
        }
        if (puntos<=10){
            System.out.print("\n Enhorabuena tu pareja te es totalmente fiel");
        }
        if ( (puntos > 11 ) && (puntos <= 22) ) {
            System.out.print("\n Quizás exista el peligro de que tu pareja te sea algo infiel. No dejes de controlarlo. ");
        }
        if ( puntos >= 22 ) {
            System.out.print("\n Tu pareja te es totalmente infiel, es decir, puede estar con otra persona a la vez. ");
        }
    }
}
