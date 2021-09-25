package homework.chain;

public class ConsoleMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("Print to console " + message);
    }
}
