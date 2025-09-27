import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("David");
        uniqueNames.add("Juan");
        uniqueNames.add("David");  // No se añadirá ya que es duplicado

        System.out.println("Unique Names: " + uniqueNames);

        //Iterar sobre el set
        for(String name : uniqueNames){
            System.out.println(name);
        }
    }
}
