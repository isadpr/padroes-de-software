package command;

public class Cliente {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.pressButton("Ligar Dispositivo");
		remoteControl.undoButton("Desligar Dispositivo");
		remoteControl.pressButton("Aumentar Volume");
		remoteControl.undoButton("Diminuir Volume");
		remoteControl.pressButton("Próximo Canal");
		remoteControl.undoButton("Voltar Canal");
	}
}
