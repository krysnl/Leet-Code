class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<ElementPriority> pq = new PriorityQueue<>(k);
        int[] ret = new int[k];
        for (int i = mat.length -1 ; i >= 0 ; i--){
            int x = 0;
            for (int j = 0 ; j < mat[i].length ; j++){
                x += mat[i][j];
            }
            System.out.println(x+" "+i);
            pq.add(new ElementPriority(i,x));
        }
        for (int i = 0 ; i< k ; i++)
            ret[i] = pq.poll().element;
        System.out.println(pq.toString());
        return ret;
        }
    public class ElementPriority implements Comparable<ElementPriority> {
    int element;
    int priority;
    public ElementPriority(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }
    @Override public int compareTo(ElementPriority other) {
        if(this.priority == other.priority)
            return Integer.compare(this.element, other.element);
        return Integer.compare(this.priority, other.priority);
    }
}
}
