package metodos;

import classes.Liga;

public class criarLiga{
    private Liga liga;
        public criarLiga(Liga liga) {
            this.liga = liga;
            liga.setLigas(liga);
        }
    }

