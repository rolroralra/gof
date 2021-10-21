package behavioral.command.example.client;


import behavioral.command.example.command.OpenTextFileOperation;
import behavioral.command.example.command.SaveTextFileOperation;
import behavioral.command.example.command.TextFileOperation;
import behavioral.command.example.invoker.TextFileOperationExecutor;
import behavioral.command.example.receiver.TextFile;
import org.junit.jupiter.api.Test;

public class TextFileApplication {

    @Test
    public void test_Command_Pattern_Example() {
        
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }   
}
