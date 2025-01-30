import java.util.*;
public class LearningHashing {

    static void countFreq(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry <Integer,Integer> e :map.entrySet())
            System.out.println(e.getKey() + " "+ e.getValue());
    }
    public static void main(String[] args) {
        int arr[]={10,5,10,69,5,10,69,5};
        countFreq(arr);

    }
}
