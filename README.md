1. Objetivo
O objetivo deste documento é descrever o plano para testar a navegabilidade do site GameMania em suas versões HTML, CSS e JavaScript puros e Angular. Este documento visa:
- Identificar os projetos a serem testados;
- Listar quais requisitos serão testados;
- Recomendar e descrever as estratégias de teste a serem utilizadas;
- Identificar os recursos e esforços necessários para teste, incluindo o cronograma;
- Listar os elementos resultantes do projeto de testes.


2. Escopo
Serão efetuados testes funcionais de navegabilidade e cadastro no site GameMania. Os seguintes requisitos serão testados nos endereços especificados abaixo:
- Cadastro de usuário e login no site: GameMania versão Angular executando localmente na porta 4200, site, e 3000, API.


3. Requisitos
Serão testados os seguintes casos de uso no GameMania versão HTML, CSS e JavaScript puros:

Cliente -> Cadastrar-se (e-mail já existe/dados inválidos) -> Mensagem de sucesso <- Sistema
Cliente -> Login (e-mail não cadastrado, senha incorreta, dados inválidos) -> Dados ok: carregar home <- Sistema


4. Estratégia de testes
4.1 Cadastro de usuário
- Objetivo: Clicar na opção "login" no menu superior, clicar em "cadastre-se", informar os dados "TesteAutomatico" no campo "nome", "testeautomatico@email.com" no campo de email, e "123456" no campo senha. Clicar no botão de submit. Observar resultados conforme critérios de conclusão.
- Técnica: Imprementar o teste automatizado conforme objetivo.
- Critérios de conclusão: Observar se a mensagem de sucesso aparece após cadastro. Ao tentar cadastrar o mesmo e-mail novamente, mensagem de alerta deve aparecer não permitindo tal ação.

4.1.2 Efetuar Login
- Objetivo: Na página de "login" utilizada no teste 4.1, informar agora no formulário "testeautomatico@email.com" no campo de email, e "123456" no campo senha. Observar os resultados conforme critérios de avaliação.
- Técnica: Implementar o teste automatizado conforme objetivo.
- Critérios de conoclusão: Com o e-mail e senha corretos se espera o redirecionamento para a home do site.


4.2 Ferramentas
Sistema operacional: Windows 10 pro
Planejamento: Readme
Desenho e execução:
- Eclipse IDE, versão 4.22
- JUnit, versão 4.12
- Selenium Java, versão 3.141.59