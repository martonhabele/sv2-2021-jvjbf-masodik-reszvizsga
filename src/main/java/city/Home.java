package city;

public class Home extends Building {
    private final static int REQUIRED_SPACE = 20;

    public Home(int area, int levels, Address address) {
        super(area, levels, address);
    }

    public Home(int area, Address address) {
        super(area, address);
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        int result = getFullArea() / 20;
        return result;
    }
}