import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        BufferedReader  buffer = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")));
        String conteudo = buffer.readLine();

        while (conteudo!=null){
            System.out.println(conteudo);
            conteudo = buffer.readLine();
        }
        buffer.close();

    }
}
