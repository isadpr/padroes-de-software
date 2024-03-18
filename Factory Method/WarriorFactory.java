package factory;

public class WarriorFactory extends CharacterFactory {

	@Override
	Character createCharacter() {
		return new Warrior();
	}

}
