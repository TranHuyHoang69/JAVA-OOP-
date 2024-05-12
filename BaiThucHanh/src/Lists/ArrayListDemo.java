package Lists;
    import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<StudentList> arrListStudent = new ArrayList<StudentList>();
        for(int i=0;i<5;i++){
            StudentList st = new StudentList();
            st.In();
            arrListStudent.add(st);
        }
        for(int i = 0; i < arrListStudent.size(); i++){
            arrListStudent.get(i).Out();
        }
    }
}
