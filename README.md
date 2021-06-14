# Infnet - TP2 - Fundamentos de Desenvolvimento Java
Teste de performance 2 da matéria de fundamentos de desenvolvimento Java

No Teste de Performance 2, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 3 e 4:

* Construir classes, atributos e métodos
* Criar instâncias e realizar chamadas de métodos
* Escrever construtores
* Implementar sobrecargas de construtores e métodos
* Implementar encapsulamento
* Implementar herança
* Implementar polimorfismo

Você deve criar outro módulo do programa de controle acadêmico para uma instituição de ensino. Agora, você vai utilizar os recursos da orientação a objetos em Java.

Para que o programa seja construído, você deverá instalar e configurar no seu computador o Java Development Kit, além do NetBeans, que contém os recursos necessários para compilar e executar o seu programa Java.

Ao ser iniciado, o programa deve exibir um menu com as seguintes opções:

* \[1\] Cadastrar professor
* \[2\] Cadastrar aluno
* \[3\] Consultar situação de um docente/discente.
* \[4\] Sair.

A estrutura do programa é composta por um vetor com 100 posições, de objetos da classe Pessoa. No seu cadastro, uma pessoa pode ser um professor ou um aluno. Ambos devem herdar atributos da classe Pessoa, mas também devem ter os seus atributos específicos.

O cadastro de professor e de aluno (opções 1 e 2 do menu) deve tratar a entrada de dados. Ao cadastrar um professor ou um aluno, o programa deve informar o código gerado, que é o índice do vetor. Esse índice deve viabilizar a consulta da situação de um docente/discente (item 3 do menu).

Ao realizar a consulta, o programa deve perguntar o código, e retornar a informação sobre o docente/discente pesquisado. Essa informação deve ser retornada a partir da chamada de um método consultarSituacao() da classe Pessoa, que deve ser implementada em Aluno e Professor com o retorno dos atributos gerais de uma pessoa, e os atributos específicos de cada classe, através do conceito de polimorfismo.

Os dados de uma pessoa, comuns ao aluno e ao professor, e os dados específicos de aluno e de professor serão criados por você. Você também deve criar métodos específicos para Aluno e Professor. Desenvolva construtores para as classes. Crie sobrecargas de construtores e de métodos. Pense em dar mais opções ao cliente das classes.

Defina os atributos privados para cada classe, segundo a sua concepção, e métodos públicos get e set para todos os atributos, seguindo os padrões de encapsulamento. Fique atento à utilização de modificadores protected na classe Pessoa para que Aluno e Professor tenham acesso.

Finalmente, crie uma classe que deve conter o método main para a execução do programa e realize alguns testes para demonstrar o funcionamento dele, instanciando os objetos e realizando chamadas de métodos.
