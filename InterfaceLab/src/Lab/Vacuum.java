package Lab;
public abstract class Vacuum implements ItemOne, ItemTwo{
    private Boolean on;
    Vacuum(){
        on = false;
    }

    @Override
    public void activate() {
        if(on) System.out.println("this vacuum already on");
        else {
            on = true;
            System.out.println("turning this vacuum on");
        }
    }

    @Override
    public void deactivate() {
        if(!on) System.out.println("this vacuum already off");
        else {
            on = false;
            System.out.println("turning this vacuum off");
        }
    }
}
