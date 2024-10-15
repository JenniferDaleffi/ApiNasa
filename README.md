# Exoplaneta Search Application
<p align="center">
  <a href="https://icons8.com.br/icon/13679/java">
    <img src="https://img.icons8.com/?size=100&id=13679&format=png&color=000000" />
  </a>
</p>

## Descrição

Este projeto é uma aplicação Java que permite a busca de informações sobre exoplanetas utilizando a API "Le Système Solaire". A aplicação coleta o nome de um exoplaneta através de uma interface gráfica e exibe suas informações, como nome em inglês, gravidade, nome comum e ID.

## Estrutura do Projeto

O projeto é dividido em três pacotes principais:

1. **MAIN**: Contém a classe principal `TesteExoplaneta`, que gerencia a interação do usuário e chama os serviços para buscar informações sobre exoplanetas.
   
2. **MODEL**: Contém a classe `Exoplaneta`, que representa o modelo de dados de um exoplaneta. Esta classe possui atributos como nome em inglês, gravidade, nome comum e ID, além de métodos getters, setters e um método `toString` para exibir as informações do exoplaneta.

3. **SERVICE**: Contém a classe `ExoplanetaService`, responsável por realizar a requisição HTTP à API e processar a resposta. Utiliza a biblioteca Apache HttpClient para realizar requisições e a biblioteca Gson para deserializar a resposta JSON em um objeto da classe `Exoplaneta`.

## Dependências

- Apache HttpClient
- Gson

## Instruções para Execução

1. **Clone o Repositório**: 
   ```bash
   git clone <URL_DO_REPOSITORIO>

2. **Adicione as Dependências**: 
Certifique-se de incluir as bibliotecas Apache HttpClient e Gson no seu projeto. Você pode usar um gerenciador de dependências como Maven ou Gradle.

3. **Execute a Classe Principal**: 
No seu ambiente de desenvolvimento, execute a classe TesteExoplaneta para iniciar a aplicação.

4. **Interaja com a Interface**: 
Uma caixa de diálogo aparecerá pedindo para digitar o nome de um exoplaneta. Após a entrada, a aplicação fará a busca e exibirá as informações do exoplaneta ou uma mensagem informando que o exoplaneta não foi encontrado.

## Exemplo de Uso
1. Inicie a aplicação.
2. Digite o nome de um exoplaneta, como "Kepler-22b".
3. A aplicação retornará as informações correspondentes ou uma mensagem de erro.