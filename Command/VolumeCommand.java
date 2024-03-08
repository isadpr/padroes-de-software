package command;

public class VolumeCommand implements Command {
	private Television television;

	public VolumeCommand(Television television) {
		this.television = television;
	}
	
	@Override
	public void execute() {
		television.turnUpVolume();
		System.out.println("O dispositivo aumentou o volume");
	}

	@Override
	public void undo() {
		television.turnDownVolume();
		System.out.println("O dispositivo diminuiu o volume");
	}

}
