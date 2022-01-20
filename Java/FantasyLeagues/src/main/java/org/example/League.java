package org.example;

//1.  Create a generic class (League) to implement a league table for a sport. (ie. NBA for BasketBall, FIFA for Football, etc)
//
//    > It should:
//
//    -   take a Type Parameter (T) bound to the Team type
//    -   have a name attribute
//    -   have a constructor
//    -   have a method (addTeam) to add a Team to the League
//        > if a team is already in the League it should print a string to the console (ie. "Chicago Bulls already playing in NBA") and return false
//        > if a team is not in the league it should add it to the league and return true
//    -   have a method (showLeague) that prints all the team in the league in ascending order (from best ranking to worst ranking)
//    -   have getters for the League's name and for the League List

public class League<T> {
    T name;
    T teamName;

        public League(T name V teamName) {
            this.name = name;
        }

        public boolean addTeam(String Name) {

            if (team == league) {
                return System.out.println("%s already playing in %s \n", name leauge);
            } else
                Team team =  new Team(teamName) ;
                team.put(teamName ,team);
                return true;

        }


}
