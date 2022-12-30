package Java.challenges;

import java.util.HashMap;
import java.util.Map;

public class kWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k){

        int[] toReturn = new int[k];

        // key: Row Number, value: number of soldiers
        Map<Integer, Integer> nrSoldiers = new HashMap<>();


        for(int i = 0; i < mat.length; i++){
            nrSoldiers.put(i, 0);
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1) nrSoldiers.replace(i, nrSoldiers.get(i)+1);
            }
        }

        //System.out.println(nrSoldiers);

        Object[] array = nrSoldiers.keySet().toArray();

        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(nrSoldiers.get((int)array[j]) > nrSoldiers.get((int)array[j+1])){
                    int temp = (int) array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //System.out.println(Arrays.toString(array));

        for(int i = 0; i < k; i++){
            toReturn[i] = (int) array[i];
        }

        return toReturn;
    }

}
