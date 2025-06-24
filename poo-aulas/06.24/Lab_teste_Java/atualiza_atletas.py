import csv

CSV_FILE = 'atletas.csv'

def filtrar_atletas():
    with open(CSV_FILE, newline='', encoding='utf-8') as f:
        leitor = csv.reader(f)
        cabecalho = next(leitor)  # ['nome','altura_cm','peso_kg']
        for nome, alt_str, peso_str in leitor:
            altura = int(alt_str)
            peso   = float(peso_str)
            if altura > 170 and peso < 80:
                print(nome)

def adicionar_atleta(nome, altura, peso):
    with open(CSV_FILE, 'r', newline='', encoding='utf-8') as f:
        leitor = csv.reader(f)
        next(leitor, None)               # pula cabeçalho, se houver
        nomes_existentes = {linha[0]     # assume que o nome está na coluna 0
                            for linha in leitor}
        
        if nome in nomes_existentes:
            print('Nome já está no arquivo. Nenhuma linha foi adicionada.')
            return
    
        escritor = csv.writer(f)
        escritor.writerow([nome, altura, peso])

def mostrar_conteudo():
    print('\nArquivo atualizado:')
    with open(CSV_FILE, newline='', encoding='utf-8') as f:
        for linha in f:
            print(linha.strip())

if __name__ == '__main__':
    # 1) filtrar e mostrar atletas conforme condição
    print('Atletas com altura > 170cm e peso < 80kg:')
    filtrar_atletas()

    # 2) adiciona você como reforço
    meu_nome   = 'Brunno'
    minha_alt  = 180   # em cm
    meu_peso   = 72.0  # em kg
    adicionar_atleta(meu_nome, minha_alt, meu_peso)

    # 3) mostra o arquivo completo após a atualização
    mostrar_conteudo( )
