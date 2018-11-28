package com.company;

public class faceDrawing {
    private String[][] faceFeat;

    public faceDrawing(String[][] faceFeat) {
        this.faceFeat = faceFeat;
    }

    public void fill(String str) {
        for (int x = 0; x < faceFeat.length; x++) {
            for (int y = 0; y < faceFeat[x].length; y++) {
                this.faceFeat[x][y] = str;
            }
        }
    }

    public void edit(String replace, int row, int col) {
        faceFeat[row][col] = replace;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < faceFeat.length; i++) {
            for (int z = 0; z < faceFeat[i].length; z++) {
                str = str + faceFeat[i][z];
            }
            str = str + "\n";
        }
        return str;
    }
}


