import threading
import time
import queue

def producer(q, count):
    for i in range(count):
        print(f"Produzindo item {i}")
        q.put(i)
        time.sleep(0.5)
    q.put(None)

def consumer(q):
    while True:
        item = q.get()
        if item is None:
            break
        print(f"Consumindo item {item}")
        time.sleep(1)

def main():
    q = queue.Queue()
    prod = threading.Thread(target=producer, args=(q, 5), name='Produtor')
    cons = threading.Thread(target=consumer, args=(q,), name='Consumidor')
    prod.start()
    cons.start()
    prod.join()
    cons.join()
    print("Todos os itens foram processados.")

if __name__ == "__main__":
    main()
