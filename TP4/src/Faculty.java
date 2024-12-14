public class Faculty {
    static String faculty ;
    static department[] d;
    static int conter =0  ;
    public Faculty(String name){
        this.faculty=name ;
        this.d=new department[4];
    }
    public static void adddepartment(department name){
        if (conter >= d.length){
            System.out.println("we cannot add departement");
        }else{
           d[conter++] = name ;
        }
    }
    public static void display(  ){
        System.out.println(faculty);
        for (int i = 0 ;i<d.length;i++){

            department a = d[i];
            System.out.println("  "+ a);
        }
    }
}
class department{
    String name ;
public department(String name){
    this.name=name;
}

    @Override
    public String toString() {
        return name;
    }
}
