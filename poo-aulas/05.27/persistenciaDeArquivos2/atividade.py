
# # ------------------------------------------------------------------------ # Imprimir o diretório
#
# import os
#
# print("Diretório atual:", os.getcwd()) # Linha para imprimir o diretório
#
# # ------------------------------------------------------------------------ # Abre o arquivo para leitura e imprime erro
#
# def ler_arquivo(caminho):
#     try:
#        with open(caminho, 'r', encoding='utf-8') as arquivo: # Abre o arquivo para leitura
#            return arquivo.readlines()
#    except Exception as e:
#        print("Erro ao ler o arquivo:", e) # Imprime o erro caso ocorra
#        return []
#
# # ------------------------------------------------------------------------ # Função para ler um arquivo e retornar suas linhas
#
# linhas = ler_arquivo("teste.CSV")
# for linha in linhas:
#     print(linha.strip()) # Imprime todas linhas do arquivo
#
# # ------------------------------------------------------------------------ # Função para adicionar uma linha se não existir
#
# def adicionar_se_nao_existe(caminho, matricula, nome):
#     linhas = ler_arquivo(caminho)
#     existe = any(matricula in linha or nome in linha for linha in linhas)
#
#     if not existe:
#         with open(caminho, 'a', encoding='utf-8') as arquivo:
#             arquivo.write(f"{matricula};{nome}\n")
#             print("Linha adicionada ao arquivo.")
#     else:
#         print("Matrícula ou nome já existem no arquivo.")
# 
# # ------------------------------------------------------------------------ # Função para imprimir todas as linhas do arquivo
#
# def imprimir_todas_linhas(caminho):
#     linhas = ler_arquivo(caminho)
#     print("\nConteúdo final do arquivo:")
#     for linha in linhas:
#          print(linha.strip())
#
# # ------------------------------------------------------------------------ # 

import os

class Aluno:
    def __init__(self, matricula, nome):
        self.matricula = matricula
        self.nome = nome

    def diretorio_atual(self):
        print("Diretório atual:", os.getcwd(), "\n")

    def ler_arquivo(self, caminho):
        try:
            with open(caminho, 'r', encoding='utf-8') as arquivo:
                return arquivo.readlines()
        except Exception as e:
            print("Erro ao ler o arquivo:", e, "\n")
            return []

    def imprimir_linhas(self, caminho):
        linhas = self.ler_arquivo(caminho)
        for linha in linhas:
            linha_formatada = linha.strip().replace(',', ' ')
            print(linha_formatada) # Imprime linhas sem virgula

    def adicionar_se_nao_existe(self, caminho):
        linhas = self.ler_arquivo(caminho)
        existe = any(self.matricula in linha or self.nome in linha for linha in linhas)

        if not existe:
            with open(caminho, 'a', encoding='utf-8') as arquivo:
                arquivo.write(f"{self.matricula},{self.nome}\n")
                print("Linha adicionada ao arquivo.")
        else:
            print("Matrícula ou nome já existem no arquivo.")

    def imprimir_final(self, caminho):
        linhas = self.ler_arquivo(caminho)
        print("\nConteúdo final do arquivo:")
        for linha in linhas:
            linha_formatada = linha.strip().replace(',', ' ')
            print(linha_formatada) # Imprime linhas sem virgula


# === Execução ===
aluno = Aluno("202405846", "Brunno Bernardes")
arquivo_csv = "teste.CSV"

aluno.diretorio_atual() # Imprime o diretório atual
aluno.imprimir_linhas(arquivo_csv) # Imprime as linhas do arquivo
aluno.adicionar_se_nao_existe(arquivo_csv) # Adiciona a linha com matrícula se não existir
aluno.imprimir_final(arquivo_csv) # Imprime o conteúdo final do arquivo
# === Fim da execução ===