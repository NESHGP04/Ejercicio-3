/* Ejercicio 3 - Arreglos dinámicos
 * Marinés García
 * 23391
 * CLASES
 */

import java.util.ArrayList;

public class Estudiante {

    String nombre = " ";
    int codigo = 0;
    String correo = " ";

    private ArrayList<Examenes> curso = new ArrayList<>();
    //private ArrayList curso;
    private ArrayList<Examenes> sedes = new ArrayList<>();
    //ArrayList<Integer> sedes = new ArrayList<>();

    int nota = 0;
    int suma = 0;
    int mediana = 0;
    int moda = 0;
    float desv = 0;
    int cant = 0; //Array?
    int max = 0;
    int min = 0;
    float promedio  = 0;

    String nacimiento;

    public Estudiante(String nombre, int codigo, String correo, String nacimiento){
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.nacimiento = nacimiento;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public int getNota(){
        return this.nota;
    }

    public String getNacimiento(){
        return this.nacimiento;
    }

    //Materias 
    public void setCursos(Examenes cursos){
        this.curso.add(cursos);
    }

    public void setSedes(Examenes sed){
        this.sedes.add(sed);
    }

    public int getCant(){
        return this.curso.size();
    }

    //Arraylist sedes
    public ArrayList<Integer> getSede(){
        ArrayList<Integer> sedes = new ArrayList<>();
        for(int i = 0; i<sedes.size(); i++){
            sedes.add(i);
        }
        return sedes;
    }

    //Datos estadísticos
        //Promedio
    public float getPromedio(){
        int n = this.curso.size();
        if (n==0){
            return 0.0f;
        }
        float suma = 0.0f;

        return suma/n;
    }

    public void setPromedio(){
        System.out.println(this.getNombre() + " - " + this.getCodigo() + " - " + this.getCorreo() + " : " + this.getPromedio());
    }
        //Mediana
    public double getMediana(){
        int n = this.curso.size();
        double a[] = new double[n]; //QUITAR: Esto se hace al agregar los cursos 
        double m = 0;

        if(n%2 == 1){
            m = a[(n+1)/2-1];
        } else{
            m = (a[n/2-1] + a[n/2]) / 2;
        }
        return m;
    }

        //Moda
    public void setModa(){
        int n = this.curso.size();
        int [] a=new int[n]; 
	    int [] b=new int[n];
        int c = 0; //ESTO VA CON n PERO NO SÉ XQ

        for (int i=0 ;i<this.curso.size() ; i++){
            c = 1;
            if(a[i] == -1){
                b[i] = 0;
            } else{
                for(int j = i+1; j<n; j++){
                    if(a[i] == a[j]){
                        c++;
                        a[j] = -1;
                    }
                }
                b[i] = c;
            }
        }
        int m = b[0];
        for(int i = 1; i < n; i++){
            if((b[i]>m)){
                m = b[i];
            }
        }
        System.out.println("mode:"); 
	    for(int i=0;i<n;i++) {
	        if(b[i]==m)
              System.out.println(a[i]);   
	    }

    }    

        //Desviación estándar
    public void setDesv(){
        int n = this.curso.size();
        int valor[] = new int[n];
        float media = 0; 
        double varianza = 0.0;
        double desviacion= 0.0;

        media = suma / n;

        for(int i = 0 ; i < n; i++){
            double rango;
            rango = Math.pow(valor[i] - media, 2f);
            varianza = varianza + rango;
        }

        varianza = varianza / n; //suma de diferencias sobre "n"
        desviacion = Math.sqrt(varianza); //raíz cuadrada
        System.out.println("Desvianción Estándar: " + desviacion);
    }    
}
