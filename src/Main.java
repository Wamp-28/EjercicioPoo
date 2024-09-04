import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CLASE SE LLAMA ESTUDIANTE ok
        // ATRIBUTOS NOMBRE, EDAD, NOTA1, NOTA2, NOTA3 ok
        // METODOS PARA CALCULAR EL PROMEDIO DE NOTAS Y MOSTRAR LA INFORMACION DEL ESTUDIANTE CON SU PROMEDIO ok
        // CREAR VARIOS OBJETOS EN EL MAIN OK
        // AGREGAR LOS OBJETOS A UNA LISTA

        Scanner teclado =new Scanner(System.in);

        List<Estudiante> lstEstudiantes = new ArrayList<>();


        // clase - objeto - instancia

        // Este estudiante se creo por le constructor


        Estudiante est1 = new Estudiante();

        System.out.println("Ingrese nombre");
        est1.setNombre(teclado.next());

        System.out.println("Ingrese edad");
        est1.setEdad(teclado.nextInt());

        System.out.println("Ingrese nota1");
        est1.setNota1(teclado.nextDouble());

        System.out.println("Ingrese nota2");
        est1.setNota2(teclado.nextDouble());

        System.out.println("Ingrese nota3");
        est1.setNota3(teclado.nextDouble());

        est1.setPromedio(est1.calcularPromedio(est1.getNota1(), est1.getNota2(), est1.getNota3()));

        Estudiante est2 = new Estudiante();

        System.out.println("Ingrese nombre");
        est2.setNombre(teclado.next());

        System.out.println("Ingrese edad");
        est2.setEdad(teclado.nextInt());

        System.out.println("Ingrese nota1");
        est2.setNota1(teclado.nextDouble());

        System.out.println("Ingrese nota2");
        est2.setNota2(teclado.nextDouble());

        System.out.println("Ingrese nota3");
        est2.setNota3(teclado.nextDouble());

        est2.setPromedio(est1.calcularPromedio(est1.getNota1(), est1.getNota2(), est1.getNota3()));

        lstEstudiantes.add(est1);
        lstEstudiantes.add(est2);


        System.out.println(lstEstudiantes.size());


        for(Estudiante es: lstEstudiantes){
            System.out.println(es);
        }

    }
}