import java.util.List;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*Student std1 = new Student("Vimukthi",20,"HillWood");
        Student std2 = new Student("Kasun",21,"HighSchool");
        Student std3 = new Student("Danushka",20,"HighSchool");
        Student std4 = new Student("Ruwan",20,"HillWood");
        Student std5 = new Student("Chamara",20,"HighSchool");
        Student std6 = new Student("Lakshan",20,"HighSchool");
        Student std7 = new Student("Ruwan",20,"HillWood");
        Student std8 = new Student("Amara",20,"HighSchool");
        Student std9 = new Student("Kasun",21,"HighSchool");
        Student std10 = new Student("Chamara",20,"HighSchool");

        List<Student> list = List.of(std1,std2,std3,std4,std5,std6,std7,std8,std9,std10);

        Duplicatefinder finder = new Duplicatefinder(list);


        for(Student i:finder.getDuplicatesList()){
            System.out.println(i.getName()+","+i.getAge()+","+i.getSchool());
        }
        for(Student i:finder.getDistintList()){
            System.out.println(i.getName()+","+i.getAge()+","+i.getSchool());
        }
        try{
        finder.getStudentByName("sahan").getAge();}
        catch(Exception e){
            System.out.println("Name is not found");
        }
        //finder.getDistintList();
        //finder.getStudentByName("sahan");
        /*Calculator cal=new Calculator();
        List<Integer>list=List.of();
        try{
            System.out.println(cal.sum(list));}
        catch (Findemptyarray e){
            System.out.println(e);

        }catch (Exception e){
            System.out.println("Error");

        }*/
        String x="JAVA BNhkh hasiuhsak gahkcah";
        String [] arr=x.split(" ");
        String y="";
        for(int i=arr.length-1;i>=0;i--){
            y=y+arr[i]+" ";
        }
        System.out.println(y);


    }
}