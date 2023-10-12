package secretaria;

public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		aluno1.setNome("Claudio");
		aluno1.setCpf("47827356850");
		aluno1.setEmail("claudioPVP69@gmail.com");
		aluno1.setMatricula(123);
		aluno1.setTelefone(479999568);
		aluno1.setResponsavel("Claudinho");
		aluno1.setEndereco("Rua do Claudio");
		aluno1.setNascimento("15/08/2005");

		System.out.println(aluno1);

		Avaliacao avaliacao1 = new Avaliacao();
		avaliacao1.setNotas(9);

		System.out.println(avaliacao1.getNotas());

		Curso curso1 = new Curso();
		curso1.setCargaHoraria(80);
		curso1.setNome("Java");
		curso1.setUnidadesCurriculares("Programação");

		System.out.println(curso1.getCargaHoraria());
		System.out.println(curso1.getNome());
		System.out.println(curso1.getUnidadesCurriculares());

		Matricula matricula1 = new Matricula();
		matricula1.setCurso("java");
		matricula1.setNumero(1);
		matricula1.setTurma("MI73");

		System.out.println(matricula1.getCurso());
		System.out.println(matricula1.getNumero());
		System.out.println(matricula1.getTurma());

		Professor professor1 = new Professor();
		professor1.setCpf("12345678910");
		professor1.setEmail("willeman@gmail.com");
		professor1.setEndereco("rua do rodrigo");
		professor1.setMatricula(2);
		professor1.setNome("Rodrigo Willemann");
		professor1.setTelefone(12345678);
		professor1.setDataNascimento("18/06/1974");

		System.out.println(professor1);

		UC uc1 = new UC();
		uc1.setAvaliacao("Boa");
		uc1.setFrequencia(90);
		uc1.setProfessor("willemann");

		System.out.println(uc1.getAvaliacao());
		System.out.println(uc1.getFrequencia());
		System.out.println(uc1.getProfessor());

	}

}
