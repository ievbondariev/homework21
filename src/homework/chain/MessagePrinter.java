package homework.chain;

public abstract class MessagePrinter {
    private MessagePrinter nextMessagePrinter;

    void setNextMessagePrinter(MessagePrinter nextMessagePrinter) {
        this.nextMessagePrinter = nextMessagePrinter;
    }

    void print(String message) {
        printMessage(message);

        if (nextMessagePrinter != null) {
            nextMessagePrinter.print(message);
        }
    }

    abstract void printMessage(String message);
}
