package controller;

import java.util.Scanner;

import entities.Cliente;
import entities.Endereco;
import repository.ClienteRepository;

public class ClienteController {

	public void cadastrarCliente() {

		System.out.println("\n***Cadastrando os Clientes***\n");
		try {
			Scanner scanner = new Scanner(System.in);

			Cliente cliente = new Cliente();
			Endereco endereco = new Endereco();

			System.out.println("dados pessoa");
			System.out.println("Entre com o id ..................: ");
			cliente.setId(Integer.parseInt(scanner.nextLine()));
			System.out.println("Entre com o nome ................: ");
			cliente.setNome(scanner.nextLine());
			System.out.println("Entre com o sobreNome............: ");
			cliente.setSobreNome(scanner.nextLine());

			System.out.println("dados cliente");
			System.out.println("Entre com o cpf do Cliente.......: ");
			cliente.setCpf(scanner.nextLine());
			System.out.println("Entre com o email do Cliente.....: ");
			cliente.setEmail(scanner.nextLine());
			System.out.println("Entre com a telefone do cliente..: ");
			cliente.setTelefone(scanner.nextLine());

			System.out.println("dados do Endereço");
			System.out.println("Entre com o id ..................:");
			endereco.setId(Integer.parseInt(scanner.nextLine()));			
			System.out.println("Entre com o logradouro...........:");
			endereco.setLogradouro(scanner.nextLine());			
			System.out.println("Entre com o complemento..........:");
			endereco.setComplemento(scanner.nextLine());			
			System.out.println("Entre com o numero...............:");
			endereco.setNumero(scanner.nextLine());
			System.out.println("Entre com o bairro...............:");
			endereco.setBairro(scanner.nextLine());
			System.out.println("Entre com a cidade...............:");
			endereco.setCidade(scanner.nextLine());
			System.out.println("Entre com o estado...............:");
			endereco.setEstado(scanner.nextLine());
			System.out.println("Entre com o cep..................:");
			endereco.setCep(scanner.nextLine());
			
			cliente.setEndereco(endereco);
			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.exportarDados(cliente);
				
		} catch (Exception e) {

			System.out.println("\nErrou!!!");
			e.printStackTrace();
		}
		System.out.println("\nEncerrado.");
	}

}
