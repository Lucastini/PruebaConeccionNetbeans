
package negocio;

public class Principal {

    public static void main(String[] args) {
        /*Examen e1,e2,e3,e4,e5;
        e1=new Examen(123,"Matematica",7);
        e2=new Examen(124,11);
        e3=new Examen(125,"Lengua",2);
        e4=new Examen(126,"Fisica",8);
        e5=new Examen(127,10);
        
        System.out.println("Datos originales Examen");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
      
        Alumno a1,a2,a3,a4,a5;
        a1=new Alumno("Lucas", "Pagliettini");
        System.out.println("\nDatos originales de a1:\n"+a1.toString());
        System.out.println("\nAgregando a a1 examen 1 "+a1.addExamen(e1));
        System.out.println("Agregando a a1 examen 2 "+a1.addExamen(e2));
        System.out.println("Agregando a a1 examen 3 "+a1.addExamen(e3));
        System.out.println("Agregando a a1 examen 4 "+a1.addExamen(e4));
        System.out.println("Agregando a a1 examen 5 "+a1.addExamen(e5));
        System.out.println("Luego de carga de examenes: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 2 "+a1.modExamen(124,10));
        System.out.println("Luego de examen 2 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a1.modExamen(125,3));
        System.out.println("Luego de examen 3 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 5: "+a1.removeExamen(127));
        System.out.println("Datos Finales de alumno a1: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
      
        
        a2=new Alumno();
        System.out.println("\n\nDatos originales de a2: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a2 examen 1 "+a2.addExamen(e1));
        System.out.println("Agregando a a2 examen 2 "+a2.addExamen(e2));
        System.out.println("Agregando a a2 examen 3 "+a2.addExamen(e3));
        System.out.println("Agregando a a2 examen 4 "+a2.addExamen(e4));
        System.out.println("Agregando a a2 examen 5 "+a2.addExamen(e5));
        System.out.println("Luego de carga de examenes: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a2.modExamen(125,6));
        System.out.println("Luego de examen 3 modificado: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        
        a3=new Alumno();
        System.out.println("\n\nDatos originales de a3: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a3 examen 1 "+a3.addExamen(e1));
        System.out.println("Agregando a a3 examen 2 "+a3.addExamen(e2));
        System.out.println("Agregando a a3 examen 3 "+a3.addExamen(e3));
        System.out.println("Agregando a a3 examen 4 "+a3.addExamen(e4));
        System.out.println("Luego de carga de examenes: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a3.modExamen(125,5));
        System.out.println("Luego de examen 2 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 4 "+a3.modExamen(126,4));
        System.out.println("Luego de examen 4 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 2: "+a3.removeExamen(124));
        System.out.println("Datos Finales de alumno a3: "+a3.toString());
        System.out.println("Otros datos examenes a1: "+a3.otrosDatosExamenes());*/
        
        //A PARTIR DE AQUI LAS INDICACIONES DE INSTANCIAR SEGUN EJERCICIO 7
        System.out.println("\n\n\n\"A PARTIR DE AQUI LAS INDICACIONES DE INSTANCIAR SEGUN EJERCICIO 7");
        Comision c1=new Comision("Division 'A'");
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Agregando al alumno 1: "+c1.addAlumno(new Alumno("Aldo","Sanchez")));
        System.out.println("Agregando al alumno 2: "+c1.addAlumno(new Alumno()));
        System.out.println("Agregando al alumno 3: "+c1.addAlumno(new Alumno("Lucas","Pagliettini")));
        System.out.println("Agregando al alumno 4: "+c1.addAlumno(new Alumno("Edgardo","Garcia")));
        System.out.println("Agregando al alumno 5: "+c1.addAlumno(new Alumno("Matias", "Tini")));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Agregando examen 123 a a1: "+c1.addExamenAAlumno(1,new Examen(123,"Matematica",11)));
        System.out.println("Agregando examen 123 a a2: "+c1.addExamenAAlumno(2,new Examen(123,"Matematica",10)));
        System.out.println("Agregando examen 123 a a3: "+c1.addExamenAAlumno(3,new Examen(123,"Matematica",9)));
        System.out.println("Agregando examen 123 a a4: "+c1.addExamenAAlumno(4,new Examen(123,"Matematica",8)));
        System.out.println("Agregando examen 123 a a5: "+c1.addExamenAAlumno(5,new Examen(123,"Matematica",-2)));
        
        System.out.println("Agregando examen 124 a a1: "+c1.addExamenAAlumno(1,new Examen(124,8)));
        System.out.println("Agregando examen 124 a a3: "+c1.addExamenAAlumno(3,new Examen(124,4)));

        System.out.println("Agregando examen 125 a a1: "+c1.addExamenAAlumno(1,new Examen(125,"Lengua",4)));
        System.out.println("Agregando examen 125 a a2: "+c1.addExamenAAlumno(2,new Examen(125,"Lengua",4)));
        System.out.println("Agregando examen 125 a a3: "+c1.addExamenAAlumno(3,new Examen(125,"Lengua",4)));
        
        System.out.println("Agregando examen 126 a a1: "+c1.addExamenAAlumno(1,new Examen(126,"Java",10)));
        System.out.println("Agregando examen 126 a a3: "+c1.addExamenAAlumno(3,new Examen(126,"Java",7)));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Modificando nota examen 123 a a3: "+c1.modExamenAAlumno(3, 123, 8));
        System.out.println("Modificando nota examen 123 a a1: "+c1.modExamenAAlumno(1, 123, 10));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Eliminando Examen 124 a a2: "+c1.removeExamenAAlumno(2, 124));
        System.out.println("Eliminando Examen 123 a a5: "+c1.removeExamenAAlumno(5, 123));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Eliminando Alumno a5: "+c1.removeAlumno(5));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
        
        System.out.println("Modificando nota examen 123 a a1: "+c1.modExamenAAlumno(1, 123, 9));
        System.out.println("\n"+c1.todosLosDatosComision());
        System.out.println("Porcentaje de aprobacion examen 123: "+c1.porcAprobacion(123)+"%\n\n");
    }
  
}
