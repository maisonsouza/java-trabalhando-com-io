import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();
        socket.getInputStream();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        socket.getOutputStream();
        BufferedWriter bufferWritter = new BufferedWriter(new OutputStreamWriter(System.out));

        String conteudo = bufferReader.readLine();

        while(conteudo!=null && !conteudo.isEmpty()){
            bufferWritter.write(conteudo);
            bufferWritter.newLine();
            bufferWritter.flush();
            conteudo = bufferReader.readLine();
        }

        bufferReader.close();
        bufferWritter.close();
    }

}
