import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Duration;

class simulation {

    ArrayList<human> ListOfPeople;
    LocalDateTime dateTime;
    int TICK_TIME = 1;
    public simulation(){
        dateTime = LocalDateTime.now();
        ListOfPeople = new ArrayList<human>();
    }

    public void addToList(human input){
        ListOfPeople.add(input);
    }

    public void kill(String name){
        int lengthOfArray = ListOfPeople.size();
        for (int i = 0; i < lengthOfArray; i ++){
            if(ListOfPeople.get(i).equals(name));
                ListOfPeople.remove(i);
        }
    }

    public void age(){
        int lengthOfArray = ListOfPeople.size();
        for (int i = 0; i < lengthOfArray; i ++){
            double age = ListOfPeople.get(i).getAge();
            ListOfPeople.get(i).setAge(age + 1);
            if(age >= 18 && ListOfPeople.get(i) instanceof child){
                System.out.println("\n" + ListOfPeople.get(i).getName() + " is now a parent");
                parentify(ListOfPeople.get(i));
            }
        }
    }

    public void parentify(human guy){
        parent newParent = new parent(guy.getAge(), guy.getHight(), guy.getGender(), guy.getHairColor(), guy.getEyeColor(), false, 1, guy.getName());
        int lengthOfArray = ListOfPeople.size();
        for (int i = 0; i < lengthOfArray; i ++){
            if(ListOfPeople.get(i).getName().equals(guy.name)) {
                ListOfPeople.set(i, newParent);
            }
        }
    }

    public String updateAll(){
        int size = ListOfPeople.size();
        String allText = " ";
        for(int i = 0; i < size; i++){
            allText = allText + "\n" + update(ListOfPeople.get(i));
        }
        return allText;
    }

    public String update(human guy){
        String text = guy.getName() + " is now " + guy.getAge() + " years old";
        return text;
    }
    public void runSim(){
        dateTime = LocalDateTime.now();
        while(true){
            Duration gap  = Duration.between(dateTime, LocalDateTime.now());
            if(gap.toSeconds() >= TICK_TIME){
                age();
                System.out.println(updateAll());
                dateTime = LocalDateTime.now();

            }
        }
    }
}


