public class SpaceStone implements IStone{
    private static SpaceStone ourInstance = new SpaceStone();
    String location;

    public static SpaceStone getInstance() {
        return ourInstance;
    }

    private SpaceStone(){

    }
//TODO: implement special
    @Override
    public void special(Person person) {
        System.out.println("SpaceStone is not done yet");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
