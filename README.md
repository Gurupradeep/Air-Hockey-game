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


