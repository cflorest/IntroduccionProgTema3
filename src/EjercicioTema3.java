public class EjercicioTema3 {
    public static void main(String[] args) {

        // Primera parte: Suma valores Tema 3
         sumar(20,30);

        // Segunda Parte: Agregar puertas al coche Tema 3
        Coche miCoche = new Coche();
        miCoche.agregaPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

 static void sumar(int num1, int num2) {
     System.out.println(num1 + num2);
}

public static class Coche{
       public int numeroPuertas = 2;

        public void agregaPuertas(){
            this.numeroPuertas++;
        }
}
}
