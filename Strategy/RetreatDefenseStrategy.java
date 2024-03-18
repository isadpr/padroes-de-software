package strategy;

//Implementação de estratégias específicas de defesa

public class RetreatDefenseStrategy implements DefenseStrategy {

	@Override
	public void executeDefense() {
		 System.out.println("Recuo defensivo!");
	}

}
