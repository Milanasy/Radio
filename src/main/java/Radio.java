public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newStation) {
        if (newStation > 9) {
            return;
        }

        if (newStation < 0) {
            return;
        }

        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

