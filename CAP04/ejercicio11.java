public class ejercicio11 {
    public static void main(String[] args) {
    
        System.out.println("primero introducirá la hora y luego los minutos.");
        
        System.out.print("Ingrese la hora: ");
        int hora = Integer.parseInt(System.console().readLine());  
        
        System.out.print("Ingrese los minutos: ");
        int minuto = Integer.parseInt(System.console().readLine());
    
        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segundosHastaMedianoche);
      }
}
