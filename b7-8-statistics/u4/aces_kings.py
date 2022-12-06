from random import randint

trials = 1000000
wins = 0
for _ in range(trials):
  cards = ["A"]*2 + ["K"]*3
  first_card = cards.pop(randint(0, len(cards)-1))
  second_card = cards.pop(randint(0, len(cards)-1))
  if first_card == second_card:
    wins += 1

print(f"The probability of winning this game is {wins/trials} for {trials} games")