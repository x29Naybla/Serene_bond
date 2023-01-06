package com.x29Naybla.Main;

public class Language {

    public static String day;
    public static String dead;
    public static String paused;

    public int currLang = 0;
    public int maxLang = 3;

    public static String[] options = {"0", "1", "2", "3"};

    public static boolean up;

    public void tick(){

        if(currLang == 0){
            //English selected
            day = "Day: ";
            dead = "You Died";
            paused = "Paused";
            options[0] = "New World";
            options[1] = "Load World";
            options[2] = "Change Language";
            options[3] = "Exit";

        }
        if(currLang == 1){
            //Portuguese selected
            day = "Dia: ";
            dead = "Você Morreu";
            paused = "Pausado";
            options[0] = "Novo Mundo";
            options[1] = "Carregar Mundo";
            options[2] = "Mudar Idioma";
            options[3] = "Sair";

        }
        if(currLang == 2){
            //French selected
            day = "Jour: ";
            dead = "Tu es Mort";
            paused = "En Pause";

            options[0] = "Nouveau Monde";
            options[1] = "Charger Monde";
            options[2] = "Changer la Langue";
            options[3] = "Quitter";

        }
        if(currLang == 3){
            //German selected
            day = "Tag: ";
            dead = "Du Bist Gestorben";
            paused = "Pausiert";

            options[0] = "Neue Welt";
            options[1] = "Welt Laden";
            options[2] = "Sprache Ändern";
            options[3] = "Verlassen";

        }
    }

    public void changeLang(){
        if(up){
            currLang = currLang +1;
            System.out.println(currLang);
            up = false;
            if(currLang > maxLang){
                currLang = 0;
            }
        }
    }

}
