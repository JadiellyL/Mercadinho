/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.el.impl.parser.ParseException;

/**
 *
 * @author jade
 */
public class Backup_bd {
    
   public void executaBackup() throws ParseException, SQLException, IOException{
        try {
            String nomeBkp = "sistemaBKP.sql";
            String dump = "mysqldump --user=root --password=root mercadinho > /home/backup/" + nomeBkp;
            Runtime bkp = Runtime.getRuntime();
            bkp.exec(dump);            
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro" + ex.getMessage());
        }
    }

}
