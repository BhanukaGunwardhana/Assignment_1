import java.util.List;

public class Calculator {

    public int sum(List<Integer> list){
        int sum=0;
        if (list.isEmpty()){
            throw new Findemptyarray ("Empty Array");
        }else{
        for (int i: list){
            sum=sum+i;
        }

    }return sum;
}}
