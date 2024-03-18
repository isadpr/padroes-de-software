package strategy;

public class Soldier implements Unit {
	private AttackStrategy attackStrategy;
	private DefenseStrategy defenseStrategy;
	
	//Construtor para que cada soldado tenha um ataque e uma defesa definidos ao ser criado
    public Soldier(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

	@Override
	public void attack() {
		attackStrategy.executeAttack();
	}

	@Override
	public void defense() {
		defenseStrategy.executeDefense();
	}
	
	//Métodos setters permitem alterar dinamicamente as estratégias de ataque e defesa de um soldado em tempo de execução
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

}
