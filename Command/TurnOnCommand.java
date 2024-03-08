package command;

public class TurnOnCommand implements Command {
	private Device device;
	
	public TurnOnCommand (Device device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.turnOn();
		System.out.println("O dispositivo foi ligado");
	}

	@Override
	public void undo() {
		device.turnOff();
		System.out.println("O dispositivo foi desligado");
	}

}
