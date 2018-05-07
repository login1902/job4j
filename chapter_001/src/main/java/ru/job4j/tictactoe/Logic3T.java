package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table.length; j++){
                if(   )

            }
        }

        return false;
    }

    public boolean isWinnerO() {
        return false;
    }

    public boolean hasGap() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (j = null) {
                    return true;
                }
            }
        }
        return false;
    }
