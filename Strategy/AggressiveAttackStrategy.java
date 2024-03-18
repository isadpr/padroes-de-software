package strategy;

//Implementação de estratégias específicas de ataque

public class AggressiveAttackStrategy implements AttackStrategy {

	@Override
	public void executeAttack() {
		System.out.println("Ataque agressivo!");
	}
}
