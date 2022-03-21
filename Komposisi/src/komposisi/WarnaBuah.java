package komposisi;

import java.util.*;

public class WarnaBuah {
    private final List<Buah> Buahnya;
    
    public WarnaBuah(List<Buah> Buahnya) {
        this.Buahnya = Buahnya;
    }
    
    public List<Buah> getTotalBuah(){
        return Buahnya;
    }
}