package OOPS;
class Pen {
    private String color;
    private int tip;
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setTip(int tip) {
        this.tip = tip;
    }
}
public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }

}
