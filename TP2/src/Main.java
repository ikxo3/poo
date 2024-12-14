//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        point p1 =new point(2,5);
        point p2 =new point(0,8);
        p1.move(-1,1);
        System.out.println(p1);
        System.out.println(p1.distance(p2));
    }
}