from random import randint
trials = 1000000

p1lc = 0 # times player 1 lost
p2lc = 0 
for _ in range(trials):
  # setting up a random carton
  carton = [0]*12
  while carton.count(1) < 4:
    c = randint(0, 11)
    carton[c] = 1 if carton[c] != 1 else 0
  
  p1s = 0 # player 1 score
  p2s = 0 
  while p1s < 2 and p2s < 2:
    # player 1 choosing
    p1c = randint(0, len(carton)-1)
    p1s += 1 if carton[p1c] == 1 else 0
    carton.pop(p1c)
    
    p2c = randint(0, len(carton)-1)
    p2s += 1 if carton[p2c] == 1 else 0
    carton.pop(p2c)

  if p1s == 2:
    p1lc += 1
  else:
    p2lc += 1
  
print(f"Player 1 lost {p1lc/trials} of the times while player 2 lost {p2lc/trials} of {trials} games.")