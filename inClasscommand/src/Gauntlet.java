import java.util.HashMap;

public class Gauntlet {
    public static void main(String[] args){
        Thanos thanos = new Thanos();
        HashMap<String, IStone> stones = new HashMap<>();
        PowerStone powerstone = new PowerStone();

        powerstone.special(thanos);

        SpaceStone spaceStone = SpaceStone.getInstance();
        SpaceStone spaceStone2 = SpaceStone.getInstance();

        spaceStone.setLocation("Knowwhere");
        System.out.println(spaceStone2.getLocation());

        stones.put("Space", spaceStone);
        stones.put("Power", powerstone);

        for (String stone : stones.keySet()) {
            stones.get(stone).special(thanos);
        }

    }
}
