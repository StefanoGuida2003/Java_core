import javax.swing.text.AttributeSet;
import java.text.StringCharacterIterator;

public class SwitchExamples {
    public static void main(String[] args) {
        String argument = args[0];
        char c = argument.charAt(0);
        switch (c){
            case '+':
                System.out.println("L'operazione è una somma");
                break;
            case '-':
                System.out.println("L'operazione è una differenza");
                break;
            case '*':
                System.out.println("L'operazione è un prodotto");
                break;
            case '/':
                System.out.println("L'operazione è una divisione");
                break;
            default:
                System.out.println("Operazione inserita errata");
                break;
        }
    }
}
