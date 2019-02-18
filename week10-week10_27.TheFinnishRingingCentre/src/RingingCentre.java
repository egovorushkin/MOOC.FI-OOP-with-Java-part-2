import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place){
        if(this.observations.containsKey(bird)){
            this.observations.get(bird).add(place);
        }else {
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }
    }

    public void observations(Bird bird){
        int count;
        if(!this.observations.containsKey(bird)){
            count = 0;
        }else{
            count = this.observations.get(bird).size();
        }

        System.out.println(bird + " observations: " + count);
            if (this.observations.containsKey(bird)){
                System.out.println(this.observations.get(bird).toString().replace("[", "").
                        replace(", ", "\n").replace("]", ""));
            }
        }
    }

