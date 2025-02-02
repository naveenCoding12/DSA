package Queue;

import java.util.Arrays;

public class DynamicQueue extends CustomQueue {

    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws QueueExpection {
        if(isFull()){
            data= Arrays.copyOf(data,data.length*2);
        }
        return super.push(item);
    }
}
