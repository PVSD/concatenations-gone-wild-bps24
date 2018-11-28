package com.company;

public class Main {

    public static void main(String[] args) {

        String t1 = cat(68, 108);
        System.out.println(t1);
        String t2 = cat(35, 59);
        System.out.println(t2);
    }

    private static String cat(int start, int end)
    {
        String c = "";
        StringBuffer a = new StringBuffer();
        for(int i=start;i<end;i++)
        {
            c+=(char)i;
            a.append((char)i);
        }
        return a.toString();
    }
}
