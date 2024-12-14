public class car extends vehical {
    int gear ;
    public car(String brend, double speed ,int gear) {
        super(brend, speed);
        this.gear=gear ;
    }
    int changegear(int mewgear){
        return gear=mewgear;
    }

    @Override
    public String toString() {
        return (super.toString() +" cerrent gear : " + gear);
    }
}
