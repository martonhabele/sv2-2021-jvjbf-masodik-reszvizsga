package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private long area;
    private List<Building> city = new ArrayList<>();

    public City(String name, long area) {
        this.name = name;
        this.area = area;
    }

    public void addBuilding(Building building) {
        if (building.getArea() > area) {
            throw new IllegalArgumentException();
        }
        city.add(building);
        area -= building.getArea();
    }

    public Building findHighestBuilding() {
        int index = 0;
        int maxHeight = 0;
        for (int i = 0; i < city.size(); i++) {
            if (maxHeight < city.get(0).getLevels()) {
                maxHeight = city.get(0).getLevels();
                index = city.indexOf(i);
            }
        }
        return city.get(index);
    }

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return city;
    }

    public List<Building> getCity() {
        return city;
    }

    public long getFullArea() {
        return area;
    }
}