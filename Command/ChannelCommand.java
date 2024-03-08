package command;

public class ChannelCommand implements Command {
	private Television television;
	
	public ChannelCommand(Television television) {
		this.television = television;
	}
	
	@Override
	public void execute() {
		television.nextChannel();
		System.out.println("O dispositivo foi para o próximo canal");
	}

	@Override
	public void undo() {
		television.previousChannel();
		System.out.println("O dispositivo foi para o canal anterior");
	}

}
