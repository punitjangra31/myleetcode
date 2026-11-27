import java.util.*;

class NumberContainers {

    HashMap<Integer, Integer> map;
    HashMap<Integer, TreeSet<Integer>> hm;

    public NumberContainers() {
        map = new HashMap<>();
        hm = new HashMap<>();
    }

    public void change(int index, int number) {

        if(map.containsKey(index)) {
            int old = map.get(index);
            hm.get(old).remove(index);
        }

        map.put(index, number);

        hm.putIfAbsent(number, new TreeSet<>());
        hm.get(number).add(index);
    }

    public int find(int number) {

        if(!hm.containsKey(number) || hm.get(number).isEmpty()) {
            return -1;
        }

        return hm.get(number).first();
    }
}