
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        complex c1 = new complex(-2,2);
        complex c2 = new complex(3,-1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("add = "+c1.add(c2));
        System.out.println("sub = "+c1.sub(c2));
        System.out.println("mult = "+c1.mul(c2));
        System.out.println("nember of creation = "+complex.n);

    }
}