public class AC implements Device{
    private boolean on=false;
    @Override
    public void turnOn() {
        on=true;
        System.out.println("AC turned ON");
    }

    @Override
    public void turnOff() {
        on=false;
        System.out.println("AC turned OFF");
    }


}
