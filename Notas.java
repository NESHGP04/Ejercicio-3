/* Ejercicio 3 - Arreglos dinámicos
 * Marinés García
 * 23391
 * MAIN
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Notas{

    public static void Menu(){
        System.out.println("\n=== Registro de exámenes ===\n");
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
        boolean go = true;
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

        while(go){
            Menu();
            System.out.println("Ingrese opción deseada: "); 
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    System.out.println("\n<<Agregar estudiante>>");

                    System.out.println("\nIngrese su nombre y apellido: ");
                        nombreEstudiante = sc.nextLine();

                    System.out.println("\nIngrese su fecha de nacimiento (día/mes/año): ");
                        fechaEstudiante = sc.nextLine();

                    System.out.println("\nIngrese su correo electrónico: ");
                        correoEstudiante = sc.nextLine();

                    System.out.println("\nIngrese su código: ");
                        caodigoEstudiante = sc.nextInt();
                        sc.nextLine();

                    estudiantes.add(new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, fechaEstudiante));    

                    break;
                
                case "2":
                    System.out.println("\n<<Agregar Cursos>>");

                    printEstudiantes(estudiantes);
                    System.out.println("Ingrese el índice del alumno que desea añadir curso");
                    int index = sc.nextInt();
                    sc.nextLine();
                    
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

                            estudiantes.get(index).setCursos(new Examenes("Matemática", notaMate, sedeScan));
                            break;

                        case 2:
                            System.out.println("\n¿En qué sede realizó el examen?");
                            sedeScan = sc.nextLine();

                            for(int i = 0; i < sede.size(); i++){
                                sede.add(sedeScan);
                            }

                            System.out.println("\nAgregar nota de Lenguaje: ");
                            int notaLeng = sc.nextInt();
                            sc.nextLine();

                            estudiantes.get(index).setCursos(new Examenes("Lenguaje", notaLeng, sedeScan));
                            break;

                        case 3:
                            System.out.println("\n¿En qué sede realizó el examen?");
                            sedeScan = sc.nextLine();

                            for(int i = 0; i < sede.size(); i++){
                                sede.add(sedeScan);
                            }

                            System.out.println("\nAgregar nota de Química: ");
                            int notaQuim = sc.nextInt();
                            sc.nextLine();

                            estudiantes.get(index).setCursos(new Examenes("Química", notaQuim, sedeScan));
                            break;

                        case 4:
                            System.out.println("\n¿En qué sede realizó el examen?");
                            sedeScan = sc.nextLine();

                            for(int i = 0; i < sede.size(); i++){
                                sede.add(sedeScan);
                            }

                            System.out.println("\nAgregar nota de Física: ");
                            int notaFisica = sc.nextInt();
                            sc.nextLine();

                            estudiantes.get(index).setCursos(new Examenes("Física", notaFisica, sedeScan));
                            break;

                        case 5:
                            System.out.println("\n¿En qué sede realizó el examen?");
                            sedeScan = sc.nextLine();

                            for(int i = 0; i < sede.size(); i++){
                                sede.add(sedeScan);
                            }

                            System.out.println("\nAgregar nota de Comprensión Lectora: ");
                            int notaCompre = sc.nextInt();
                            sc.nextLine();

                            estudiantes.get(index).setCursos(new Examenes("Comprensión Lectora", notaCompre, sedeScan));
                            break;

                        case 6: 
                            System.out.println("\n¿En qué sede realizó el examen?");
                            sedeScan = sc.nextLine();

                            for(int i = 0; i < sede.size(); i++){
                                sede.add(sedeScan);
                            }

                            System.out.println("\nAgregar nota de Estadística: ");
                            int notaEsta = sc.nextInt();
                            sc.nextLine();

                            estudiantes.get(index).setCursos(new Examenes("Estadística", notaEsta, sedeScan));
                            break;

                        default:
                            System.out.println("\nFavor ingresar uno de los índices en el menú.");
                        
                        }
                        break;                                      

                case "3":
                    System.out.println("\n<<Datos estadísticos>>");   
                    
                    printEstudiantes(estudiantes);
                    System.out.println("Ingrese el índice del alumno que desea añadir curso");
                    int indexEst = sc.nextInt();
                    sc.nextLine();

                    //*** CAMBIAR Y FALTA CANT ALUMNOS Y MAX Y MIN ***/
                    Estudiante mean = new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, sedeScan);
                    estudiantes.get(indexEst).getPromedio();
                    //mean.setPromedio();

                    Estudiante mediana = new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, sedeScan);
                    estudiantes.get(indexEst).getMediana();
                    //mediana.getMediana();

                    Estudiante moda = new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, sedeScan);
                    estudiantes.get(indexEst).setModa();
                    //moda.setModa();

                    Estudiante desvest = new Estudiante(nombreEstudiante, caodigoEstudiante, correoEstudiante, sedeScan);
                    estudiantes.get(indexEst).setDesv();
                    //desvest.setDesv();

                    break;

                case "4":
                    System.out.println("Ha salido del programa!");
                    go = false;
                    break;

                default:
                    System.out.println("Favor ingresar una opción dentro del menú. ");
            }
        } 
        sc.close();       
    } 
}