from random import randint
games = 1000000

player1_losses = 0
player2_losses = 0 
for _ in range(games):
  carton = ["boiled"]*12
  while carton.count("raw") < 4:
    i = randint(0, 11)
    if carton[i] == "boiled":
      carton[i] = "raw"

  player1_raw_eggs = 0
  player2_raw_eggs = 0
  while player1_raw_eggs < 2 and player2_raw_eggs < 2:
    player1_choice = randint(0, len(carton)-1)
    if carton[player1_choice] == "raw":
      player1_raw_eggs += 1
    carton.pop(player1_choice)
    
    player2_choice = randint(0, len(carton)-1)
    if carton[player2_choice] == "raw":
      player2_raw_eggs += 1
    carton.pop(player2_choice)

  if player1_raw_eggs == 2:
    player1_losses += 1
  else:
    player2_losses += 1
  
print(f"Player 1 lost {player1_losses/games*100}% of the times while player 2 lost {player2_losses/games*100}% of {games} games.")