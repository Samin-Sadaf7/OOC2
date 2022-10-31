package lab5.task2;

import java.util.Stack;

public class MinStack {
    public Stack<Integer> inputs=new Stack<Integer>();
    public Stack<Integer> min= new Stack<Integer>();
    public void Push(int input){
        this.inputs.push(input);
        if(this.min.empty()){
            this.min.push(input);
        }
        else{
            if(this.min.lastElement()>input){
                this.min.push(input);
            }
            else{
                this.min.push(this.min.lastElement());
            }
        }
    }
    public void Pop(){
        this.inputs.pop();
        this.min.pop();
    }
    public int get_Min(){
        return this.min.lastElement();
    }
}
