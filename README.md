# **CalcEnergia**

> Um aplicativo Android simples para calcular a potência e o consumo de eletrônicos.


## 📱 Descrição

O **CalcEnergia** é uma aplicação Android simples que permite ao usuário calcular o consumo de energia e o custo associado com base em três entradas: potência do aparelho (em Watts),
tempo de uso (em horas) e preço por kWh. A interface é construída com ConstraintLayout, garantindo uma disposição responsiva e organizada dos elementos. 

## 🔧 Funcionalidades

- [x] Cálculo de Consumo: O usuário insere a potência do aparelho e o tempo de uso, e a aplicação calcula o consumo total de energia em kWh.
- [x] Cálculo de Custo: Com base no consumo de energia e no preço por kWh fornecido pelo usuário, a aplicação calcula o custo total da energia utilizada.
- [x] Interface Intuitiva: A interface é amigável e fácil de usar, com campos de entrada claros e feedback visual imediato após os cálculos.
- [x] Ícones Visuais: Os resultados são acompanhados de ícones que se tornam visíveis após a realização do cálculo, tornando a experiência do usuário mais interativa.

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/Calculadora-de-consumo.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/calculandodoconsumo
│ │ │ │ ├── MainActivity.java # Atividade principal com cálculo do consumo
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo 
````

## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.

 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário insere a potência em Watts, o tempo de uso estimativo e o preço por kwh, e o app calcula e exibe o consumo e o custo.
 
![calcenergia](https://github.com/user-attachments/assets/02ed3981-fc5e-414f-9137-03300300151c) 

## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15) 

 ## 📄 Licença MIT

 Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).


 
