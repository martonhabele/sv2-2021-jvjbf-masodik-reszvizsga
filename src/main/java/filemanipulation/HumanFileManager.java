package filemanipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {
    private List<Human> humans = new ArrayList<>();

    public void readHumansFromFile(Path path) {
        try {
            List<String> people = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!");
        }
    }

    public void selectMales(List<String> persons) {
        for (String scopedPerson : persons) {
            String[] temp = scopedPerson.split(";");
            if (temp[1].startsWith("1") || temp[1].startsWith("3")) {
                humans.add(new Human(temp[0], temp[1]));
            }
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> malesToPrint = new ArrayList<>();
        for (Human scopedHuman : humans) {
            malesToPrint.add(scopedHuman.getName());
            malesToPrint.add(scopedHuman.getIdentityNumber());
        }
        try {
            Files.write(path, malesToPrint);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file!");
        }
    }

    public List<Human> getHumans() {
        return humans;
    }
}