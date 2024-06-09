package teas;
import java.util.Scanner;
public class Stack{
    private int[]arr;
    private int top;
    public Stack(int size){
        arr=new int[size];
        top=-1;
    }
    public void push(int num){
        if(top==arr.length-1){
            System.out.println("stack is full");
        }else{
            top++;
            arr[top]= num;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack Underflow");
            return -1;
        }else{
            int poppedElement=arr[top];
            top--;
            return poppedElement;
        }
    }
    public int peek(){
        if(top==-1){
        System.out.println("stack is empty");
        return -1;
        }else{
            return arr[top];
        }
}
public boolean isEmpty(){
    return top==-1;
}
public void display(){
    if(top==-1){
        System.out.println("stack is empty");
    }else{
        System.out.println("stack elements:");
        for(int i=top; i>0; i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public void rotate_Stack_To_Right(int rotations){
    if(top==-1){
        System.out.println("stack is empty");
        return;
    }
    rotations=rotations%(top+1);
    for(int i=0; i<rotations; i++){
        int temp=arr[top];
        for(int j=top; j>0; j--){
            arr[j]=arr[j-1];
        }
        arr[0]=temp;
    }
}
public static void main(String[]args){
    System.out.println("Intialize a stack:");
    Stack stack=new Stack(7);
    System.out.println("some elemens ins stack:");
    stack.push(8);
    stack.push(4);
    stack.push(1);
    stack.push(5);
    stack.push(7);
    stack.push(6);
    stack.push(3);
    stack.display();
    System.out.println("\nrotate the stack elements to the left by 3 positions");
    stack.rotate_Stack_To_Right(3);
    System.out.println("Display the rotated stack:");
    stack.display();
    stack.rotate_Stack_To_Right(4);
    stack.display();
}
}