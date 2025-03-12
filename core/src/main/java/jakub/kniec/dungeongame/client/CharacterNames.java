package jakub.kniec.dungeongame.client;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterNames {
    Random random = new Random();
    public static final List<String> names = Arrays.asList(
        "Alastor", "Vorath", "Drakeon", "Morgrim", "Vexar", "Lucard", "Sylthar", "Zaros", "Thalion", "Kainar",
        "Malgris", "Varthas", "Sorrek", "Grimhold", "Noctus", "Drevan", "Ravok", "Vorgrim", "Zedric", "Eldrak",
        "Vaelthor", "Draquon", "Zareth", "Morvain", "Kaelor", "Xerathis", "Veldrin", "Tavoris", "Malrik", "Zorveth",
        "Drevak", "Nyxar", "Rathor", "Vorlen", "Sylarion", "Veydris", "Thalric", "Korran", "Zerathis", "Vaedran",
        "Draethor", "Vaelric", "Xandor", "Zorathis", "Maldrak", "Korveth", "Veylor", "Nyxian", "Thalvorn", "Syveris",
        "Kaelthor", "Voric", "Zevrath", "Drevorn", "Morzath", "Valthor", "Ravir", "Zedron", "Sorvath", "Grimdar",
        "Vorgath", "Dravik", "Zythor", "Malrikar", "Kaelvorn", "Xerion", "Thrandor", "Vaelgor", "Zanthis", "Morvex",
        "Sycras", "Targan", "Velgrin", "Zarkon", "Draelius", "Ravnor", "Vexaris", "Gorvath", "Nyzoth", "Zephiron"
    );


    public String getRandomNames() {
        return names.get(random.nextInt(0, names.size()));
    }


}
