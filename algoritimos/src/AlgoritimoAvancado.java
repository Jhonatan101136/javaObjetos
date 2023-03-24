
public class AlgoritimoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Maria";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Pedro";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Amelia";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Zilda";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Bruna";
		listaAlunos.adicionar(aluno5);
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
		
		iterar(listaAlunos);	
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno3);
		
		iterar(listaAlunos);
		
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}	
		
		System.out.println("---------------");
	
}
	}
