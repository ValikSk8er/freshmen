package Utils;

import Enums.Gender;

public class InfoGenerator {
    private static final int minAge = 17;
    private static final int maxAge = 65;

    private static String[] firstNames = { "Morley", "Scott", "Kruger", "Lain",
            "Kennedy", "Gawron", "Han", "Hall", "Aydogdu", "Grace",
            "Spiers", "Perera", "Smith", "Connoly",
            "Sokolowski", "Chaow", "James", "June" };

    private static String[] lastNames = {"Smith", "Johnson", "Williams", "Jones",
            "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson",
            "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia",
            "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker"};

    private static String[] words = {"Aberdeen", "Abilene", "Akron", "Barnstable", "Baton", "Rouge",
            "Bethlehem", "Boise", "Boise", "Bonita", "Boston", "Bremerton", "Bridgeport", "Brighton",
            "Bryan", "Buffalo"};

    public static String getFirstName(){
        return firstNames[Randomiser.getNumberByBound(firstNames.length)];
    }

    public static String getLastName(){
        return lastNames[Randomiser.getNumberByBound(lastNames.length)];
    }

    public static String getWord(){
        return words[Randomiser.getNumberByBound(words.length)];
    }

    public static Gender getGenderState(){
        return Randomiser.getBoolean() ? Gender.MALE : Gender.FEMALE;
    }

    public static int getAge(){ return Randomiser.getNumberByRange(minAge, maxAge); }


}
