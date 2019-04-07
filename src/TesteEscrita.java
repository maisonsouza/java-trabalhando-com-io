import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        FileOutputStream arquivosaida = new FileOutputStream("loremsaida.txt");
        OutputStreamWriter escritor = new OutputStreamWriter(arquivosaida);
        BufferedWriter buffer = new BufferedWriter(escritor);
        buffer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        buffer.newLine();
        buffer.newLine();
        buffer.write("Maison Marcel Madri");
        buffer.newLine();
        buffer.close();
    }

}
