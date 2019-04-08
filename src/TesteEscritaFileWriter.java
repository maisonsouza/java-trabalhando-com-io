import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {
//        BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lorem2.txt")));
//        buffer.write("Maison Marcel Madri");
//        buffer.newLine();
//        buffer.newLine();
//        buffer.write("Galvão dos Santos Souza");
//        buffer.close();
        FileWriter escritor = new FileWriter("lorem3.txt");
        escritor.write(System.lineSeparator());
        escritor.write("LOREM IPSUM DOLOR SIT AMET");
        escritor.write(System.lineSeparator());
        escritor.write(System.lineSeparator());
        escritor.write("asdasdsad asdsad asjfbhdsjkbfksdfoas dahsofha as ashfdash ashfoh as");
        escritor.close();
    }
}
