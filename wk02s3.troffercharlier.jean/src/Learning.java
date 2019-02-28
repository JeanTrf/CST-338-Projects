import java.util.ArrayList;
import java.util.List;

public class Learning {

    private String name;
    private Integer count;
    private List<String> friends;

    Learning(){
        name = "Jean";
        count = 1;
        friends = new ArrayList<String>();
    }

    public int getCount() {
        return count;

    }

    public List<String> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setName(String name) {
        this.name = name;
    }

}
