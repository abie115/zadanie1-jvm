package com.abiewska.jvm;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<int[]> lista = new ArrayList<int[]>();
		while (true) {
			lista.add(new int[5000000]);
		}
	}
}
