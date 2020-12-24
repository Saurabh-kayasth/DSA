import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        st.push("6");

        Iterator iterator = st.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }
    }
}
