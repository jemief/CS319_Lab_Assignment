
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayOrganizer {
    public ArrayList<Integer> concatAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3);
        for(int i = 0; i < result.size() -1 ; i++)
        {
            for(int j = 0; j < result.size()-i-1;j++)
            {
                if(result.get(j) < result.get(j+1)) 
                {
                    int temp = result.get(j);
                    result.set(j, result.get(j+1));
                    result.set(j+1,temp);
                }
            }
        }
        return result;
    }
}