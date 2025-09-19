#!/bin/bash
# Script de exemplo para criação de grupos, usuários e instância EC2 na AWS

# Criar grupos
aws iam create-group --group-name GPO-AWS-Developer
aws iam create-group --group-name GPO-AWS-DataBase

# Criar usuário
aws iam create-user --user-name PatyUser

# Adicionar usuário ao grupo
aws iam add-user-to-group --user-name PatyUser --group-name GPO-AWS-Developer

# Criar chave de acesso (Access Key) para o usuário
aws iam create-access-key --user-name PatyUser

# Criar instância EC2 (Amazon Linux 2, t2.micro)
aws ec2 run-instances \
    --image-id ami-0c02fb55956c7d316 \
    --count 1 \
    --instance-type t2.micro \
    --key-name MinhaChaveAWS \
    --security-groups default
