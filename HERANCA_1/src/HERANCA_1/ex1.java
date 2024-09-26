package HERANCA_1;

public class ex1 {

	// Declaração da Classe Pessoa Fisica
	public static class PessoaFisica {
		String cpf; // Atributos da Classe
		String endereco;
		String email;
	}
	
	// Declaração da Classe Pessoa Jurídica
	public static class PessoaJuridica{
		String nome; // Atributos da Classe
		String cnpj;
		String endereco;
		String email;
	}
	
	// Declaração da Classe Funcionario herdando a Classe da Pessoa Fisica
	public static class Funcionario extends PessoaFisica {
		String nome; // Atributos da Classe
		double salario;
	
		// Construtor da Classe Funcionario
		public Funcionario (String nome, String cpf, String endereco, double salario) {
		this.nome=nome; // Inicializa o Nome do Funcionario
		this.cpf=cpf; // Inicializa o CPF do Funcionario
		this.endereco=endereco; // Inicializa o Endereço do Funcionario
		this.salario=salario; // Inicializa o Sálario do Funcionario
		}
		
		
		// Método de Cadastro de Funcionário
		public void CadastroFunc() {
			
			System.out.println("- Funcionário Cadastrado -");
			System.out.println("Nome: "+nome); // Exibe o nome
			System.out.println("CPF: "+cpf); // Exibe o CPF
			System.out.println("Endereço: "+endereco); // Exibe o Endereço
			System.out.println("Salário: "+salario+"\n"); // Exibe o Salário
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// Atribuição de parâmetros do Funcionário 1
		Funcionario func1 = new Funcionario("João da Silva", "995.880.098-55", "Rua Professor Carlos, 99", 1800.00);
		
		// Atribuição de parâmetros do Funcionário 2
		Funcionario func2 = new Funcionario("Sandra Marlene", "764.184.798-66", "Rua Santa Rita, 186", 3200.00);
		
		// Atribuição de parâmetros do Funcionário 3
		Funcionario func3 = new Funcionario("Sophie Joana", "864.415.408-78", "Rua Voluntário Altino, 694", 2700.00);

		func1.CadastroFunc(); // Puxa o Método que exibe os dados do Funcionário 1
		func2.CadastroFunc(); // Puxa o Método que exibe os dados do Funcionário 2
		func3.CadastroFunc(); // Puxa o Método que exibe os dados do Funcionário 3
		 
		
	}

}

