package strategy;

public class CombatGame {
	public static void main (String[] args) {
		//Criando estratégias de ataque e defesa
		AttackStrategy agressiveAttackStrategy = new AggressiveAttackStrategy();
		AttackStrategy surpriseAttackStrategy = new SurpriseAttackStrategy();
		DefenseStrategy retreatDefenseStrategy = new RetreatDefenseStrategy();
		
		//Criando soldado
		Soldier soldier = new Soldier(agressiveAttackStrategy, retreatDefenseStrategy);
		
		soldier.attack();
		soldier.defense();
		
		//Mudança de estratégia de ataque durante o combate
		soldier.setAttackStrategy(surpriseAttackStrategy);
		soldier.attack();
	}
}
