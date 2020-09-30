


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class prueba {
  
  private static final boolean String = false;

public static String combinar(Object [] _array) {
	//metodo 1
	StringBuilder sc = new StringBuilder();
	List<Object> listas=Arrays.asList(_array);
	listas.forEach((l)->sc.append(l.toString()+" "));
	sc.deleteCharAt(sc.length()-1);
	//
	
	//metodo 2
	Arrays.stream(_array).forEach((l)->sc.append(l.toString()+" "));
	sc.deleteCharAt(sc.length()-1);
	return sc.toString();
	//
  }

  public static void main(String[] args) {
    Object [] array = { "hola", 3.1416, "adios", 4, true };
    String resultado = combinar(array); // "hola 3.1416 adios 4 true"
    System.out.println(resultado); 
  }

}
