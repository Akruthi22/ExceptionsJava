package main;

import java.util.HashMap;
import java.util.Map;

public class MapContainer {

    private static Map<Integer, String> numberNameMap = new HashMap<Integer, String>();

    public void setNumberNameMap(Map<Integer, String> numberNameMap) {
        MapContainer.numberNameMap = numberNameMap;
    }

    public String addToMap(Integer number, String name) {
        return numberNameMap.put(number, name);
    }

    public int size() {
        return MapContainer.numberNameMap.size();
    }

    public void clear() {
        MapContainer.numberNameMap.clear();
    }
    
    public void destroy() {
        numberNameMap = null;
    }

    @Override
    public String toString() {
        return "MapContainer [numberNameMap=" + MapContainer.numberNameMap
                        + "]";
    }

}
