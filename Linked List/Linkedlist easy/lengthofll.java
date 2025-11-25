public class lengthofll {
    //basic structure of LL
    static class node{
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

    static int lengthOfll(node head){
        int count=0;
        node temp=head;
        while(temp!=null){
            count++;
            temp=temp.head;
        }
        return count;
    }

    public static void main(String[] args) {
          int arr[] = { 5, 4, 3, 2, 1 };
          node first=convertArrLL(arr);
           int length= lengthOfll(first);

           System.out.println("the length of the LL is : "+length);
    }
}
