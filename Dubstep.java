package com;

public class Dubstep {
    public static String SongDecoder (String song) {
        String original = song.replaceAll("WUB", " ");
        original = original.trim().replaceAll(" +", " ");
        return original;
    }
}