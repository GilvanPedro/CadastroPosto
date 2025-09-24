# 🚗 Sistema de Gerenciamento de Posto de Combustível

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=java&logoColor=white)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Bem-vindo ao Sistema de Gerenciamento de Posto de Combustível! Este é um projeto desenvolvido em Java que oferece uma solução completa para o gerenciamento de funcionários e estoque de combustíveis em um posto de gasolina.

## 📋 Visão Geral

O sistema foi desenvolvido para auxiliar no gerenciamento diário de um posto de combustível, permitindo o cadastro e acompanhamento de funcionários, além do controle de estoque de combustíveis. Com uma interface simples e intuitiva, o sistema facilita as operações rotineiras do negócio.

## ✨ Funcionalidades

### 👥 Módulo de Funcionários
- Cadastro de frentistas com informações pessoais
- Cálculo de salário base + comissão por vendas
- Listagem completa de funcionários cadastrados
- Acompanhamento de vendas realizadas

### ⛽ Módulo de Estoque
- Cadastro de diferentes tipos de combustíveis
- Controle de quantidade disponível
- Atualização de preços
- Visualização detalhada do estoque

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **IDE**: IntelliJ IDEA (recomendada)
- **Controle de Versão**: Git

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Java Development Kit (JDK) 17 ou superior
- Git (opcional, para clonar o repositório)

### Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/GilvanPedro/CadastroPosto.git
   cd CadastroPosto
   ```

2. Compile os arquivos Java:
   ```bash
   javac src/*.java -d out/production/CadastroPosto
   ```

3. Execute o programa:
   ```bash
   java -cp out/production/CadastroPosto Main
   ```

## 🖥️ Como Usar

1. **Menu Principal**
   - Escolha entre as opções de gerenciamento de funcionários ou estoque
   
2. **Gerenciamento de Funcionários**
   - Adicione novos frentistas
   - Visualize a lista de funcionários cadastrados
   - Acompanhe o desempenho das vendas

3. **Controle de Estoque**
   - Cadastre novos tipos de combustível
   - Atualize preços e quantidades
   - Consulte o estoque disponível

## 📝 Estrutura do Projeto

```
Tester-posto-combustivel/
├── src/
│   ├── Main.java          # Classe principal do sistema
│   ├── Funcionarios.java  # Lógica de gerenciamento de funcionários
│   └── Estoque.java       # Lógica de gerenciamento de estoque
├── out/                   # Arquivos compilados
└── documents/
    └── README.md          # Este arquivo
```

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

1. Faça um Fork do projeto
2. Crie uma Branch para sua Feature (`git checkout -b feature/NovaFeature`)
3. Adicione suas mudanças (`git add .`)
4. Comite suas mudanças (`git commit -m 'Adicionando nova feature'`)
5. Faça o Push da Branch (`git push origin feature/NovaFeature`)
6. Abra um Pull Request

## 📧 Contato

Gilvan Pedro - [@GilvanPedro](https://github.com/GilvanPedro) - gilvanpedro2006@gmail.com

Link do Projeto: [https://github.com/GilvanPedro/Tester-posto-combustivel](https://github.com/GilvanPedro/CadastroPosto)
