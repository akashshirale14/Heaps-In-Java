import java.util.ArrayList;
import java.util.List;

public class Heap {

    public static void main(String[] args) {
        //Lets create a max heap
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(10);
        numList.add(100);
        numList.add(30);
        numList.add(50);
        numList.add(3);
        numList.add(4);
        numList.add(2);

        build_heap(numList);
        System.out.println(numList);
    }

    public static void build_heap(List<Integer> numList) {

        long num_parent_nodes = numList.size() - (numList.size() -(Math.round(Math.floor(numList.size()/2))+1) + 1);
        System.out.println(" numParentNodes: " + num_parent_nodes);

        for(int i = 0; i< num_parent_nodes; i++){
            max_heapify(numList,i);
        }
    }

    public static void max_heapify(List<Integer> numList, int index) {
        int leftChild= 2*(index+1)-1;
        int rightChild= 2*(index+1);
        int largest = index;

        if(leftChild >= numList.size()){
            return;
        }

        if(leftChild < numList.size() && numList.get(leftChild)>numList.get(largest)){
            largest = leftChild;
        }

        if(rightChild < numList.size() && numList.get(rightChild) > numList.get(largest)){
            largest = rightChild;
        }

        if(largest == index){
            return;
        }

        int indexValue = numList.get(index);
        numList.set(index,numList.get(largest));
        numList.set(largest,indexValue);

        max_heapify(numList, largest);
    }
}


