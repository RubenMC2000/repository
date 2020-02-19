import java.io.*;

public class FileManipulator {

    private FileInputStream fileInput;
    private FileOutputStream fileOut;
    byte[] buffer = new byte[1024];

    public FileManipulator(String fileSource, String fileDestination) throws FileNotFoundException {
        this.fileInput = new FileInputStream(fileSource);
        this.fileOut = new FileOutputStream(fileDestination);
    }

    public void fileCopy() throws IOException {
        int b = fileInput.read();

        while (b != -1) {
            fileOut.write(b);
            b = fileInput.read();
        }
        fileOut.close();
        fileInput.close();
    }

        public void fileCopyBuffer() throws IOException {
            int num = fileInput.read(buffer);

            while(num != -1){
                fileOut.write(buffer,0, num);
                num = fileInput.read(buffer);

        }
            fileOut.close();
            fileInput.close();
    }
}
