package homework.chain;

public class Main {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new ConsoleMessagePrinter();
        FileMessagePrinter fileMessagePrinter = new FileMessagePrinter();

        messagePrinter.setNextMessagePrinter(fileMessagePrinter);
        fileMessagePrinter.setNextMessagePrinter(new DataBaseMessagePrinter());
        messagePrinter.print("Hello");
    }
}
