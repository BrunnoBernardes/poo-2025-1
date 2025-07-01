import os
import csv

def main():
    current_dir = os.getcwd()
    print(f"Diretório onde deve estar atheta1.CSV: {current_dir}")

    file_path = os.path.join(current_dir, 'atletas1.CSV')
    records = []

    try:
        with open(file_path, newline='', encoding='utf-8') as f:
            reader = csv.reader(f)
            for row in reader:
                records.append(row)
    except FileNotFoundError:
        print(f"Não foi possível encontrar o arquivo")
        return
    except Exception as e:
        print(f"Erro ao ler o arquivo: {e}")
        return

    print("\nConteúdo sem modificações do atletas1.CSV:")
    for row in records:
        print(','.join(row))

    nome = 'Brunno'
    idade = '22'
    altura = '1.80'
    peso = '75'
    sexo = 'M'

    exists = any(
        len(row) >= 2 and row[0].strip().lower() == nome.lower()
        for row in records
    )
    if exists:
        print(f"\nO nome \"{nome}\" já existe no arquivo.")
    else:
        try:
            with open(file_path, 'a', newline='', encoding='utf-8') as f:
                writer = csv.writer(f)
                writer.writerow([nome, idade, altura, peso, sexo])
            print(f"\nRegistro \"{nome}, {idade}, {altura}, {peso}, {sexo}\" inserido com sucesso.")
        except Exception as e:
            print(f"Erro ao escrever no arquivo: {e}")

    print("\nConteúdo atualizado de atletas1.CSV:")
    try:
        with open(file_path, newline='', encoding='utf-8') as f:
            reader = csv.reader(f)
            for row in reader:
                print(','.join(row))
    except Exception as e:
        print(f"Erro ao ler o arquivo atualizado: {e}")

if __name__ == "__main__":
    main()
