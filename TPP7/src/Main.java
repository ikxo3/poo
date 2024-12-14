//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        shape arr[]=new shape[8];
        arr[0]=new rectangle("r1",10,10,11,9);
        arr[1]=new rectangle("r2",20,20,16,9);
        arr[2]=new rectangle("r3",30,30,4,13);
        arr[3]=new square("s1",40,40,8);
        arr[4]=new square("s2",50,50,14);
        arr[5]=new square("s1",40,-20,11);
        //add two circles
        arr[6]=new circle("c1",6,2,76 ,"greey");
        arr[7]=new circle("c2",-0,1,88,"blue" );


        shape largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].area() > largest.area()){
                largest = arr[i];
            }
        }
        System.out.println("The largest area is: "+largest.toString());
        double sumPirimeter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] instanceof square){
                sumPirimeter += ((square)arr[i]).perimeter();
            }
        }
        System.out.println("Sum of all square perimeters is: "+sumPirimeter);
    }
    }

