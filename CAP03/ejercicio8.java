

public class ejercicio8 {
    public static void main(String[] args) {
        //CALCULAR EL SALARIO SEMANAL DE UN EMPLEADO EN BASE A LAS HORAS TRABAJADAS (12€ LA HORA)
        System.out.print("Ingrese el número de horas trabajadas durante la semana: ");
        int horastrabemp = Integer.parseInt(System.console().readLine());
        //Una vez introducida las horas trabajadas durante la semana calculamos su salario semanal que sería con esta operación: salariosemanal=(horastrabemp*12)
        System.out.println("Su salario semanal es de " + (horastrabemp * 12) + " euros");
      }
}
