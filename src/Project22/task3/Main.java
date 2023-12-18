package src.Project22.task3;

public class Main {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        IDocument document = textDocumentFactory.createNew();

        document.open();
        document.edit();
        document.save();
        document.close();
    }
}