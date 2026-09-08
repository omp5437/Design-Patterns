public class Light implements Device{
    private boolean on=false;
    @Override
    public void turnOn() {
        on=true;
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        on=false;
        System.out.println("Light turned OFF");
    }

}
