package ar.com.educacionit.desafios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantAlumnos = Interaccion.getCantidad(teclado,"alumnos");
		int cantNotas = Interaccion.getCantidad(teclado,"notas");
		Alumno[] alumnos = new Alumno[0];
		
		alumnos = Interaccion.cargarAlumnos(cantAlumnos, cantNotas, teclado);
		teclado.close();
		
		Interaccion.setPromedioBase(7f);
		Interaccion.mostrarResultados(alumnos);
		
	}

}
