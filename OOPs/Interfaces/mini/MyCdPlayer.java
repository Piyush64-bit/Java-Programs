package mini;

public Interface MyCdPlayer implements MyMedia {
    @Override
    public void start() {
        System.out.println("music starts");
    }
    @Override
    public void stop() {
        System.out.println("music stop");
    }

}
