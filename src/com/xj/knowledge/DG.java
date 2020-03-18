package com.xj.knowledge;

import java.util.HashMap;
import java.util.Map;

public class DG {
    public static void main(String[] args) {
        //当成bom的母子件
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        map.put(5,6);

        System.out.println(getDepth(map,4,0));

    }

    public static int getDepth(Map<Integer,Integer> map,int bom,int depth){
        int result = depth;
        if(null != map.get(bom)){
            depth++;
            result = getDepth(map,map.get(bom),depth);
        }
        return result;
    }
}

