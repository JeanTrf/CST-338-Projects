public class SpaceStone implements IStone{
    private static SpaceStone ourInstance = new SpaceStone();

    public static SpaceStone getInstance() {
        return ourInstance;
    }

    private SpaceStone(){

    }

    @Override
    public void special() {
        System.out.println("SpaceStone is not done yet");
    }
}
