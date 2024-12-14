import jdk.dynalink.beans.StaticClass;

public class complex {
    int  im, re ;
    static int n =0;
    public complex(){
        this.im=0;
        this.re=0;
        n++;
    }
    public complex(int a, int b){
        this.im=a;
        this.re=b;
        n++;
    }
    @Override
    public String toString() {
        return "("+this.re+"+"+this.im+"i)";
    }
    public complex add(complex other){
        return new complex(this.re+= other.re,this.im+= other.im);    }
    public complex mul(complex other){
        int RE ,IM ;
        RE=this.re* other.re-this.im* other.im;
        IM=this.re* other.im+this.im* other.re;
        return new complex(RE,IM);
    }
    public complex sub(complex other){
        return new complex(this.re-= other.re,this.im-= other.im);
    }


}
