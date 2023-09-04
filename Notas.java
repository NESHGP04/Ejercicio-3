/* Ejercicio 3 - Arreglos dinámicos
 * Marinés García
 * 23391
 * MAIN
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Notas{

    public static void Menu(){
        System.out.println("=== Registro de exámenes ===");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Agregar curso");
        System.out.println("3. Datos analíticos");
        System.out.println("4. Salir");
    }

    public static void printEstudiantes(ArrayList <Estudiante> estudiantes){
        System.out.print("\nLista de estudiantes: ");
        for(int i = 0; i < estudiantes.size(); i++){
            System.out.println(i + " - " + estudiantes.get(i).getNombre());
        }
    } //No necesario

    public static void main(String[] args){

        //Definir variables
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String opcion = " ";
            //Case1
        String nombreEstudiante = " ";
        String correoEstudiante = " ";
        int caodigoEstudiante = 0; 
        String fechaEstudiante = " ";
        int indice = 0;
            //Case2
        String sedeScan = " ";    
        ArrayList<String>sede = new ArrayList<String>();  
        


        ArrayList<Estudiante>estudiantes = new ArrayList<Estudiante>();

        System.out.println("Ingrese opción deseada: ");

        while(salir = false){
            Menu();

            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    System.out.println("Agregar estudiante>>");

                    System.out.println("\nIngrese su nombre y apellido: ");
                        nombreEstudiante = sc.nextLine();

                    System.out.println("\nIngrese su fecha de nacimiento (día/mes/año): ");
                        fechaEstudiante = sc.nextLine();
                        sc.nextLine();

                    System.out.println("\nIngrese su correo electrónico: ");
                        correoEstudiante = sc.nextLine();

                    System.out.println("\nIngrese su código: ");
                        caodigoEstudiante = sc.nextInt();
                        sc.nextLine();

                    estudiantes.add(new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, fechaEstudiante));    

                    break;
                
                case "2":
                System.out.println("Agregar Cursos>>");
                

                System.out.println("1. Matemática \n2.Lenguaje  \n3.Química \n4. Física \n5. Comprensión Lectora \n6.Estadística");
                indice = sc.nextInt();
                sc.nextLine();

                switch(indice){
                    case 1: 
                    System.out.println("\n¿En qué sede realizó el examen?");
                    sedeScan = sc.nextLine();

                    for(int i = 0; i < sede.size(); i++){
                        sede.add(sedeScan);
                    }
                    // for(Estudiante estudiante : estudiantes){
                    //     estudiante.imprimirCursos();  
                    // } NO NECESARIO

                    System.out.println("\nAgregar nota de Matemática: ");
                    int notaMate = sc.nextInt();
                    sc.nextLine();
                        

                    break;

                    case 2:
                    System.out.println("\n¿En qué sede realizó el examen?");

                    System.out.println("\nAgregar nota de Lenguaje: ");
                    int notaLeng = sc.nextInt();
                    sc.nextLine();

                    break;

                    case 3:
                    System.out.println("\n¿En qué sede realizó el examen?");

                    System.out.println("\nAgregar nota de Química: ");
                    int notaQuim = sc.nextInt();
                    sc.nextLine();
                    break;

                    case 4:
                    System.out.println("\n¿En qué sede realizó el examen?");

                    System.out.println("\nAgregar nota de Física: ");
                    int notaFisica = sc.nextInt();
                    sc.nextLine();
                    break;


                    case 5:
                    System.out.println("\n¿En qué sede realizó el examen?");

                    System.out.println("\nAgregar nota de Comprensión Lector: ");
                    int notaCompre = sc.nextInt();
                    sc.nextLine();
                    break;


                    case 6: 
                    System.out.println("\n¿En qué sede realizó el examen?");

                    System.out.println("\nAgregar nota de Estadística: ");
                    int notaEsta = sc.nextInt();
                    sc.nextLine();
                    break;

                    default:
                    System.out.println("\nFavor ingresar uno de los índices en el menú.");
                }


                

            }
        }    
    }
        
 }