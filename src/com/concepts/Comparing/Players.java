package com.concepts.Comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player implements Comparable<Player>
{
    private String name;
    private int ranking;
    private int age;

    public Player(String name, int ranking,int age) {
        this.name = name;
        this.ranking = ranking;
        this.age=age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Player player) {
        return Integer.compare(this.getRanking(),player.getRanking());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                ", age=" + age +
                '}';
    }
}
class PlayerAgeComparator implements Comparator<Player>
{

    @Override
    public int compare(Player player, Player t1) {
        return Integer.compare(player.getAge(),t1.getAge());
    }
}
class PlayerRankComparator implements Comparator<Player>
{

    @Override
    public int compare(Player player, Player t1) {
        return Integer.compare(player.getRanking(),t1.getRanking());
    }
}
public class Players {

    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Player("Nishu",1,12));
        players.add(new Player("golu",3,11));
        players.add(new Player("Kishor",2,14));

        //Compare players based on ranking--Two Player are of same type can be compare using Comparable Interface.

        Collections.sort(players);
        players.forEach(System.out::println);

        //But what if we want to compare based on different criteria
        Collections.sort(players,new PlayerAgeComparator());
        players.forEach(System.out::println);
    }
}
