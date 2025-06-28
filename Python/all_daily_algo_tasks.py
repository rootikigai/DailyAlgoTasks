#Collect and print sum
def collect_and_print_sum(scores):
    add_scores = 0
    for score in scores:
	    add_scores += score;
    return add_scores

def collect_and_print_average(scores):
    add_scores = 0
    average = 0
    for score in scores:
	    add_scores += score;
    average = (add_scores // len(scores))
    return average


student_scores = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(collect_and_print_average(student_scores))


#scores = []
#addScores = 0
#for i in range(1, 11, 1):
#    score = int(input(f"Enter score {i}: "))
#    scores.append(score)
#    addScores = addScores + score
#print(f"Sum is: {addScores}")

