package br.com.bytebank.banco.test.uti;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());

		Boolean bReaf = Boolean.FALSE;
		System.out.println(bReaf.booleanValue());

		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
	}
}
