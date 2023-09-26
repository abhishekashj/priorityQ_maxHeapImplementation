package PriorityQueue;

public class MaxHeapUse {
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap();
		heap.insert(10);
		heap.insert(4);
		heap.insert(8);
		heap.insert(15);
		heap.insert(20);
		
		for(int i=0;i<heap.size();i++){
			System.out.println(heap.get(i));
		}
	}
}
