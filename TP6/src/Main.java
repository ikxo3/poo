public class Main {
    public static void main(String[] args) {
        car c1 = new car("Nissan" , 80 ,3);
        moto n1 = new moto("Kawazaki",110,false);
        truck t1 = new truck("MAN" , 100 , 40);
        System.out.println("attributes befor methods");
        System.out.println(c1);
        System.out.println(n1);
        System.out.println(t1);
        System.out.println("attributes after methods");
        c1.changegear(4);
        c1.accelerate(20);
        System.out.println(c1);
        n1.brake(50) ;
        System.out.println(n1);
        t1.brake(5);
        System.out.println(t1);


           }
}
