public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount -1;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
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
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;
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

