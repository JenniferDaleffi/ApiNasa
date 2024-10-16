package br.com.fiap.service;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import br.com.fiap.model.Exoplaneta;

public class ExoplanetaService {

	public Exoplaneta getExoplaneta(String nome) throws ClientProtocolException, IOException {
		Exoplaneta exoplaneta = null;

		String url = "https://api.le-systeme-solaire.net/rest/bodies/" + nome;

		// request
		HttpGet request = new HttpGet(url);

		// client
		CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

		// response
		CloseableHttpResponse response = httpClient.execute(request);

		// entity
		HttpEntity entity = response.getEntity();

		if (entity != null) {
			String result = EntityUtils.toString(entity);
			Gson gson = new Gson();

			// Aqui, você precisará ajustar a deserialização com base na resposta da API
			exoplaneta = gson.fromJson(result, Exoplaneta.class);
		}

		return exoplaneta;
	}
}
