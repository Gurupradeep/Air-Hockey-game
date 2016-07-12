# Air-Hockey-game

#ABOUT THE PROJECT

This project is the demonstration of a simple multiplayer air hockey game. It involves two

players, each with a computer with the game running in it. Both the players need to be

connected to the same network (preferably wired connection to minimize latency issues). After

establishing a communicating port between the players the game then begins. The rules of the

game are quite straight forward. Each player has a mallet (a circular disk) and there are two

pucks which are common to both of them. There is a rectangular arena where the game is

played. The players are placed on either side of the arena which is separated by a center line.

Player can control the movement of mallet in his side using his mouse. One player cannot take

his mallet to the other side.

The objective of each player is to keep the pucks in the opponent side as long as possible in a

given span of time. The players are allowed to maneuver the puck using their respective

mallets. While doing so, players should refrain from crossing the half line. The scores of both

players are initialized to zero. As and when pucks moves to the opponent side the player score

will keep incrementing. When the time runs out, the player with the higher score is proclaimed

the winner, or if the scores are level, the match ends as a draw.


#JAVA FEATURES AND CONCEPTS USED

#JAVA SOCKET PROGRAMMING

Sockets provide the communication mechanism between two computers using TCP. TCP is a

two way communication protocol, so data can be sent across both streams at the same time. A

client program creates a socket on its end of the communication and attempts to connect that

socket to a server. When the connection is made, the server creates a socket object on its end of

the communication. The client and server can now communicate by writing to and reading from

the socket.

In this project we have six pairs of client-server threads. They are:

 Two for two mallets

 Two for two pucks

 One for Player name

 Two for players scores

We use the information which we get using user and server threads for the movements of pucks and mallets and changing scores.

#DYN4J Library

DYN4J is a physics engine which we used for collision detection and simulating the perfect collision between the objects


#JAVA SWING

We used swing for developing the UI part.

#CONCLUSION

Our game is modified version of normal Air Hockey game. Here instead of scoring goals we

need to keep the pucks in the opponent’s half for longer duration of time. As it is a multiplayer

game it mainly focuses on sending and receiving data which we done without much of delay

using socket programming and simulate the perfect elastic collisions we used DYN4J a physics

library to give the user better experience of the game.

Since the project involves a considerable amount of communication, it is expected to perform

better under conditions of low network latency. When the latency is high there may be a lot of

time lag between initiation of an action and its execution. Also wired connection is preferred

over the wireless mode in which case there may seem to be a lack of coordination between the

different activities.

It is a wonderful game which provides a thrilling experience to the players and care has been

taken to make the user interface beautiful. As always improvements can be made to make it

better that may be in terms of reducing the latency or making the movement of the pucks and the

mallet as smooth as possible.

#REFERENCES

 Java: The Complete Reference, Ninth Edition

 http://www.tutorialspoint.com/java/java_applet_basics.htm

 http://www.edinformatics.com/il/il_physics.htm

 http://www.dyn4j.org/tag/collisiondetection/

