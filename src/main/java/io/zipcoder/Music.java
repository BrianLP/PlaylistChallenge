package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int trackMovesDown = 0;
        int trackMovesUp = 0;
        for (int i = startIndex; i <= playList.length-1; i++){
            System.out.println(playList[i]);
            if (playList[i].equals(selection)) {
                break;
            }

            if (i + 1 > playList.length-1) {
                i = -1;
            }
            trackMovesDown+=1;

        }
        for (int i = startIndex; i >= 0; i--){
            System.out.println(playList[i]);
            if (playList[i].equals(selection)) {
                break;
            }

            if (i - 1 < 0) {
                i = playList.length;
            }
            trackMovesUp+=1;

        }

        if (trackMovesDown>trackMovesUp) {
            return trackMovesUp;
        }else{
            return trackMovesDown;
        }
    }
}

