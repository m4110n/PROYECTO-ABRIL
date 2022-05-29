//Anderson Esmaikel Sanchez Donis / 7490-20-13902

package net.codejava.swing;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import net.codejava.model.Student;
import net.codejava.model.Student.Grade;
public class TableRendererSample extends JFrame
{
   public TableRendererSample()
    {
        Student row1 = new Student("ISTJ", Grade.Aa, Grade.Bb, Grade.Bb, Grade.Dd, Grade.Bb, Grade.Cc,Grade.Dd,Grade.Cc,Grade.Cc,Grade.Ee,Grade.Ee,
                                            Grade.Ee,Grade.Dd,Grade.Cc,Grade.Ee,Grade.Dd);
        Student row2 = new Student("ISFJ", Grade.Bb, Grade.Aa, Grade.Dd, Grade.Bb, Grade.Cc, Grade.Dd,Grade.Cc,Grade.Dd,Grade.Bb,Grade.Cc,Grade.Cc,
                                            Grade.Dd,Grade.Ee,Grade.Ee,Grade.Ee,Grade.Ee);
        Student row3 = new Student("ESTJ", Grade.Bb, Grade.Cc, Grade.Aa, Grade.Dd, Grade.Dd, Grade.Ee,Grade.Bb,Grade.Dd,Grade.Cc,Grade.Ee,Grade.Ee,
                                             Grade.Cc,Grade.Dd,Grade.Ee,Grade.Cc,Grade.Bb);
        Student row4 = new Student("ESFJ", Grade.Dd, Grade.Bb, Grade.Bb, Grade.Aa, Grade.Cc, Grade.Dd,Grade.Dd,Grade.Bb,Grade.Cc,Grade.Ee,Grade.Cc,
                                            Grade.Dd,Grade.Ee,Grade.Ee,Grade.Ee,Grade.Cc);
        Student row5 = new Student("ISTP", Grade.Bb, Grade.Dd, Grade.Dd, Grade.Cc, Grade.Aa, Grade.Bb,Grade.Bb,Grade.Dd,Grade.Ee,Grade.Ee,Grade.Cc,
                                             Grade.Ee,Grade.Cc,Grade.Dd,Grade.Ee,Grade.Cc);
        Student row6 = new Student("ISFP", Grade.Cc, Grade.Bb, Grade.Ee, Grade.Dd, Grade.Bb, Grade.Aa,Grade.Dd,Grade.Bb,Grade.Cc,Grade.Dd,Grade.Dd,
                                            Grade.Cc,Grade.Ee,Grade.Cc,Grade.Ee,Grade.Ee);
        Student row7 = new Student("ESTP", Grade.Dd, Grade.Ee, Grade.Bb, Grade.Cc, Grade.Bb, Grade.Cc,Grade.Aa,Grade.Dd,Grade.Ee,Grade.Ee,Grade.Dd,
                                            Grade.Cc,Grade.Cc,Grade.Ee,Grade.Bb,Grade.Dd);
        Student row8 = new Student("ESFP", Grade.Cc, Grade.Dd, Grade.Cc, Grade.Bb, Grade.Dd, Grade.Bb,Grade.Bb,Grade.Aa,Grade.Ee,Grade.Cc,Grade.Dd,
                                             Grade.Dd,Grade.Ee,Grade.Ee,Grade.Cc,Grade.Ee);
        Student row9 = new Student("INFJ", Grade.Cc, Grade.Bb, Grade.Ee, Grade.Cc, Grade.Ee, Grade.Dd,Grade.Ee,Grade.Ee,Grade.Aa,Grade.Bb,Grade.Dd,
                                            Grade.Bb,Grade.Dd,Grade.Dd,Grade.Cc,Grade.Cc);
        Student row10 = new Student("INFP", Grade.Ee, Grade.Cc, Grade.Ee, Grade.Ee, Grade.Cc, Grade.Dd,Grade.Ee,Grade.Cc,Grade.Bb,Grade.Aa,Grade.Bb,
                                              Grade.Dd,Grade.Dd,Grade.Bb,Grade.Dd,Grade.Cc);
        Student row11 = new Student("ENFP", Grade.Ee, Grade.Ee, Grade.Ee, Grade.Cc, Grade.Ee, Grade.Cc,Grade.Cc,Grade.Dd,Grade.Dd,Grade.Bb,Grade.Aa,
                                             Grade.Bb,Grade.Cc,Grade.Dd,Grade.Bb,Grade.Dd);
        Student row12 = new Student("ENFJ", Grade.Ee, Grade.Cc, Grade.Cc, Grade.Bb, Grade.Ee, Grade.Ee,Grade.Ee,Grade.Cc,Grade.Bb,Grade.Dd,Grade.Bb,
                                             Grade.Aa,Grade.Dd,Grade.Cc,Grade.Dd,Grade.Dd);
        Student row13 = new Student("INTJ", Grade.Bb, Grade.Ee, Grade.Cc, Grade.Ee, Grade.Cc, Grade.Ee,Grade.Cc,Grade.Ee,Grade.Dd,Grade.Dd,Grade.Cc,
                                             Grade.Dd,Grade.Aa,Grade.Bb,Grade.Dd,Grade.Bb);
        Student row14 = new Student("INTP", Grade.Cc, Grade.Ee, Grade.Ee, Grade.Ee, Grade.Dd, Grade.Cc,Grade.Cc,Grade.Ee,Grade.Dd,Grade.Bb,Grade.Dd,
                                            Grade.Cc,Grade.Bb,Grade.Aa,Grade.Bb,Grade.Dd);
        Student row15 = new Student("ENTP", Grade.Ee, Grade.Ee, Grade.Cc, Grade.Ee, Grade.Cc, Grade.Ee,Grade.Dd,Grade.Cc,Grade.Cc,Grade.Dd,Grade.Bb,
                                            Grade.Dd,Grade.Dd,Grade.Bb,Grade.Aa,Grade.Bb);
        Student row16 = new Student("ENTJ", Grade.Dd, Grade.Ee, Grade.Bb, Grade.Cc, Grade.Cc, Grade.Ee,Grade.Cc,Grade.Ee,Grade.Cc,Grade.Ee,Grade.Dd,
                                            Grade.Dd,Grade.Bb,Grade.Dd,Grade.Bb,Grade.Aa);
        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(row1);
        StudentList.add(row2);
        StudentList.add(row3);
        StudentList.add(row4);
        StudentList.add(row5);
        StudentList.add(row6);
        StudentList.add(row7);
        StudentList.add(row8);
        StudentList.add(row9);
        StudentList.add(row10);
        StudentList.add(row11); 
        StudentList.add(row12);
        StudentList.add(row13);
        StudentList.add(row14);
        StudentList.add(row15);
        StudentList.add(row16);
        
        
//------------------------------------------------------------------------------
        
        StudentTableModel model = new StudentTableModel(StudentList);
        JTable table = new JTable(model);
        table.setDefaultRenderer(Grade.class, new GradeRenderer());
        this.add(new JScrollPane(table));
        this.setTitle("16 PERSONALIDADES");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableRendererSample();
            }
        });
    }   
 
}
