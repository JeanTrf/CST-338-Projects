public class MyObject {
    private String name;
    private Integer count;

    public MyObject(){
        name = "Jean";
        count = 0;
    }

    @Override
    public String toString(){
        return "MyObject{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args){
        MyObject o1 = new MyObject();
        MyObject o2 = o1;
        System.out.println("o1 == " + o1);
        System.out.println("o2 == " + o2);
    }
}
