scores = []
addScores = 0
for i in range(1, 11, 1):
    score = int(input(f"Enter score {i}: "))
    scores.append(score)
    addScores = addScores + score
print(f"Sum is: {addScores}")

