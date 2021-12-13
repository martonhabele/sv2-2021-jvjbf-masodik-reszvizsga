package city;

import java.util.ArrayList;
import java.util.List;

public class Office extends Building {
    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int levels, Address address) {
        super(area, levels, address);
        this.company = company;
        if (getArea() / numberOfTablesPerLevel > 2 || getArea() / numberOfTablesPerLevel < 5) {
            this.numberOfTablesPerLevel = numberOfTablesPerLevel;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return numberOfTablesPerLevel - 1;
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }
}