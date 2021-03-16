package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PokemonLoader {
    ArrayList<Pokemon> Pokemons;
    
    String filePath = "D:/UniStuff/programa_netbeans/PokemonStuff/doc/pokeInfo.csv";
    BufferedReader br;
    String line;
    
    public PokemonLoader() throws FileNotFoundException, IOException {
        this.Pokemons = new ArrayList<>();
        this.br = new BufferedReader(new FileReader(filePath));
        while((line = br.readLine()) != null){
            String[] Values = line.split(",");
            if(Values[0].equals("#")){continue;}
            addMon(Values);
        }
    }

    private void addMon(String[] a) {
        //int id, String name, String type1, String type2, int bst, int hp, int atk, int def, int spatk, int spdef, int speed, int gen, boolean legendary
        Pokemon pokemon = new Pokemon(Integer.parseInt(a[0]),a[1],a[2],a[3],Integer.parseInt(a[4]),Integer.parseInt(a[5]),Integer.parseInt(a[6]),Integer.parseInt(a[7]),Integer.parseInt(a[8]),Integer.parseInt(a[9]),Integer.parseInt(a[10]),Integer.parseInt(a[11]),Boolean.parseBoolean(a[12]));
        Pokemons.add(pokemon);
    }

    public ArrayList<Pokemon> getPokemons() {
        return Pokemons;
    }
    
}
