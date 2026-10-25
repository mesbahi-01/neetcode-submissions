public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if (pairs.size() > 0) {
        result.add(new ArrayList<>(pairs));
        }

        for (int i = 1; i < pairs.size(); i++) {
            List<Pair> current = new ArrayList<>(result.get(i - 1));

            Pair currentPair = current.get(i);
            int j = i - 1;

            while (j >= 0 && current.get(j).key > currentPair.key) {
                current.set(j + 1, current.get(j));
                j--;
            }

            current.set(j + 1, currentPair);
            result.add(current);
        }

        return result;
    }
}
