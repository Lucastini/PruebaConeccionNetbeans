
package negocio;

public class Comision {
    private String descripcion;
    private Alumno alumnos[];
    
    public Comision(){
        descripcion="Sin descripcion";
        alumnos=new Alumno[50];
    }
    public Comision(String desc){
        descripcion=desc;
        alumnos=new Alumno[50];
    }
    public void setDescripcion(String desc){
        descripcion=desc;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getDatosAlumnos(){
        String aux="Datos de los alumnos:";
        String aux2=aux;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null)
                aux+="\n"+alumnos[i].todosLosDatos()+"\n";
        if(aux2.equals(aux))
            aux+="\nLa Comision aun no tiene alumnos";
        return aux;
    }
    public String toString(){
        return "Descripcion de la comision: "+descripcion+"\n"+getDatosAlumnos();
    }
    public String todosLosDatosComision(){
        return toString()+"\nPromedio gral comision: "+notaPromedioGral()+", Mayor nota: "+mayorNotaGeneral()+", Menor nota: "+menorNotaGeneral();
    }
    public boolean addAlumno(Alumno a){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]==null){
                alumnos[i]=a;
                aux=true;
                break;
            }
        return aux;
    }
    public boolean removeAlumno(int legajo){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].getLegajo()==legajo){
                alumnos[i]=null;
                aux=true;
                break;
            }
        return aux;
    }
    public boolean addExamenAAlumno(int legajo,Examen e){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].getLegajo()==legajo){
                if(alumnos[i].addExamen(e))
                    aux=true;
                break;
                }
        return aux;            
    }
    public boolean removeExamenAAlumno(int legajo, int nroExamen){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].getLegajo()==legajo){
                if(alumnos[i].removeExamen(nroExamen))
                    aux=true;
                break;
            }
        return aux;         
    }
    public Alumno buscarAlumno(int legajo){
        Alumno al=null;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].getLegajo()==legajo){
                al=alumnos[i];
                break;
            }
        return al;
    }
    public boolean modExamenAAlumno(int legajo, int nroExamen, int nuevaNota){
        boolean aux=false;
        Alumno al=buscarAlumno(legajo);
        if(al!=null)
            if(al.modExamen(nroExamen, nuevaNota))
                aux=true;
        return aux;
    }
    public double notaPromedioGral(){
        double promG=0d;
        double acumNotas=0d;
        int alumnosConExamenes=0;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].cantidadExamenesRendidos()!=0){
                acumNotas+=alumnos[i].notaPromedio();
                alumnosConExamenes++;
            }
        if(alumnosConExamenes!=0)
            promG=acumNotas/(double)alumnosConExamenes;
        return promG;
    }
    public double mayorNotaGeneral(){
        double mayorNota=0d;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].mayorNota()>mayorNota)
                mayorNota=alumnos[i].mayorNota();
        return mayorNota;
    }
    public double menorNotaGeneral(){
        double menorNota=10d;
        int contAlumnosConExamenes=0;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].cantidadExamenesRendidos()!=0&&alumnos[i].menorNota()<menorNota){
                menorNota=alumnos[i].menorNota();
                contAlumnosConExamenes++;
            }
        if(contAlumnosConExamenes==0)
            menorNota=0d;               
        return menorNota;
    }
    public double porcAprobacion(int codExamen){
        double porc=0d;
        int contAlumnosQueLoAprobaron=0;
        int contAlumnosQRindieronExamen=0;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].buscarExamen(codExamen)!=null){
                contAlumnosQRindieronExamen++;
                if(alumnos[i].buscarExamen(codExamen).aprobado())
                    contAlumnosQueLoAprobaron++;
            }
        if(contAlumnosQRindieronExamen>0)
            porc=(double)(contAlumnosQueLoAprobaron*100/contAlumnosQRindieronExamen);
        return porc;
    }
    
    
}
