import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Maison");
//        cliente.setCpf("98225723287");
//        cliente.setProfissao("Desenvolvedor");
//
//        ContaCorrente cc = new ContaCorrente(11,22);
//        cc.setTitular(cliente);
//        cc.deposita(250);

//        Serializando
//        String nome = "Steppat";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
//        oos.writeObject(cc);
//        oos.close();


//        Deserializando
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente contaCorrente = (ContaCorrente) ois.readObject();
        System.out.println(contaCorrente.getTitular() .getNome());
        System.out.println(contaCorrente.getSaldo());
        ois.close();
    }
}
