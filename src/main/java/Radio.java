public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        maxStation = 9;
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount -1;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }

        if (newStation < minStation) {
            return;
        }

        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
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
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

