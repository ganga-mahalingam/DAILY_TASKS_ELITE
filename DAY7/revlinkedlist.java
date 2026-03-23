import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Node head=null,tail=null;

        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);

            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null)System.out.print(" -> ");
            temp=temp.next;
        }
    }
}
