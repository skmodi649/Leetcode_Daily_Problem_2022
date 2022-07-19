package July;

import java.util.ArrayList;
import java.util.List;

public class July_19_Pascal_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        first.add(1);
        second.add(1);
        second.add(1);
        if(numRows == 1){
            list.add(first);
            return list;
        }
        if(numRows == 2){
            list.add(first);
            list.add(second);
            return list;
        }

        List<Integer> inner, pre = null;
        for (int i = 0; i < numRows; ++i) {
            inner = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    inner.add(1);
                else
                    inner.add(pre.get(j - 1) + pre.get(j));
            pre = inner;
            list.add(inner);
        }
        return list;
    }
}
