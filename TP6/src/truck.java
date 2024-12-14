public class truck extends vehical {
    double capasity ;
    public truck(String brend, double speed ,double capasity ) {
        super(brend, speed);
        this.capasity=capasity ;
    }

    @Override
    public String toString() {
        return super.toString() + capasity + " T";
    }
}
