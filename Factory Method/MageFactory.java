package factory;

public class MageFactory extends CharacterFactory {

	@Override
	Character createCharacter() {
		return new Mage();
	}

}
