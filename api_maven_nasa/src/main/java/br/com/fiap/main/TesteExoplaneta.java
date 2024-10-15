package br.com.fiap.main;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.http.client.ClientProtocolException;
import br.com.fiap.model.Exoplaneta;
import br.com.fiap.service.ExoplanetaService;

public class TesteExoplaneta {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ExoplanetaService exoplanetaService = new ExoplanetaService(); // Atualizando para ExoplanetaService

		String p = texto("Digite o nome do exoplaneta:"); // Mudando a mensagem para refletir exoplanetas

		Exoplaneta exoplaneta = exoplanetaService.getExoplaneta(p); // Atualizando para usar Exoplaneta

		if (exoplaneta != null) {
			JOptionPane.showMessageDialog(null, exoplaneta.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Exoplaneta não encontrado.");
		}
	}

}
