import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {
        BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lorem2.txt")));
        buffer.write("Maison Marcel Madri");
        buffer.newLine();
        buffer.newLine();
        buffer.write("Galvão dos Santos Souza");
        buffer.close();
    }
}
