
# 1 Decorator
If we want to add more features to already existing classes of blocks, we can wrap them in a decorator. In that custom decorator, we will define a new, desired, behaviour and store it as a block.

# 2 Strategy
The bot has several abilities and stats(speed, damage,....) Each of them is one strategy. As the game progresses, the bot changes its abilities- Changes the strategies of his behaviour. But at any point in time we can engage the bot; and based on his strategies, his speed, strength and other actions will be evaluated  


# 3 Command
Each of the UI parts could use a given Command, the commands executes wished actions, and also the command does not store or know anything about the UI. Since the command is disconnected from a particulart UI, many different UI parts can invoke the same command.

# Iterator - Strategy + Iterator
We can pass a Strategy as the filter, the Itertor will iterate all the files and on each file it will use the Strategy to determine whether to filter the file . The reason we may want to use the Iterator is, it can interate through the files more effectively.