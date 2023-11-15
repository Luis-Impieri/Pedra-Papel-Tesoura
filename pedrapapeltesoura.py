import random

jogo = ["pedra", "papel", "tesoura"]

jogador = input("Escolha sua jogada: pedra, papel ou tesoura ") .lower()
computador = random.choice(jogo)

if jogador not in ("pedra", "papel", "tesoura"):
    print("Escolha uma opcao valida")
elif jogador == computador:
    print("empate!")
elif jogador == "pedra":
    if computador == "tesoura":
        print("Computador jogou: ", computador)
        print("Vooce venceu!")
    if computador == "papel":
        print("Computador jogou: ", computador)
        print("Voce perdeu!")
elif jogador == "papel":
    if computador == "pedra":
        print("Computador jogou: ", computador)
        print("Vooce venceu!")
    if computador == "tesoura":
        print("Computador jogou: ", computador)
        print("Voce perdeu!")
elif jogador == "tesoura":
    if computador == "papel":
        print("Computador jogou: ", computador)
        print("Vooce venceu!")
    if computador == "pedra":
        print("Computador jogou: ", computador)
        print("Voce perdeu!")