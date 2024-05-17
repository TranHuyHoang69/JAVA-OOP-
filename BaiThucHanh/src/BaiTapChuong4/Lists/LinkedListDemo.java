package BaiTapChuong4.Lists;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<StudentList> linkListStudentc4 = new LinkedList<StudentList>();
        for(int i=0;i<5;i++){
            StudentList st = new StudentList();
            st.In();
            linkListStudentc4.add(st);
        }
        for(int i=0;i<linkListStudentc4.size();i++){
            linkListStudentc4.get(i).Out();
        }
    }
}
