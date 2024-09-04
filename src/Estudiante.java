public class Estudiante {

    // CLASE SE LLAMA ESTUDIANTE - ok
    // ATRIBUTOS NOMBRE, EDAD, NOTA1, NOTA2, NOTA3 - ok
    // Metodos Constructor get - set - toString - ok
    // METODOS PARA CALCULAR EL PROMEDIO DE NOTAS Y MOSTRAR LA INFORMACION DEL ESTUDIANTE CON SU PROMEDIO - ok
    // CREAR VARIOS OBJETOS EN EL MAIN E IR AGREGANDO A UNA LISTA

    // Atributos de la clase
    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    // Constructor vacio

    public Estudiante() {
    }

    //Constructor con parametros

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }


    // metodos getter - setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    //Generar el metodo toString


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                '}';
    }

    public double calcularPromedio(double nota1, double nota2, double nota3) {

        this.promedio = (nota1 + nota2 + nota3) / 3;

        return promedio;
    }


}
