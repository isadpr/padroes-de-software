package factory;

public class Warrior implements Character {

	@Override
	public void displayInfo() {
		System.out.println("Personagem: Guerreiro");
        System.out.println("Habilidades: Ataque físico, defesa alta");
        System.out.println("Equipamento: Espada, armadura pesada");
	}

}
