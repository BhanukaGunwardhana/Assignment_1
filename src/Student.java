import java.util.List;

public class Student extends Object {
    private String name;
    private int age;
    private String school;
    public Student(String name,int age,String school){
        this.name=name;
        this.age=age;
        this. school=school;

    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object obj) {
        Student s= (Student) obj;
        if(this.name==s.getName() && this.age==s.getAge() && this.school==s.getSchool()){return true;}
        else {return false;}
    }


}
