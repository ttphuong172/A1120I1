package furamaresort.models;

import java.util.ArrayList;
import java.util.List;

public class FEManager {
    List<Services> servicesList=new ArrayList<>();

    public void addNewServices(Services services){
        servicesList.add(services);;
    }
}
