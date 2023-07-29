

package br.com.agenda;

public class GerenciadorAgenda {
	
	public static void main(String[] args) {
		
		Contato c1 = new Contato( "Maria", "58965896","maria@hotmail.com");
		c1.setEndereco(new Endereco("Urca","Expedicionarios", "412","15482", "JP", "PB"));
		// String rua, String bairro, String numero, String cep, String cidade, String estado
		System.out.println(c1.getEndereco());
		
		Contato c2 = new Contato("Jose", "32563256", "jose@hotmail.com");
		Contato c3 = new Contato("Ana", "74587458","ana@hotmail.com");
		Contato c4 = new Contato("Bia", "4862486","bia@hotmail.com");
		Contato c5 = new Contato("Gui", "78947894","gui@hotmail.com");
			
		
		
		
		Agenda agenda1 = new Agenda();
		agenda1.adicionarContato(c1);
		agenda1.adicionarContato(c2);
		agenda1.adicionarContato(c3);
		agenda1.adicionarContato(c4);
				
		System.out.println(agenda1.removerContato(c1));
		System.out.println(agenda1.pesquisarContato("Maria"));
		System.out.println(">>> " + agenda1.pesquisarContato("jOSE"));
		System.out.println("----" + agenda1.pesquisarContato("jose","4862486"));
		System.out.println(agenda1.alterarContato(c4, c5));

	
				
		}
		
		
	
		
		
		
	}


