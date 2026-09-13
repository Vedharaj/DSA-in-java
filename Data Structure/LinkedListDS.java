import java.util.Scanner;
class LinkedList<T>{
    private Note<T> head;
    
    public static class Note<T>{
        T data;
        Note<T> next;
        
        Note(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data){
	      if(head==null){
	          head = new Note<>(data);
        } else{
            Note<T> prev = head;
            while(prev.next != null){
                prev=prev.next;
            }
            prev.next=new Note<>(data);
        }
    }
    
    public void display(){
        Note<T> cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}

public class LinkedListDS
{
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int c, v;
		while(true){
		    System.out.println("LinkedList DataType\n1. Add\n2. Display\n3. exit\n");
		    c = sc.nextInt();
		    switch(c){
		        case 1:{
		            System.out.print("Enter Value: ");
		            v = sc.nextInt();
		            ll.add(v);
		            break;
		        }
		        case 2: ll.display();break;
		        case 3: sc.close();System.exit(0);
		    }
		}
	}
}
