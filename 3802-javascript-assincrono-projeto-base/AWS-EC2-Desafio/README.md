# AWS-EC2-Desafio

<img width="344" height="180" alt="image" src="https://github.com/user-attachments/assets/fdcb387c-70cf-4560-b7a3-2473f7f0e79d" />




Documentação e práticas do laboratório de AWS da DIO, incluindo criação e gerenciamento de instâncias EC2, configuração de IAM, armazenamento em EBS/S3 e diagrama de arquitetura

##

# 🚀 Desafio de Gerenciamento de Instâncias EC2 na AWS  

Este repositório foi criado para documentar os conceitos, práticas e insights adquiridos durante o laboratório de **AWS na DIO**.  
O objetivo é consolidar os aprendizados e servir como material de apoio para estudos futuros.  

---

## 📚 Conteúdos Estudados  

### 1. História da AWS e Infraestrutura Global 🌍  
- A AWS nasceu em 2006, oferecendo serviços de **computação em nuvem** de forma escalável e sob demanda.  
- Infraestrutura distribuída em **Regiões** e **Zonas de Disponibilidade (AZs)**.  
- Garantia de **baixa latência ⚡, redundância 🔁 e alta disponibilidade 🔒**.  

### 2. Modelo de Negócio da AWS 💰  
- **Pay-as-you-go**: paga apenas pelo que usar.  
- **Escalabilidade elástica**: cresce ou diminui conforme a demanda.  
- Modelos de precificação: **sob demanda ⏳, instâncias reservadas 📅 e spot 🎯**.  

### 3. Regiões e Zonas de Disponibilidade 🗺️  
- **Região**: conjunto de data centers em uma localização geográfica (ex.: `us-east-1`).  
- **Zona de Disponibilidade (AZ)**: cada região possui múltiplas AZs, garantindo redundância.  

### 4. Serviços Gerenciados ⚙️  
- AWS cuida da infraestrutura, patches e alta disponibilidade.  
- Exemplos: **RDS 🛢️ (banco de dados), S3 📦 (armazenamento), Elastic Beanstalk 🌱 (deploy de apps)**.  

### 5. Criação e Configuração da Conta AWS 📝  
- Cadastro e ativação da conta.  
- Configuração de **MFA 🔑** para segurança.  
- Organização de **usuários 👤 e grupos 👥 no IAM** com permissões bem definidas.  

### 6. Instância EC2 e Otimização de Recursos 🖥️  
- **EC2** = máquinas virtuais na AWS.  
- Diferentes famílias de instância: compute ⚡, memory 🧠, storage 💾 optimized.  
- **Otimização**: Auto Scaling 📈, Elastic Load Balancer ⚖️, tipos de instância adequados.  

### 7. Armazenamento em Nuvem ☁️  
- **EBS (Elastic Block Store)**: discos persistentes ligados a EC2.  
- **S3 (Simple Storage Service)**: armazenamento de objetos 📂, barato 💸 e altamente escalável 🚀.  

### 8. IAM: Grupos e Usuários Criados 👥  
Grupos configurados no laboratório:  
- `GPO-AWS-DataBase` 🛢️  
- `GPO-AWS-Developer` 👨‍💻  
- `GPO-AWS-Linux` 🐧  
- `GPO-AWS-Network` 🌐  
- `GPO-AWS-SuperUsers` 🦸  
- `GPOAdministradorAccess` 🛡️  

👉 Usuários adicionados **via script/CLI 💻**, otimizando administração.  

## Veja aqui a criação do script ✨

👉 [Clique aqui para acessar o arquivo de criação do script (`setup.sh`)](./setup.sh)  


---

## 🛠️ Atividades Práticas  

1. Criação e configuração da conta AWS 📝  
2. Organização de usuários e grupos no IAM 👥  
3. Implementação de instâncias EC2 🖥️  
4. Configuração de volumes EBS 💾 e buckets S3 📦  
5. Testes de políticas de acesso e permissões 🔒  
6. Documentação de todo o processo neste repositório 📑  
7. Criação de um **diagrama de arquitetura no Draw.io** 🗂️ para representar a solução.  

---

## 🖼️ Diagrama da Arquitetura  

Durante o laboratório, foi criado este diagrama no **Draw.io** para visualizar a interação entre serviços da AWS:  

<img width="991" height="572" alt="desafio drawio" src="https://github.com/user-attachments/assets/73806212-f3b3-4291-8ad4-5c5a08b61195" />
 

---

## 🔎 Explicação do Diagrama  

1. **Actor (Usuário final 👤)**: envia arquivos para a AWS.  
2. **EC2 🖥️ (Instância de Computação)**: processa e gerencia as operações, conectado a EBS e RDS.  
3. **EBS 💾**:  
   - **D-EBS**: volume principal.  
   - **E-EBS**: volume adicional ou backup.  
4. **RDS 🛢️**: banco de dados gerenciado, conectado à EC2.  
5. **Fluxos 🔀**: caminhos de comunicação: Usuário → EC2 → EBS, EC2 → RDS, EC2 ↔ EBS.  

---


## 💭 Reflexões Pessoais  

👉 [Clique aqui para acessar o arquivo de reflexões (`notas.md`)](./notas.md)  

---

## 📌 Conclusão  

Esse desafio permitiu:  
- Consolidar o aprendizado sobre a **infraestrutura global da AWS 🌍**.  
- Entender a importância do **IAM 🔐**.  
- Praticar a **criação e gerenciamento de EC2 🖥️**.  
- Utilizar serviços de **armazenamento em nuvem ☁️ (EBS e S3)**.  
- Visualizar a arquitetura em nuvem com um **diagrama Draw.io 🗂️**.  
- Registrar e compartilhar conhecimento no **GitHub 🐙**.

##


---

✨ **Autora :** Patricia Oliveira    
📌 Desafio do Bootcamp **Santander Coders Girls - DIO**  

<a href="https://www.linkedin.com/in/savarezi"><img src="https://img.shields.io/badge/-LinkedIn-67cb57?style=for-the-badge&logo=linkedin&logoColor=fff"></a>





