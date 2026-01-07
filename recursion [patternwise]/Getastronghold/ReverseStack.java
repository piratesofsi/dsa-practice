import java.util.Stack;

public class ReverseStack {
    
    private static void insertBottom(Stack<Integer> st , int num){
        //this function is used to insert at bottom so we can get the 
        // reverse the given stack 
        // base case 
        if(st.isEmpty()){
            st.push(num);
            return;
        }
        
        // remove the  upper element after saving it  
        int n = st.pop();
        
        // recurse 
        insertBottom(st,num);
        
        // while backtracking add again the upper elements which were removed 
        st.push(n);
        
    }
    
    
    public static void reverseStack(Stack<Integer> st) {
        // js same as the sorting a stack using recursion 
        // base case 
        if(st.isEmpty()){
            return;
        }
        
        // remove the element before removing it 
        int num = st.pop();
        
        // recurse 
        reverseStack(st);
        
        // while backtracking use the insert at botom 
        insertBottom(st,num);
        
    }

    // main function for testing reverse stack
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("Original Stack: " + st);

        reverseStack(st);

        System.out.println("Reversed Stack: " + st);
    }
}
