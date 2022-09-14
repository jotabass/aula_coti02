package repository;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Cliente;

public class ClienteRepository {

	// criando uma fun��o para exportar os dados do cliente que � uma pessoa e tem
	// um endere�o.
	public void exportarDados(Cliente cliente) {
		try {
			// colacando data atual do sistema no titulo do arquivo
			String data = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente" + data + ".txt");

			printWriter.write("\nCPF DO CLIENTE...........: " + cliente.getCpf());
			printWriter.write("\nEMAIL DO CLIENTE.........: " + cliente.getEmail());
			printWriter.write("\nTELEFONE DO CLIENTE......: " + cliente.getTelefone());
			printWriter.write("\nID DA PESSOA.............: " + cliente.getId());
			printWriter.write("\nNOME DA PESSOA...........: " + cliente.getNome());
			printWriter.write("\nSOBRENOME DA PESSOA......: " + cliente.getSobreNome());
			printWriter.write("\nID DO ENDERE�O...........: " + cliente.getEndereco().getId());
			printWriter.write("\nLOGRADOURO DO ENDERE�O...: " + cliente.getEndereco().getLogradouro());
			printWriter.write("\nCOMPLEMENTO DO ENDERE�O..: " + cliente.getEndereco().getComplemento());
			printWriter.write("\nNUMERO DO ENDERE�O.......: " + cliente.getEndereco().getNumero());
			printWriter.write("\nBAIRRO DO ENDERE�O.......: " + cliente.getEndereco().getBairro());
			printWriter.write("\nCIDADE DO ENDERE�O.......: " + cliente.getEndereco().getCidade());
			printWriter.write("\nESTADO DO ENDERE�O.......: " + cliente.getEndereco().getEstado());
			printWriter.write("\nCEP DO ENDERE�O..........: " + cliente.getEndereco().getCep());
			
			printWriter.flush();
			printWriter.close();
			
			System.out.println("\nARQUIVO TXT GRAVADO.");

		} catch (Exception e) {

		}
	}

}
