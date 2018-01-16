import javax.swing.JOptionPane;

public class GetInputReader1{

    public static void main(String[] args) {
        String nim, nama, tempat, tgllahir;

        nim = JOptionPane.showInputDialog("Inputkan Nim Anda : ");
        nama = JOptionPane.showInputDialog("Inputkan Nama Anda : ");
        tempat = JOptionPane.showInputDialog("Inputkan tempat Lahir Anda : ");
        tgllahir = JOptionPane.showInputDialog("Inputkan Tanggal Lahir Anda : ");
        
        String msg = "Hello" + nim + "\nNama Anda = " + nama + "\nTempat Lahir Anda = " + tempat + "\nTanggal Lahir Anda = " + tgllahir;
        JOptionPane.showMessageDialog(null, msg);

    }
}