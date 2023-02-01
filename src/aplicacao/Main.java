package aplicacao;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
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
		
		/*System.out.println(cursos1);
		System.out.println(cursos2);
		System.out.println(mentorias1);*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(cursos1);
		bootcamp.getConteudos().add(cursos2);
		bootcamp.getConteudos().add(mentorias1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("------------------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de João: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}
}