
public class implementation{
    public static void main(String[] args) {
        class node{
            int data;
            node head;

            node(int data1,node head1){
                this.data=data1;
                this.head=head1;

            }
            node(int data1){
             this.data=data1;
             this.head=null;
            }
        };
         //inserting at tail 
        // //creating first node 
        // node a = new node(5);
        // //creating the next node and first node is linked to the next
        // node b=new node(7);
        // a.head=b;

        // inserting at head 
        //inserting first node 
        node a =new node(5);
        //inserting second node 
        node b=new node(7, a);
        System.out.println(a.data);
        
        

      
    }
}