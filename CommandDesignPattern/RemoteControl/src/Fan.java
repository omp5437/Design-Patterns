public class Fan implements Device{

   private boolean on=false;
    @Override
    public void turnOn() {
        on=true;
        System.out.println("Fan turned ON");
    }

    @Override
    public void turnOff() {
        on=false;
        System.out.println("Fan turned OFF");
    }


}
