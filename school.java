import java.util.*;
public class school
{
    private ArrayList<Classroom> classrooms;
    public school(ArrayList<Classroom> schoolRooms)
    {
        classrooms=schoolRooms;
    }
    public String findstudent(String teachersname,int idnum)
    {
        for(int k=0;k<classrooms.size();k++)
        {
            if(classrooms.get(k).getTeacherName().equals(teachersname))
            {
                int flag=0;
                int pos=0;
                int lb=0;
                int ub=classrooms.get(k).getstudents().size()-1;
                while(lb<=ub)
                {
                    int mid=(lb+ub)/2;
                    if(classrooms.get(k).getstudents().get(mid).getStudentID()==idnum)
                    {
                        flag++;
                        pos=mid;
                    }
                    else if(classrooms.get(k).getstudents().get(mid).getStudentID()>idnum)
                    {
                        lb=mid-1;
                    }
                    else
                    {
                        ub=mid+1;
                    }
                }
                if(flag==0)
                {
                    return classrooms.get(k).getstudents().get(pos).getStudentName();
                }
                
            }
        }
        
                    return "Student not found";
    }
    public class Classroom
    {
        private String teachersname;
        private ArrayList<Student> Students;
        public Classroom(String teacher,ArrayList<Student> thestudents)
        {
            teachersname=teacher;
            Students=thestudents;
        }
        public String getTeacherName()
        {
            return teachersname;
        }
        public ArrayList<Student> getstudents()
        {
            return Students;
        }
    }
    public class Student
    {
        private String studentname;
        private int studentid;
        public Student(String name, int ID)
        {
            studentname=studentname;
            studentid=ID;
        }
        public int getStudentID()
        {
            return studentid;
        }
        public String getStudentName()
        {
            return studentname;
        }
    }
}
        