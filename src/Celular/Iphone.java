package Celular;

import chamadasTelefonicas.ChamadasTelefonicas;
import musicas.ReprodutorMusical;
import navegadorInternet.NavegadorInternet;

public class Iphone {

	public static void main(String[] args) {
			Apps aplicativo = new Apps();
			
			ChamadasTelefonicas ligacao = aplicativo;
			ReprodutorMusical musica = aplicativo;
			NavegadorInternet internet = aplicativo;
			
			musica.tocarMusica();
			internet.adicionarNovaAba();
			ligacao.atender();
			

	}

}
