package LAB6;

import java.util.Stack;

public class GerericMaxStack <T extends Comparable<T>>{

    public Stack<T> inputs= new Stack<>();
    public Stack<T> max_inputs= new Stack<>();
    public void Push(T input){
        this.inputs.push(input);
        if(this.max_inputs.empty()){
            this.max_inputs.push(input);
        }
        else{
            T last_max= max_inputs.peek();
            if(last_max.compareTo(input)<0){
                this.max_inputs.push(input);
            }
            else{
                this.max_inputs.push(last_max);
            }
        }
    }
    public void Pop(){
        inputs.pop();
        this.max_inputs.pop();
    }
    public T max_element(){
        return this.max_inputs.peek();
    }

}
