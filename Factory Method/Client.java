package factory;

//Cliente para testar a criação de personagens

public class Client {
	public static void main(String[] args) {
		//Criando uma factory de guerreiros
        CharacterFactory warriorFactory = new WarriorFactory();
        //Criando um guerreiro
        Character warrior = warriorFactory.createCharacter();
        //Exibindo as informações do guerreiro no console
        warrior.displayInfo();
       
       //Criando uma factory de magos
       CharacterFactory mageFactory = new MageFactory();
       //Criando um mago
       Character mage = mageFactory.createCharacter();
       //Exibindo as informações do mago no console
       mage.displayInfo();
       
       //Criando uma factory de arqueiros
       CharacterFactory archerFactory = new ArcherFactory();
       //Criando um arqueiro
       Character archer = archerFactory.createCharacter();
       //Exibindo as informações do arqueiro no console
       archer.displayInfo(); 
	}
}
