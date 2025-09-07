# 👨‍🍳 Simulacao de Cozinha
Simulação de um jogo onde um cozinheiro prepara 5 pratos simultaneamente com diferentes tempos de cozimento e sistema de entrega.

## 🎯 Funcionalidades

- 5 pratos sendo preparados simultaneamente
- Dois tipos de pratos com tempos diferentes:
  - **Sopa de Cebola** (IDs ímpares): 0.5-0.8 segundos
  - **Lasanha a Bolonhesa** (IDs pares): 0.6-1.2 segundos
- Atualização do percentual de cozimento a cada 0.1 segundos
- Sistema de entrega sequencial (um prato por vez)
- Interface visual com emojis e cores para cada prato

## 🚀 Como executar

### Pré-requisitos
- JDK 8 ou superior
- Git instalado

### Passo a passo
1. Clone o repositório:
```bash
git clone https://github.com/GabrielGit10110/SimuladorCozinha.git
```

2. Acesse o diretório do projeto:
```bash
cd SimuladorCozinha
```

3. Compile o código:
```bash
javac -d bin src/*.java
```

4. Execute a aplicação:
```bash
java -cp bin Main
```

## 🍲 Tipos de Pratos

- **🔵 Pratos Ímpares (1, 3, 5)**: Sopa de Cebola - 0.5 a 0.8 segundos
- **🟠 Pratos Pares (2, 4)**: Lasanha a Bolonhesa - 0.6 a 1.2 segundos

## 🛠️ Tecnologias utilizadas
- Java SE
- Programação multithread
- Temporização precisa com `Thread.sleep()`
- Sincronização para entrega sequencial
- Cores ANSI para melhor visualização
- JDK 8+

## 📋 Exemplo de saída
```
prato numero #2, lasanha a bolonhesa, enviado para o preparo
prato numero #5, sopa de cebola, enviado para o preparo
prato numero #1, sopa de cebola, enviado para o preparo
prato numero #4, lasanha a bolonhesa, enviado para o preparo
prato numero #3, sopa de cebola, enviado para o preparo
prato #1 0% concluido
prato #5 0% concluido
prato #2 0% concluido
prato #4 0% concluido
prato #3 0% concluido
prato #1 18% concluido
prato #5 18% concluido

... [atualizações continuam] ...

prato n° #5 finalizado e enviado para a entrega...
prato n° #3 finalizado e enviado para a entrega...
prato n° #2 finalizado e enviado para a entrega...
```

## ⚙️ Características da Simulação
- **Cozimento**: paralelo para todos os pratos
- **Entrega**: sequencial (um prato por vez)
- **Atualização**: percentual a cada 0.1 segundos

## 👨‍💻 Desenvolvido por
[GabrielGit10110](https://github.com/GabrielGit10110)
