public class house {
    String name ;
    room []r=new room[3];
    int c =0;
    public house(String name,String nameroom1,double surface1,String nameroom2,double surface2,String nameroom3,double surface3 ){
        this.name =name;
        r[0]=new room(nameroom1,surface1);
        r[1]=new room(nameroom2,surface2);
        r[2]=new room(nameroom3,surface3);
    }


    double surface(){
        double n=0 ;
        for (int i=0 ;i<r.length;i++){
            n+=r[i].surface;
        }
        return  n;
    }
}
class room {
    String name ;
    double surface ;
    public room(String name ,double surface){
        this.name =name;
        this.surface=surface;
    }

}