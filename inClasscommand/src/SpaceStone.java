public class SpaceStone implements IStone{
    private static SpaceStone ourInstance = new SpaceStone();
    String location;

    public static SpaceStone getInstance() {
        return ourInstance;
    }

    private SpaceStone(){

    }

    @Override
    public void special() {
        System.out.println("SpaceStone is not done yet");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
