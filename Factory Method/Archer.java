package factory;

public class Archer implements Character{

	@Override
	public void displayInfo() {
		System.out.println("Personagem: Arqueiro");
        System.out.println("Habilidades: Ataques à distância, dano alto");
        System.out.println("Equipamento: Arco e flecha");
	}

}
