public class vehical {
    protected String brend ;
    protected double speed ;
    public vehical(String brend ,double speed){
        this.brend=brend ;
        this.speed=speed ;
    }
    double accelerate(double s){
        return speed+=s ;
    }
    double brake(double s){
        return speed-=s ;
    }

    @Override
    public String toString() {

        return " brand : " +brend +" current speed : " +speed+ " KM/H";
    }
}
