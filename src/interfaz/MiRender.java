package interfaz;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiRender extends DefaultTableCellRenderer
{
   public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      if ( row % 2 == 0 )
      {
         this.setOpaque(true);
         this.setBackground(Color.LIGHT_GRAY);
         this.setForeground(Color.BLACK);
      } else {
    	  this.setOpaque(true);
          this.setBackground(Color.GRAY);
          this.setForeground(Color.BLACK);
      }

      return this;
   }
}