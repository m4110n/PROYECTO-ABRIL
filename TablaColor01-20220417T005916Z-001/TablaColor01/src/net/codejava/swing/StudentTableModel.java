//Anderson Esmaikel Sanchez Donis / 7490-20-13902
package net.codejava.swing;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.codejava.model.Student;
import net.codejava.model.Student.Grade;
public class StudentTableModel extends AbstractTableModel
{
    private final List<Student> studentList;
    private final String[] columnNames = new String[] {
            "Id", "ISTJ", "ISFJ", "ESTJ", "ESFJ", "ISTP","ISFP","ESTP","ESFP","INFJ","INFP","ENFP","ENFJ","INTJ",
                   "INTP","ENTP","ENTJ"
    };
    private final Class[] columnClass = new Class[] {
        String.class, Grade.class, Grade.class, Grade.class, Grade.class, Grade.class, Grade.class, Grade.class, Grade.class, Grade.class,
                      Grade.class, Grade.class, Grade.class,Grade.class,Grade.class,Grade.class,Grade.class
    };
    public StudentTableModel(List<Student> studentList)
    {
        this.studentList = studentList;
    }
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    @Override
    public int getRowCount()
    {
        return studentList.size();
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Student row = studentList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getId();
        }
        else if(1 == columnIndex) {
            return row.getISTJ();
            
        }
        else if(2 == columnIndex) {
            return row.getISFJ();
        }
        
        else if(3 == columnIndex) {
            return row.getESTJ();
        }
        
         else if(4 == columnIndex) {
            return row.getESFJ();
        }
        
         else if(5 == columnIndex) {
            return row.getISTP();
        }
        
        else if(6 == columnIndex) {
            return row.getISFP();
        }
        
        else if(7 == columnIndex) {
            return row.getESTP();
        }
        
        else if(8 == columnIndex) {
            return row.getESFP();
        }
        
         else if(9 == columnIndex) {
            return row.getINFJ();
        }
        
         else if(10 == columnIndex) {
            return row.getINFP();
        }
        
         else if(11 == columnIndex) {
            return row.getENFP();
        }
        
        else if(12 == columnIndex) {
            return row.getENFJ();
        }
        
        else if(13 == columnIndex) {
            return row.getINTJ();
        }
        
         else if(14 == columnIndex) {
            return row.getINTP();
        }
        
         else if(15 == columnIndex) {
            return row.getENTP();
        }
        
         else if(16 == columnIndex) {
            return row.getENTJ();
        }
        
        return null;}}