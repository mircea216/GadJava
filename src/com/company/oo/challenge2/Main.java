package com.company.oo.challenge2;

public class Main {
    public static void afisareFilme(Studio[] studios) {
        for (Studio studio : studios) {
            if (studio.getFilme().length > 2)
                System.out.println(studio.getNume());
        }
    }

    public static void afisareFilmeCuActoriPeste50(Studio[] studios) {
        for (Studio studio : studios) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50) {
                        System.out.println(actor.getNume());
                        break;
                    }
                }
            }
        }
    }

    public static String[] afisareActori(Studio[] studios) {
        String[] toReturn = new String[10];
        int i = 0;
        int j = 0;
        for (Studio studio : studios) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().equals("actor cu 2 premii")) {
                        toReturn[i++] = actor.getNume();
                        break;
                    }
                }
                if (i > j) {
                    j = i;
                    break;
                }
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("Oscar", 1990);
        Premiu oscar2000 = new Premiu("Oscar", 1990);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2018 = new Premiu("Oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar 2010", 35, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar 2010", 23, new Premiu[]{oscar2018});
        Actor actorOscarFaraPremii01 = new Actor("actor fara oscaruri 01", 33, new Premiu[]{});
        Actor actorOscarFaraPremii02 = new Actor("actor fara oscaruri 02", 60, new Premiu[]{});
        Actor actorOscarFaraPremii03 = new Actor("actor fara oscaruri 03", 20, new Premiu[]{});

        Film film1 = new Film("film cu actori de oscar", 1990,
                new Actor[]{actorOscar1990, actorOscarFaraPremii01});
        Film film2 = new Film("film cu actori fara premii2", 2010,
                new Actor[]{actorOscarFaraPremii01, actorOscarFaraPremii02, actorOscarFaraPremii03});
        Film film3 = new Film("film cu actori fara premii3", 2010,
                new Actor[]{actorOscarFaraPremii01, actorOscarFaraPremii02, actorOscarFaraPremii03});
        Film film4 = new Film("film cu actori de oscar", 2018,
                new Actor[]{actorOscar2010, actorOscar2018, actorOscarFaraPremii02});
        Film film5 = new Film("film cu actori fara premii5", 2018,
                new Actor[]{actorOscarFaraPremii02, actorOscarFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        String[] result = afisareActori(studioDatabase);
        for (String name : result)
            if (name != null)
                System.out.println(name);
        afisareFilme(studioDatabase);
        afisareFilmeCuActoriPeste50(studioDatabase);
    }
}
