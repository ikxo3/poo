public class point {
    private int x;
    private int y;
    public point(int X,int Y){
        this.x =X;
        this.y =Y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void move (int a , int b){
        this.x+=a;
        this.y+=b;
    }
    public double distance(point other){
        return Math.pow(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2),0.5);
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}

