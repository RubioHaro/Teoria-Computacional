import java.util.Scanner; 
/**
 * run
 */
public class run {
    public static void main(String[] args) {
        Diccionario d = new Diccionario();
        System.out.println("Diccionario:" + d);
        System.out.print("Ingresa una cantidad n de numeros:");
        Scanner sc = new Scanner(System.in);

        try {
            int number = sc.nextInt();
            if(number<10 && number >0)
            d.getCombinations(number);
            else
        System.err.println("Numero no valido");
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: formato de numero ->" + e.getMessage());
        }

        
        
    }
}