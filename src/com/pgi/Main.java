package com.pgi;

public class Main {
    // Créer une fonctionalité que l'on peut faire évoluer très facilement en y ajoutant simplement une autre classe sans avoir a modifier autre chose.
    // une petite application de votre choix et utilisez une interface pour disposer d'un code réutilisable.

    public static void main(String[] args) {
        com.pgi.memento.Editor editor = new com.pgi.memento.Editor();
        com.pgi.memento.History history = new com.pgi.memento.History();
        editor.setContent("a");
        editor.setFontName("arial");
        editor.setFontSize(24);
        history.push(editor.createState());
        editor.setContent("b");
        editor.setFontName("lato");
        editor.setFontSize(22);
        history.push(editor.createState());
        editor.setContent("c");
        editor.setFontName("sans serif");
        editor.setFontSize(20);
s

        CustomTimer chrono = getWatch();
        chrono.setCallback(Main::getValue);
        chrono.setPeriod(1000);
        chrono.setLimit(80000);
        chrono.start();
    }

    public static String getValue(String val){
        System.out.println(val);
        return val;
    }

    public static CustomTimer getWatch() {
        return new Chrono();
    }
}
