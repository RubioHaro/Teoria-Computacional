import java.util.ArrayList;
import java.lang.Math; 


/**
 * Diccionario
 */
public class Diccionario {
    ArrayList<String> elements = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();

    public Diccionario() {
        this.elements = createArrayList("a", "b","c");
    }

    public Diccionario(ArrayList elements) {
        this.elements = elements;
    }

    public static <T> ArrayList<T> createArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<T>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public String toString() {
        return elements.toString();
    }



    public String getCombinations(int n) {
        int tam = elements.size();
        System.out.println("Tamano del diccionario:" + tam);
        System.out.println("n es:" + n);
        result = new ArrayList<>();

        int temp=(int)Math.pow(n, tam);
        
        // for (var i = 1; i < n; i++) {
        //     temp = temp*tam;
        //     System.out.println(temp);
        // }
        
        

        System.out.println( tam + "^" + n + " es:" + temp);


        for (var i = 0; i < tam; i++) {
            result.add(elements.get(i));
            System.out.println("Se agrego:" + i);
        }
        return result.toString();
    }

}