public class Main {
    public static void main(String[] args) {
        //inf
        Faculty exactsciences = new Faculty("exactsciences");
        department infoING =new department("infoING");
        department MS =new department("MS");
        Faculty.adddepartment(MS);
        Faculty.adddepartment(infoING);
        Faculty.display();
        //tech
        Faculty ST = new Faculty("ST");
        department archi =new department("archi");
        department civil =new department("civil");
        Faculty.adddepartment(archi);
        Faculty.adddepartment(civil);
        Faculty.display();
}}