package command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
	static Map<String, Command> commandMap = new HashMap<String, Command>();
	static Lamp lamp;
	static Television television;
	
	static {
		lamp = new Lamp();
        television = new Television();
        
		commandMap.put("Ligar Dispositivo", new TurnOnCommand(lamp));
		commandMap.put("Desligar Dispositivo", new TurnOnCommand(lamp));
		commandMap.put("Aumentar Volume", new VolumeCommand(television));
		commandMap.put("Diminuir Volume", new VolumeCommand(television));
		commandMap.put("Próximo Canal", new ChannelCommand(television));
		commandMap.put("Voltar Canal", new ChannelCommand(television));
	}
	
	public void pressButton(String command) {
		Command c = commandMap.get(command);
		c.execute();
	}
	
	public void undoButton(String command) {
		Command c = commandMap.get(command);
		c.undo();
	}
}
