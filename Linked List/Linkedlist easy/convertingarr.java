public class convertingarr {
     // basic structure
       static class node{
            int data;
            node head;

            node(int data1, node head1) {
                this.data = data1;
                this.head = head1;
            }

            node(int data1) {
                this.data = data1;
                this.head = null;
            }
        }
        ;

   static node convertArrLL(int arr[]) {
        // creating the first node
        node a = new node(arr[0]);
        node temp=a;
        for(int i=1;i<arr.length;i++){
           node b=new node(arr[i]);
           temp.head=b;
           temp=b;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        // basic structure
     node head= convertArrLL(arr);
    System.out.println(head.data);

      
    }
}
