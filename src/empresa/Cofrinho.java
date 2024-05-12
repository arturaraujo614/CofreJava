package empresa;
import java.util.ArrayList;
public class Cofrinho {
	ArrayList<Moeda>cofre = new ArrayList<Moeda>();
	
	public void adicionar(Moeda c) {
		boolean encontrou = false;
		// Verificando se existe a classe "tipo de moeda" dentro do array. Se sim, altere o valor
        for (Moeda m : cofre) {
            if (m.getClass() == c.getClass()) {
                m.depositar(c.adicionar());
                encontrou = true;
                break;
            }
        }
        
        if (!encontrou) {
        	cofre.add(c);
        }
    }
	public void remover(Moeda c) {
		boolean encontrou = false;
        for (Moeda m : cofre) {
            if (m.getClass() == c.getClass()) {
            	try {
					m.sacar(c.adicionar());
					System.out.println("Valor retirado");
					encontrou = true;
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					encontrou = true;
					break;
				}
            }
        }
         if (encontrou == false) {
           	 System.out.println("Moeda não encontrada no cofre"); 
            } 
    }

	
	public void listar() {
		for (Moeda c: cofre) {
			System.out.println(c);
		}
		
	}
	/*Agora vamos fazer um loop dentro do array, chamando a funcao conversao () de cada objeto
	e somando todos os valores */
	public void converter() {
		double total = 0;
		for (Moeda m : cofre) {
			total += m.conversao();
		}
		System.out.println("Total:" + total);
		
	}
}

