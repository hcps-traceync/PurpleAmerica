package map;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RegionBuilder {
    List<Region> regionList = new ArrayList<>();
    List<File> fileList = new ArrayList<>();
    int index = 0;

    public List<Region> regionBuilder(List<File> fileList) {
        for (File object : fileList) {
            try {
                regionList.add(new Region(object.getName()));
            } catch (Exception e) {

            }
        }
        return regionList;
    }
}
