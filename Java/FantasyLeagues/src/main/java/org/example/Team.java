package org.example;

//2.  Create a generic class (Team) to implement a sports team (ie. basketball team, football team, etc)
//
//    > it should:
//
//        - take a Type Parameter (T) bound to the Player class
//        - implement the Comparable interface (Comparable<Team<T>>)
//        - have the following attributes and matching getters:
//             > name
//             > playedGames
//             > wonGames
//             > drawGames
//             > lostGames
//             > roster (list of all team players)
//         - have a method to add players
//             > if a player is already in the team it should print a string to the console (ie. "Michael Jordan Bulls already playing for the Chicago Bulls") and return false
//             > if a player is not in the team it should add it to the team and return true
//         - have a method (gameResult) that takes in an opponent Team<T>, a ourScore and theirScore
//             > if current team scored more points, print a message to the console ("Chicago Bulls won v. Celtics, score: 12 - 9"), and increment current Teams victory count as well as the opponent team defeat count
//             > if opponent team scored more points, print a message to the console ("Chicago Bulls lost v. Celtics, score: 9 - 12"), increment the victory counts accordingly
//             > if both teams scored same amount of points, print a message to the console ("Chicago Bulls draw v. Celtics, score: 12 - 12"), increment the draw counts accordingly
//         - have a method (ranking)
//             > returning the total ranking of the team based on all played games (a won game is worth 3 points, a draw game is worth 1 point, a lost game is worth 0 point)
//         - have a method (compareTeams) that takes in a Team<T>
//             > return -1 if current team is ranking better than other team
//             > return 1 if current team is ranking worse than other team
//             > return 1 if both team rank the same

public class Team {
}
