import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
/*
        FileInputStream fileInput = new FileInputStream("/Users/codecadet/workspace/FileManipulation/src/test.txt");
        FileOutputStream fileOut = new FileOutputStream("/Users/codecadet/workspace/FileManipulation/src/testcopy.txt");

        int b = fileInput.read();

        while(b != -1){
            fileOut.write(b);
            b = fileInput.read();
        }
        fileOut.close();
        fileInput.close();
*/
        //FileManipulator fileManipulator = new FileManipulator("/Users/codecadet/workspace/FileManipulation/src/test.txt", "/Users/codecadet/workspace/FileManipulation/src/testcopy.txt");
        //fileManipulator.fileCopyBuffer();

        if (args.length != 2) {
            System.out.println("Usage: FileManipulator <source_file> <destination_file>");
            System.exit(1);
        }

        FileManipulator fileManipulator = new FileManipulator(args[0], args[1]);
        fileManipulator.fileCopyBuffer();

    }
}


