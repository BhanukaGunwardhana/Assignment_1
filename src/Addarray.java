import java.util.Arrays;

public class Addarray {
    int [] mainarray =new int[1];
    //int [] my =new ;
    //int i=0;
    //int c=0;
    public int [] addarray(int a){
        //mainarray[i]=a;

        int z=mainarray.length+1;
        mainarray[z-1]=a;
        int [] b=new int[z+1];
        for (int i=0;i<z;i++){
            b[i]=mainarray[i];

        }
        //b[z-1]=a;

        mainarray=b;
        ;
       // System.out.println(Arrays.toString(mainarray));

        //System.out.println(i);
        return mainarray;
       // int [] arr=new int [];
    }
    public void printarry(int [] b){
        for (int c : b){
            System.out.print(c+" ");

        }
    }
}
