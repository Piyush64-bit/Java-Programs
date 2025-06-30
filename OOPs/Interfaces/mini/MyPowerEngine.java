package mini;

public Interface MyPowerEngine implements MyEngine {
    @Override
    void starts() {
        System.out.println("Power Engine Start");
    }
    @Override
    void stop() {
        System.out.println("Power Engine Stop");
    }
    @Override
    void acc() {
        System.out.println("Power engine acc.");
    }
}
