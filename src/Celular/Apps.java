package Celular;

import chamadasTelefonicas.ChamadasTelefonicas;
import musicas.ReprodutorMusical;
import navegadorInternet.NavegadorInternet;

public class Apps implements ChamadasTelefonicas, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a pagina de navegação");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba no navegador adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Musica pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}

	@Override
	public void ligar() {
		System.out.println("Chamando");
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Exibindo mensagens de voz");
		
	}

}
