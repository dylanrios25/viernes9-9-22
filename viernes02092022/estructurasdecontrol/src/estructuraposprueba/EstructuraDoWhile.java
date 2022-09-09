package estructuraposprueba;

public class EstructuraDoWhile {

	public static void main(String[] args) {
		/*Estructura repetitivas
		 * -Estructura preprueba
		 * ---Estructura while
		 * -Estructura postprueba
		 * ---Estructura do...while*/
		 
		int num= 5;
		while (num<10) { //prueba
			num++;
			System.out.println("num ="+ num);
		}
		//con el while
		do {
			num++;
			System.out.println("num ="+ num);
      		
	} while (num<10);
  		
    
      }
}

