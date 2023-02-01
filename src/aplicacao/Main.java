package aplicacao;

import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso cursos1 = new Curso();
		cursos1.setTitulo("Curso Java");
		cursos1.setDescricao("Descrição Curso Java!");
		cursos1.setCargaHoraria(8);
		
		Curso cursos2 = new Curso();
		cursos2.setTitulo("Curso JavaScript");
		cursos2.setDescricao("Descrição Curso JavaScript!");
		cursos2.setCargaHoraria(4);
		
		Mentoria mentorias1 = new Mentoria();
		mentorias1.setTitulo("Mentoria Java");
		mentorias1.setDescricao("Descrição Mentoria Java!");
		mentorias1.setData(LocalDate.now());
		
		System.out.println(cursos1);
		System.out.println(cursos2);
		System.out.println(mentorias1);
	}

}
