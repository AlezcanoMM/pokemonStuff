package pokemonstuff;

import control.Control;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.PokemonLoader;
import view.View;

public class PokemonStuff {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        PokemonLoader pl = new PokemonLoader();
        View view = new View();
        PokemonLoader model = new PokemonLoader();
        Control control = new Control(view, model);
        
        view.setVisible(true);
    }
    
}
