package Practice1.HomeWork_6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        {
            list.add( 1);
            list.add( 2);
            list.add( 3);
            list.add( 7);
            list.add( 9);
            list.add( 12);
            list.add(15);
            list.add( 6);
            list.add( 9);
            list.add(5);
            list.add(3);
        }
        ShowList.showList(list);
        ListArray.checkList(list);
        System.out.println();
        System.out.println();
        ShowList.showList(list);

    }
}
