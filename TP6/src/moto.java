public class moto extends vehical {
    boolean halmate ;
    public moto(String brend, double speed,boolean halmate) {
        super(brend, speed);
        this.halmate=halmate ;
    }
    @Override
    public String toString() {
        String a;
        if(halmate==true){a ="yes,he has";}
        else{a="no,he hasnt";}
        return super.toString() +" has halmate ? : " + a;
    }
}
