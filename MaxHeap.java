package PriorityQueue;

import java.util.*;
public class MaxHeap{
    private ArrayList<Integer> heap;
    public MaxHeap(){
        heap= new ArrayList<>();
    }
    public int size() {
    	return heap.size();
    }
    //PARENT
    public int parent(int index){
        if(index<=0){
            System.out.println("alert!!!!");
            return 0;
        }
        return (index-1)/2;
    }
    public int get(int index) {
    	return heap.get(index);
    }
    public int leftChild(int index){
        if(index<=0){
            System.out.println("alert!!!!");
            return 0;
        }
        return 2*index+1;
    }
    public int rightchild(int index){
        if(index<=0){
            System.out.println("alert!!!!");
            return 0;
        }
        return 2*index+2;
    }
    public void insert(int element){
        heap.add(element);
        int currIndex= heap.size()-1;
//        upheapify
        while(currIndex>0 && heap.get(currIndex)>heap.get(parent(currIndex)))
        {
            int parentIndex= parent(currIndex);
            int temp= heap.get(currIndex);
            heap.set(currIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            currIndex= parentIndex;
        }
    }
    public int delete(){
        if(isEmpty()){
            System.out.println("heap is empty");
            return -1;
        }
        int deleteVal= heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        downheapify(0);
        return deleteVal;
    }
	private void downheapify(int index) {
		// TODO Auto-generated method stub
		int leftchildindex= leftChild(index);
		int rightchildindex= rightchild(index);
		int largeIndex= index;
		//set largeside
		if(heap.size()> leftchildindex && heap.get(leftchildindex)>heap.get(largeIndex)) {
			largeIndex= leftchildindex;
		}
		if(heap.size()> rightchildindex&& heap.get(largeIndex)<heap.get(rightchildindex)) {
			largeIndex= rightchildindex;
		}
		if(largeIndex!=index) {
			int temp= heap.get(index);
			heap.set(index, heap.get(largeIndex));
			heap.set(largeIndex, temp);
			downheapify(largeIndex);
		}
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heap.isEmpty();
	}
    
}
