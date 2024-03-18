package factory;

public class ArcherFactory extends CharacterFactory {

	@Override
	Character createCharacter() {
		 return new Archer();
	}

}
