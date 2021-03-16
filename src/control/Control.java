package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Pokemon;
import model.PokemonLoader;
import view.View;

public class Control {
    private final View view;
    private final PokemonLoader model;

    public Control(View view, PokemonLoader model) {
        this.view = view;
        this.model = model;
        
        this.view.addFindListener(new FindListener());
    }

    private class FindListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.displayExecInfo();
            for(Pokemon pokemon: model.getPokemons()){
                if(view.getType1().equals(pokemon.getType1()) || view.getType1().equals(pokemon.getType2())){
                    if(!view.getType2().equals("")){
                        if(view.getType2().equals(pokemon.getType1()) || view.getType2().equals(pokemon.getType2())){
                            System.out.println(pokemon.getName());
                        }
                    } else {
                        System.out.println(pokemon.getName());
                    }
                }
            }
        }
    }
    
}
