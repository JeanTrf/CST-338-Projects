/**
 * Name: Jean Troffer-Charlier
 * Date: 02/12/19
 * Explanation: a simple class made from a UML diagram
 */

public class EasyClass {
    private String name;
    private Integer count;
    private Double score;

    EasyClass(String name, Integer count, Double score){
        this.name = name;
        this.count = count;
        this.score = score;
    }

    EasyClass(String name, Double score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
