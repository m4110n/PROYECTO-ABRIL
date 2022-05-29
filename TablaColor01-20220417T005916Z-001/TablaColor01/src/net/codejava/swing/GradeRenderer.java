//Anderson Esmaikel Sanchez Donis / 7490-20-13902
package net.codejava.swing;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import net.codejava.model.Student.Grade;
public class GradeRenderer extends JLabel implements TableCellRenderer
{public GradeRenderer()
    {super.setOpaque(true);}
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column)
    {
        Grade grade = (Grade) value;
        if(grade == Grade.Aa) {
            super.setBackground(Color.WHITE);
        }
        else if(grade == Grade.Bb) {
            super.setBackground(Color.BLUE);
        }
        else if(grade == Grade.Cc) {
            super.setBackground(Color.YELLOW);
        }
         else if(grade == Grade.Dd) {
            super.setBackground(Color.GREEN);
         }
        else if(grade == Grade.Ee) 
        { super.setBackground(Color.ORANGE); }return this;}}
