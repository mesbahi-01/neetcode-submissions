// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> s = new ArrayList<>();
        if (pairs.size() > 0) {
            s.add(pairs);
        }

        for (int i = 0; i < pairs.size() - 1; i++) {
            List<Pair> copyList = new ArrayList<>(s.get(i));

            for (int j = i + 1; j > 0; j--) {
                if (copyList.get(j).key < copyList.get(j - 1).key) {
                    // we swap
                    Pair temp = copyList.get(j);
                    copyList.set(j, copyList.get(j - 1));
                    copyList.set(j - 1, temp);
                }else{
                    break;
                }
            }
            s.add(copyList);
        }

        return s;
    }
}
