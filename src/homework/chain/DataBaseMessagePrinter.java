package homework.chain;

public class DataBaseMessagePrinter extends MessagePrinter {

    @Override
    void printMessage(String message) {
        System.out.println("Print to database " + message);
    }
}
