package br.ufjf.dcc171;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Aula01Exr01 {

    public static void main(String[] args) {
        try {
            float c, l, a;
            String s1, s2, s3;
            s1 = JOptionPane.showInputDialog("Digite o comprimento do pacote: ");
            if (s1 == null) {
                JOptionPane.showMessageDialog(null, "Você deveria ter digitado um número!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            s2 = JOptionPane.showInputDialog("Digite a largura do pacote: ");
            if (s2 == null) {
                JOptionPane.showMessageDialog(null, "Você deveria ter digitado um número!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
            s3 = JOptionPane.showInputDialog("Digite a altura do pacote: ");
            if (s3 == null) {
                JOptionPane.showMessageDialog(null, "Você deveria ter digitado um número!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }

            c = Float.parseFloat(s1);
            l = Float.parseFloat(s2);
            a = Float.parseFloat(s3);

            JOptionPane.showMessageDialog(null, "O volume do pacote é " + (c * l * a) + "cm³", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Informe apenas valores numéricos!", "ERRO!", JOptionPane.ERROR_MESSAGE);

        }
    }

}
