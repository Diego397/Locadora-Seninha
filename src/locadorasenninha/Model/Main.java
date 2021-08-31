//teste 2
package locadorasenninha.Model;
import locadorasenninha.View.TelaInicial;
import locadorasenninha.Controller.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main{
    public static String cpfView = new String();
    public static String numeroView = new String();
    public static Locadora locadora = new Locadora();
    public static LocadoraController controller = new LocadoraController(locadora);

    public static void main(String args[]){
        ManipuladorArquivo arq = new ManipuladorArquivo();

        try {
            arq.leitor("src/locadorasenninha/Model/Dados.txt", locadora, controller);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            arq.escritor("src/locadorasenninha/Model/Dados.txt", locadora);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
}