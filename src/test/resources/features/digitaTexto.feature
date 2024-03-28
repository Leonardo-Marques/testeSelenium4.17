#language: pt

@Feature
Funcionalidade: Digitar texto no input

  Contexto:
    Dado que estou na pagina inicial

  @Cenario1
  Cenario: digito texto e clico no botao
    Dado Digito o texto "esse é meu texto"
    E clico no botao
    Entao Valido que exiba o texto "esse é meu texto"

  @Cenario2
  Esquema do Cenario: mesmo que cenario 1 porem com varivel
    Dado Digito o texto <texto>
    E clico no botao
    Entao Valido que exiba o texto <texto validacao>
    Exemplos:
      | texto               | texto validacao             |
      | "esse é meu texto"  | "esse é meu texto"          |
      | "esse é meu texto2" | "esse é meu texto2"         |
      | "esse é meu texto2" | "esse é meu texto com erro" |