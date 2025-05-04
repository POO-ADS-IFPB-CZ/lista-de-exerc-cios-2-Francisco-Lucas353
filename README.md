**Questão 1:**

É considerado boa prática usar getters e setters porque eles permitem encapsular os dados, protegendo os atributos internos da classe contra acessos ou modificações indevidas. Além disso, possibilitam a imposição de regras para garantir a integridade dos valores armazenados.

Exemplo:


    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
          this.nota = nota;
        } 
        
        else {
        System.out.println("Nota invalida. A nota deve estar entre 0 e 10.");
        }
    }

**Questão 2:**

a) Título, autor, editora, ano de publicação, gêneros, código, quantidade e disponibilidade.

b) Seria considerado uma abstração por ser uma representação em codigo de algo real, contendo elementos do livro real e elementos somente criados para o sistema.

c) 

    public boolean emprestar()
      
 Altera o status do livro para emprestado, caso disponível.

    public void devolver()

 Marca o livro como disponível novamente após devolução.


    public void exibirInformacoes()

 Mostra todos os dados do livro.

