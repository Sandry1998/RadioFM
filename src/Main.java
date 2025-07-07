import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

menu();

    }
    static void menu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Encendiendo la Radio...indica la frecuencia");
    double frecuenciaInicial= sc.nextDouble();
    SintonizadorFM radio=new SintonizadorFM(frecuenciaInicial);
        int opcion=0;
        do {
            System.out.println("***RADIO FM***");
            System.out.println("1. Subir Frecuencia");
            System.out.println("2. Bajar Frecuencia ");
            System.out.println("3. Mostrar Frecuencia ");
            System.out.println("4. Salir ");
            System.out.println("Opción--> ");
            try{
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1->radio.subirFrecuencia();
                    case 2->radio.bajarFrecuencia();
                    case 3-> radio.mostrarFrecuencia();
                    case 4->System.out.println("Apagando la radio");
                    default -> System.out.println("Opción no valida");
                }
            }catch(Exception e){
                System.out.println("Opción no valida");
                sc.nextLine();
            }

        }while(opcion!=4);

    }

}