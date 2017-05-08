package com.netease.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description:
 * Created by BoXuelin
 * Date:2017/5/8.
 */
public class Euro {
    private static int num = 0;
    private static List<String> gameList = new ArrayList<String>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();


        for (int i = 0; i < 10000; i++) {
            list = new ArrayList<String>();
            list.add("巴萨");
            list.add("皇马");
            list.add("拜仁");
            list.add("莱斯特城");
            list.add("马竞");
            list.add("尤文");
            list.add("摩纳哥");
            list.add("多特");
            outPutTeam(list);
            System.out.println("-----------------------------------------");
        }
        list.clear();
        list.add("巴萨");
        list.add("皇马");
        list.add("拜仁");
        list.add("莱斯特城");
        list.add("马竞");
        list.add("尤文");
        list.add("摩纳哥");
        list.add("多特");
        outPutTeamGame(list, "皇马");
    }

    public static StringBuffer stringBuffer = new StringBuffer();

    public static void outPutTeam(List<String> list) {
        num++;
        Random rad = new Random();
        int index = rad.nextInt(list.size());
        if (num % 2 == 1) {
            stringBuffer = new StringBuffer();
            stringBuffer.append(list.get(index) + "VS");
            System.out.print(list.get(index) + "VS");
        } else {
            stringBuffer.append(list.get(index));
            System.out.println(list.get(index));
            gameList.add(stringBuffer.toString());
        }

        list.remove(index);
        if (list.size() > 0) {
            outPutTeam(list);
        }
    }

    public static void outPutTeamGame(List<String> list, String name) {
        String team1 = name;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i))) {
                list.remove(i);
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;

        for (String string : gameList) {
            if ((team1 + "VS" + list.get(0)).equals(string) || (list.get(0) + "VS" + team1).equals(string)) {
                i++;
            } else if ((team1 + "VS" + list.get(1)).equals(string) || (list.get(1) + "VS" + team1).equals(string)) {
                j++;
            } else if ((team1 + "VS" + list.get(2)).equals(string) || (list.get(2) + "VS" + team1).equals(string)) {
                k++;
            } else if ((team1 + "VS" + list.get(3)).equals(string) || (list.get(3) + "VS" + team1).equals(string)) {
                l++;
            } else if ((team1 + "VS" + list.get(4)).equals(string) || (list.get(4) + "VS" + team1).equals(string)) {
                m++;
            } else if ((team1 + "VS" + list.get(5)).equals(string) || (list.get(5) + "VS" + team1).equals(string)) {
                n++;
            } else if ((team1 + "VS" + list.get(6)).equals(string) || (list.get(6) + "VS" + team1).equals(string)) {
                o++;
            }
        }
        System.out.println(team1 + "VS" + list.get(0) + i + "次");
        System.out.println(team1 + "VS" + list.get(1) + j + "次");
        System.out.println(team1 + "VS" + list.get(2) + k + "次");
        System.out.println(team1 + "VS" + list.get(3) + l + "次");
        System.out.println(team1 + "VS" + list.get(4) + m + "次");
        System.out.println(team1 + "VS" + list.get(5) + n + "次");
        System.out.println(team1 + "VS" + list.get(6) + o + "次");
    }
}
