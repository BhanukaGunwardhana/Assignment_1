import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicatefinder extends  Object{
    private List<Student>student;
    public Duplicatefinder(List<Student>student){
        this.student=student;

    }
    public List<Student> getDuplicatesList(){
        List<Student>duplicates=new ArrayList<Student>();
        //Student [] a=new Student[student.size()];
        //student.toArray();
        for (int i=0; i< student.size();i++){

            for (int j=i+1;j< student.size();j++){

                    if(
                    student.get(i).equals(student.get(j))){
                        duplicates.add(student.get(i));
                    break;  }

            }
        }return duplicates;

    }
    public List<Student> getDistintList(){
        List<Student>distinct=new ArrayList<Student>();
        for (int i=0; i< student.size();i++){
            boolean a=true;
            for (int j=i+1;j< student.size();j++){
                //int counter=0;
                if(student.get(i).equals(student.get(j))){
                    a=false;
                    break;
                };


            }if(a==true){distinct.add(student.get(i));}

            }
        return distinct;



        }
    public  Student getStudentByName(String name){
        Map<String,Student> map=new HashMap<>();
        for(Student i: student){
            map.put(i.getName(),i);
        }
        try {Student output=map.get(name);}
        catch(Exception e){
            System.out.println("Given name is not found");
        }
        return map.get(name);



    }


}

