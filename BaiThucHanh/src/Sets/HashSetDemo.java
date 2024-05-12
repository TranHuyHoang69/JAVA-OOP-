package Sets;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<StudentSet> hashSetStudent = new HashSet<StudentSet>();
        for(int i = 0; i<3;i++){
            StudentSet st = new StudentSet();
            st.In();
            hashSetStudent.add(st);
        }
        System.out.println(hashSetStudent);
    }
}
