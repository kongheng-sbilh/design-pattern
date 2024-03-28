package com.kh.singleton.static_block_initialization;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
