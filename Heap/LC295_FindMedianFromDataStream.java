class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num < maxHeap.peek()){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }
        if(maxHeap.size()> minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size()>maxHeap.size() +1){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (minHeap.peek() + maxHeap.peek())/ 2.0;
        }else if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }else{
            return minHeap.peek();
        }
    }
}
