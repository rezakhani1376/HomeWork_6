package Practice1.HomeWork_6;


import java.util.List;
import java.util.ListIterator;

public class ListArray {
    public static List<Integer> checkList(List<Integer> list){
        int res;
        Integer value;
        Integer nextValue;
        checkOddLength(list);
        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()){
            value = iterator.next();
            nextValue = iterator.next();
            res = Integer.compare(value , nextValue);

            if(res > 0){
                iterator.previous();
                iterator.remove();
                iterator.previous();
                iterator.remove();
            }
        }
        return list;
    }
    static void checkOddLength(List list){
        if(list.size()%2 !=0){
            list.remove(list.size()-1);
        }
        System.out.println(list);
    }





}

