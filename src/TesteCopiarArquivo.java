import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        BufferedReader fluxo_leitor = new BufferedReader(new InputStreamReader((socket.getInputStream())));
        BufferedWriter fluxo_escritor = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String conteudo = fluxo_leitor.readLine();
        while (conteudo != null && !conteudo.isEmpty()) {
            fluxo_escritor.write(conteudo);
            fluxo_escritor.newLine();
            fluxo_escritor.flush();
            conteudo = fluxo_leitor.readLine();
        }
        fluxo_escritor.close();
        fluxo_leitor.close();
    }
}
