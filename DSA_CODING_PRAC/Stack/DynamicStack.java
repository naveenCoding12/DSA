package Stack;

import java.util.Arrays;

public class DynamicStack  extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {
        if(isFull()){
            data=Arrays.copyOf(data,data.length*2);
        }
        return super.push(item);
    }
}
