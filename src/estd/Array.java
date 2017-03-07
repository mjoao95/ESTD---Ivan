package estd;

public class Array {

	int[] i = { 7, 4, 5, 6 }; // Int= Número qualquer, não pode ser invocado
								// como um atributo de classe, Primitivo

	Integer[] y; // Integer= Objeto com atributos, Complexo

	public void sum() {
		
		System.out.println(i.length);

		// System.out.println(i); = 0, por ser uma variável primitiva
		// System.out.println(y); = nulo, por ser um objeto que não foi instanciado

	}

}
