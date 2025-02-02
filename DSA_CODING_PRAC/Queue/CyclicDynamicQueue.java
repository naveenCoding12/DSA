package Queue;

public class CyclicDynamicQueue extends CyclicQueue{

    public CyclicDynamicQueue(){
        super();
    }

    public CyclicDynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws QueueExpection {
        if(isFull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i]=data[(front+i) % data.length];
            }
            front=0;
            end= data.length;

            data=temp;
        }
        return super.push(item);
    }
}
