import java.util.Scanner ;

public class Pitagoras{
    public static void main(String[] args){

        try(Scanner hipo = new Scanner (System.in)) {
            double a, b, c ;

            System.out.println("Coloque el valor de A: ");
            a = hipo.nextInt();

            System.out.println("Comoque el valor de B: ");
            b = hipo.nextInt();

            c = Math.sqrt((a*a) + (b*b));

            System.out.println("El valor de la Hipotenusa es :" + c);
        }




    }
}