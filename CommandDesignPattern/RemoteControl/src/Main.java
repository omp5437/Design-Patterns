//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();
         AC ac=new AC();
         Device light=new Light();
         Device fan=new Fan();
         Command turnOnAc=new TurnOn(ac);
         remoteControl.setCommand(turnOnAc);
         remoteControl.pressButton();
         Command turnOffAc=new TurnOff(ac);
         remoteControl.setCommand(turnOffAc);
         remoteControl.pressButton();
         remoteControl.undo();

          Command turnOnLight=new TurnOn(light);
          remoteControl.setCommand(turnOnLight);
          remoteControl.pressButton();


        Command turnOffLight=new TurnOff(light);
        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();
        Command turnOnFan=new TurnOn(fan);
        remoteControl.setCommand(turnOnFan);
        remoteControl.pressButton();

        Command turnOffFan=new TurnOff(fan);
        remoteControl.setCommand(turnOffFan);
        remoteControl.pressButton();





    }
}