import java.io.*;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {
//        BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lorem2.txt")));
//        buffer.write("Maison Marcel Madri");
//        buffer.newLine();
//        buffer.newLine();
//        buffer.write("Galvão dos Santos Souza");
//        buffer.close();
        PrintWriter ps = new PrintWriter("lorem4.txt");
        ps.println("Lorem ipsum dolor sit amet");
        ps.println();
        ps.println("Lorem ipsum dolor sit amet");
        ps.println("Lorem ipsum dolor sit amet");
        ps.close();
    }
}
