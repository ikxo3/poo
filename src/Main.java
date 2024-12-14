//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        shape arr[]=new shape[6];
        arr[0]=new rectangle("r1",10,10,5,2);
        arr[1]=new rectangle("r2",20,20,4,3);
        arr[2]=new rectangle("r3",30,30,6,4);
        arr[3]=new square("s1",40,40,7);
        arr[4]=new square("s2",50,50,8);
        arr[5]=new square("s1",40,-20,10);


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

