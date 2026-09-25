import java.util.Scanner;

class stack<T>{
  private int size;
  private T[] arr;
  public static int top;
  
  @SuppressWarnings("unchecked")
  public stack(int size){
    this.size = size;
    this.arr = (T[]) new Object[size];
    this.top = -1;
  }
  
  public void push(T v){
    if(this.isFull()){
      System.out.println("Stack is full");
    } else{
      top++;
      arr[top]=v;
      System.out.println(v+" is pushed successfully"); 
    }
  }
  
  public void pop(){
    if(this.isEmpty()){
      System.out.println("Stack is empty");
    } else{
      T v = arr[top];
      this.top--;
      System.out.println(v+" is poped successfully"); 
    }
  }
  
  public void display(){
    if(top==-1){System.out.println("Stack is empty");return;}
    for(int i=0;i<this.top+1;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  public void clear(){
    this.top=-1;
    System.out.println("Stack cleared successfully");
  }
  
  public int search(T v){
    if(top==-1){return -1;}
    for(int i=0;i<this.top+1;i++){
      if(v==arr[i]){return i;}
    }
    return -1;
  }
  
  public boolean isEmpty(){
    if(top==-1){
      return true;
    } else{
      return false;
    }
  }
  
  public boolean isFull(){
    if(top==size-1){
      return true;
    } else{
      return false;
    }
  }
}

public class stackDS{
  public static void main(String args[]){
    stack<Integer> st = new stack<>(5);
    Scanner sc = new Scanner(System.in);
    int c,v;
    while(true){
      System.out.println("1.Push\n2.Pop\n3.IsEmpty\n4.IsFull\n5. Size\n6. Clear\n7. Search\n8. Display\n9.Exit");
      c=sc.nextInt();
      switch(c){
          case 1:{
            System.out.print("Enter Value: ");
            v=sc.nextInt();
            st.push(v);
          break;}
          case 2:{
            st.pop();
          break;}
          case 3:{
            if(st.isEmpty()){
              System.out.println("Stack is empty");
            } else{
              System.out.println("Stack is not empty");
            }
          break;}
          case 4:{
            if(st.isFull()){
              System.out.println("Stack is full");
            }else{
              System.out.println("Stack is not full");
            }
          break;}
          case 5:{
            if(st.top==-1){
              System.out.println("Stack is empty");
            } else{
              System.out.println(st.top+1);
            }
          break;}
          case 6:{
            st.clear();
          break;}
          case 7:{
            System.out.print("Enter Value: ");
            v=sc.nextInt();
            int res = st.search(v);
            if(res==-1){
              System.out.println("Item not found");
            } else{
              System.out.println("Value at "+res);
            }
          break;}
          case 8:{
            st.display();
          break;}
          case 9:{sc.close();System.exit(0);}
      }
    }
  }
}
