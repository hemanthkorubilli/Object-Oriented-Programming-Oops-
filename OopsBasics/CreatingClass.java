public class CreatingClass {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.setPen("pentonic", "red");
        p2.setPen("Ronyds", "blue");
        System.out.println(p1.name);
        System.out.println(p2.color);
    }
}

class Pen {
    String name;
    String color;

    void setPen(String assignname, String assigncolor) {
        name = assignname;
        color = assigncolor;
    }
}