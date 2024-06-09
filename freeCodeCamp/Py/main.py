import random as rand
def get_choices():
    player_choice = input('Enter a choice? (rock, paper, scissors): ')
    options = ['rock','paper','scissors']
    computer_choice = rand.choice(options)
    choices = {'player': player_choice, 'computer': computer_choice}
    return choices

def check_win(data):
    player = data['player']
    computer = data['computer']
    print(f'Your chose {player}, computer chose {computer}')
    if player == computer:
        return 'It\'s a tie!'
    elif player == 'rock' and computer == 'paper':
        return 'Paper wrap rock! You lose!'
    elif player == 'rock' and  computer == 'scissors':
        return 'Rock smashes scissors! You win!'
    elif player == 'paper' and computer == 'rock':
        return 'Paper wrap rock! You win!'
    elif player == 'paper' and computer == 'scissors':
        return 'Scissors cuts paper! You lose!'
    elif player == 'scissors' and computer == 'rock':
        return 'Rock smashes scissors! You lose'
    elif player == 'scissors' and computer == 'paper':
        return 'Scissors cuts paper! You win!'

#result = check_win(get_choices())
#print(result)

'''class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def run(self):
        print('running...')
    
class Dog(Animal):
    def __init__(self, name, age):
        super().__init__(name, age)

    def bark(self):
        print(self.age)
        print(self.name)
        print('woof')
roger = Dog('roger',1)
roger.bark()
print(roger.name)
roger.run()'''

result = lambda a, b: a + b
print(result(3,4))

result = map(lambda a: a * 2,[1,2,3,4,])
print(list(result))

result = filter(lambda a: a % 2 == 0,[1,2,3,4,])
print(list(result))