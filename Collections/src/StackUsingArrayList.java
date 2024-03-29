import java.util.ArrayList;

public class StackUsingArrayList {
     static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if (isEmpty()) return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if (isEmpty()) return  -1;
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack.push(12);
        Stack.push(15);
        Stack.push(17);
        Stack.push(19);
        Stack.push(20);

        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
