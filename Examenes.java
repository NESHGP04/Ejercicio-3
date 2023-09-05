/* Ejercicio 3 - Arreglos dinámicos
 * Marinés García
 * 23391
 * CLASES
 */

import java.util.ArrayList;

public class Examenes {

    //Definir variables
    int nota;
    String nClase;
    String sede;
    ArrayList<String> cursos = new ArrayList<String>();
    ArrayList<String> sedes = new ArrayList<String>();

    public Examenes(String nClase, int nota, String sede){
        this.nClase = nClase;
        this.nota = nota;
        this.sede = sede;
    }

    //Getters
    public String getNClase(){
        return this.nClase;
    }

    public int getNota(){
        return this.nota;
    }

    public String getSede(){
        return this.sede;
    }

}
