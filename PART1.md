
# 1 Factory Method
We could create a factory class that could be easily extended, and a custom Factory Class could create a new Block based on preferences. Since we do not yet know all the types of blocks that could be created, we can just assume that the Factory will provide a valid Block, if somebody wishes to create a different type of block, he can easily create a new Factory class. Then the blocks from the new Factory can be easily stored (in the model), since they implement the same block interface.

# 2 Strategy / Decorator
The bot has several abilities and stats(speed, damage,....) Each of them is one strategy. As the game progresses, the bot changes its abilities- Changes the strategies of his behaviour. But at any point in time we can engage the bot; and based on his strategies, his speed, strength and other actions will be evaluated.

Another approach is to use Decorators. Each time he the bot obtains a new ability/etc.. we wrap him in the corresponding decorator. The downside of this approach is that, if the bot changes/ collects a new/etc..  an ability 100 times, then he needs to be wrapped each time; When for example .attack() call happens, it will invoke 100 function calls, which is very inefficient. 


# 3 Observer
Observer can observe the key presses in the keypad. When a key is pressed, observer is notified and prints an output on Screen (different part of the UI)
 
# Iterator - Strategy + Iterator
We can pass a Strategy as the filter, the Itertor will iterate all the files and on each file it will use the Strategy to determine whether to filter the file . The reason we may want to use the Iterator is, it can interate through the files more effectively.