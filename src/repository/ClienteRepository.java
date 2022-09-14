package repository;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Cliente;

public class ClienteRepository {

	// criando uma função para exportar os dados do cliente que é uma pessoa e tem
	// um endereço.
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
			printWriter.write("\nID DO ENDEREÇO...........: " + cliente.getEndereco().getId());
			printWriter.write("\nLOGRADOURO DO ENDEREÇO...: " + cliente.getEndereco().getLogradouro());
			printWriter.write("\nCOMPLEMENTO DO ENDEREÇO..: " + cliente.getEndereco().getComplemento());
			printWriter.write("\nNUMERO DO ENDEREÇO.......: " + cliente.getEndereco().getNumero());
			printWriter.write("\nBAIRRO DO ENDEREÇO.......: " + cliente.getEndereco().getBairro());
			printWriter.write("\nCIDADE DO ENDEREÇO.......: " + cliente.getEndereco().getCidade());
			printWriter.write("\nESTADO DO ENDEREÇO.......: " + cliente.getEndereco().getEstado());
			printWriter.write("\nCEP DO ENDEREÇO..........: " + cliente.getEndereco().getCep());
			
			printWriter.flush();
			printWriter.close();
			
			System.out.println("\nARQUIVO TXT GRAVADO.");

		} catch (Exception e) {

		}
	}

}
