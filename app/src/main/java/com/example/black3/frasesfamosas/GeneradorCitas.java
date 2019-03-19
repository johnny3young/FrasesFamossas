package com.example.black3.frasesfamosas;

import android.graphics.Color;

import java.util.Random;

public class GeneradorCitas {

    private  Cita [] citas;
    private int[] colorsArray = {Color.CYAN,Color.RED,Color.BLACK,Color.GRAY,Color.YELLOW,Color.GREEN,Color.MAGENTA};

    public GeneradorCitas () {

        citas = new Cita[61];

        citas[0] = new Cita();
        citas[0].setAutores("Walt Disney");
        citas[0].setCitas("Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir");

        citas[1] = new Cita();
        citas[1].setAutores("Albert Einstein");
        citas[1].setCitas("La imaginación es más importante que el conocimiento");

        citas[2] = new Cita();
        citas[2].setAutores("Steve Jobs");
        citas[2].setCitas("Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona");

        citas[3] = new Cita();
        citas[3].setAutores("Albert Camus");
        citas[3].setCitas("El éxito es fácil de obtener. Lo difícil es merecerlo");

        citas[4] = new Cita();
        citas[4].setCitas("Irving Berlin");
        citas[4].setCitas("El sabio no dice lo que sabe, y el necio no sabe lo que dice");

        citas[5] = new Cita();
        citas[5].setAutores("Lao Tsé");
        citas[5].setCitas ("No hay que ir para atrás ni para darse impulso");

        citas[6] = new Cita();
        citas[6].setAutores("Mahatma Gandhi");
        citas[6].setCitas("No hay caminos para la paz; la paz es el camino");

        citas[7] = new Cita();
        citas[7].setAutores("John Lennon");
        citas[7].setCitas("Haz el amor y no la guerra");

        citas[8] = new Cita();
        citas[8].setAutores("Jacinto Benavente");
        citas[8].setCitas("Lo peor que hacen los malos es obligarnos a dudar de los buenos");

        citas[9] = new Cita();
        citas[9].setAutores("Bob Marley");
        citas[9].setCitas("Las guerras seguirán mientras el color de la piel siga siendo más importante que el de los ojos");

        citas[10] = new Cita();
        citas[10].setAutores("Confucio");
        citas[10].setCitas("Aprende a vivir y sabrás morir bien");

        citas[11] = new Cita();
        citas[11].setAutores("Albert Einstein");
        citas[11].setCitas("Cada día sabemos más y entendemos menos");

        citas[12] = new Cita();
        citas[12].setAutores("Albert Einstein");
        citas[12].setCitas("El mundo no está en peligro por las malas personas sino por aquellas que permiten la maldad");

        citas[13] = new Cita();
        citas[13].setAutores("San Agustín");
        citas[13].setCitas("La medida del amor es amar sin medida");

        citas[14] = new Cita();
        citas[14].setAutores("Lao Tsé");
        citas[14].setCitas("Si das pescado a un hombre hambriento lo nutres durante una jornada. Si le enseñas a pescar, le nutrirás toda su vida");

        citas[15] = new Cita();
        citas[15].setAutores("Giovanni Boccaccio");
        citas[15].setCitas("Vale más actuar exponiéndose a arrepentirse de ello, que arrepentirse de no haber hecho nada");

        citas[16] = new Cita();
        citas[16].setAutores("Platón");
        citas[16].setCitas("El cuerpo humano es el carruaje; el yo, el hombre que lo conduce; el pensamiento son las riendas, y los sentimientos, los caballos");

        citas[17] = new Cita();
        citas[17].setAutores("Johnny III Young");
        citas[17].setCitas("En la variedad está el placer");

        citas[18] = new Cita();
        citas[18].setAutores("Aristóteles");
        citas[18].setCitas("El sabio no dice nunca todo lo que piensa, pero siempre piensa todo lo que dice");

        citas[19] = new Cita();
        citas[19].setAutores("Albert Einstein");
        citas[19].setCitas("Hay dos cosas que son infinitas: el universo y la estupidez humana; de la primera no estoy muy seguro");

        citas[20] = new Cita();
        citas[20].setAutores("Friedrich Nietzsche");
        citas[20].setCitas("El mundo es bello, pero tiene un defecto llamado hombre");

        citas[21] = new Cita();
        citas[21].setAutores("Benjamin Franklin");
        citas[21].setCitas("La pereza viaja tan despacio que la pobreza no tarda en alcanzarla");

        citas[22] = new Cita();
        citas[22].setAutores("René Descartes");
        citas[22].setCitas("Pienso, luego existo");

        citas[23] = new Cita();
        citas[23].setAutores("Friedrich Nietzsche");
        citas[23].setCitas("Lo que no te mata, te hace más fuerte");

        citas[24] = new Cita();
        citas[24].setAutores("Marco Tulio Cicerón");
        citas[24].setCitas("De humanos es errar y de necios permanecer en el error");

        citas[25] = new Cita();
        citas[25].setAutores("Sócrates");
        citas[25].setCitas("La verdadera sabiduría está en reconocer la propia ignorancia");

        citas[26] = new Cita();
        citas[26].setAutores("Kovo");
        citas[26].setCitas("La peor experiencia es la mejor maestra");

        citas[27] = new Cita();
        citas[27].setAutores("Martin Luther King");
        citas[27].setCitas("No permitas que ningún ser humano te haga caer tan bajo como para odiarle");

        citas[28] = new Cita();
        citas[28].setAutores("William George Ward");
        citas[28].setCitas("El pesimista se queja del viento; el optimista espera que cambie; el realista ajusta las velas");

        citas[29] = new Cita();
        citas[29].setAutores("Leonardo Da Vinci");
        citas[29].setCitas("Aquel que más posee, más miedo tiene de perderlo");

        citas[30] = new Cita();
        citas[30].setAutores("Picasso");
        citas[30].setCitas("La inspiración existe, pero tiene que encontrarte trabajando");

        citas[31] = new Cita();
        citas[31].setAutores("Stephen Hawking");
        citas[31].setCitas("Incluso la gente que afirma que no podemos hacer nada para cambiar nuestro destino, mira antes de cruzar la calle");

        citas[32] = new Cita();
        citas[32].setAutores("Mahatma Gandhi");
        citas[32].setCitas("Ojo por ojo y el mundo acabará ciego");

        citas[33] = new Cita();
        citas[33].setAutores("Sócrates");
        citas[33].setCitas("Solo sé que no sé nada");

        citas[34] = new Cita();
        citas[34].setAutores("Oscar Wilde");
        citas[34].setCitas("La mejor manera de librarse de la tentación es caer en ella");

        citas[35] = new Cita();
        citas[35].setAutores("Galileo Galilei");
        citas[35].setCitas("La duda es la madre de la invención");

        citas[36] = new Cita();
        citas[36].setAutores("Pablo Neruda");
        citas[36].setCitas("Podrán cortar todas las flores, pero no podrán detener la primavera");

        citas[37] = new Cita();
        citas[37].setAutores("Borges");
        citas[37].setCitas("Uno llega a ser grande por lo que lee y no por lo que escribe");

        citas[38] = new Cita();
        citas[38].setAutores("Sigmund Freud");
        citas[38].setCitas("Uno es dueño de lo que calla y esclavo de lo que habla");

        citas[39] = new Cita();
        citas[39].setAutores("Goethe");
        citas[39].setCitas("El único hombre que no se equivoca es el que nunca hace nada ");

        citas[40] = new Cita();
        citas[40].setAutores("Maquiavelo");
        citas[40].setCitas("Vale más hacer y arrepentirse, que no hacer y arrepentirse ");

        citas[41] = new Cita();
        citas[41].setAutores("Mahatma Gandhi");
        citas[41].setCitas("Si quieres cambiar al mundo, cámbiate a ti mismo");

        citas[42] = new Cita();
        citas[42].setAutores("Albert Schweitzer");
        citas[42].setCitas("Con veinte años todos tienen el rostro que Dios les ha dado; con cuarenta el rostro que les ha dado la vida y con sesenta el que se merecen");

        citas[43] = new Cita();
        citas[43].setAutores("Sófocles");
        citas[43].setCitas("Quien no haya sufrido lo que yo, que no me de consejos");

        citas[44] = new Cita();
        citas[44].setAutores("Irving Berlín");
        citas[44].setCitas("La vida es un diez por ciento como la hacemos y un noventa por ciento como la tomamos");

        citas[45] = new Cita();
        citas[45].setAutores("Jean Jacques Rousseau");
        citas[5].setCitas("El hombre que más ha vivido no es aquél que más años ha cumplido, sino aquel que más ha experimentado la vida");

        citas[46] = new Cita();
        citas[46].setAutores("Albert Einstein");
        citas[46].setCitas("Todos somos muy ignorantes. Lo que ocurre es que no todos ignoramos las mismas cosas");

        citas[47] = new Cita();
        citas[47].setAutores("Albert Einstein");
        citas[47].setCitas("El valor de un hombre debería verse en lo que da y no en lo que es capaz de recibir");

        citas[48] = new Cita();
        citas[48].setAutores("Albert Einstein");
        citas[48].setCitas("La ciencia sin religión es coja, la religión sin la ciencia es ciega");

        citas[49] = new Cita();
        citas[49].setAutores("Confucio");
        citas[49].setCitas("Aprender sin reflexionar es malgastar la energía");

        citas[50] = new Cita();
        citas[50].setAutores("Albert Einstein");
        citas[50].setCitas("Los intelectuales resuelven problemas, los genios los previenen");

        citas[51] = new Cita();
        citas[51].setAutores("Albert Einstein");
        citas[51].setCitas("Hay una fuerza motriz más poderosa que el vapor, la electricidad y la energía atómica: la voluntad");

        citas[52] = new Cita();
        citas[52].setAutores("Stephen Hawking");
        citas[52].setCitas("La raza humana necesita un desafío intelectual. Debe ser aburrido ser Dios y no tener nada que descubrir");

        citas[53] = new Cita();
        citas[53].setAutores("Stephen Hawking");
        citas[53].setCitas("La vida sería trágica si no fuera graciosa");

        citas[54] = new Cita();
        citas[54].setAutores("Stephen Hawking");
        citas[54].setCitas("La inteligencia es la habilidad de adaptarse a los cambios");

        citas[55] = new Cita();
        citas[55].setAutores("Charles Chaplin");
        citas[55].setCitas("Aprende como si fueras a vivir toda la vida, y vive como si fueras a morir mañana");

        citas[56] = new Cita();
        citas[56].setAutores("Charles Chaplin");
        citas[56].setCitas("No hay nada permanente en este malvado mundo. Ni siquiera nuestros problema");

        citas[57] = new Cita();
        citas[57].setAutores("Charles Chaplin");
        citas[57].setCitas("Estoy en paz con Dios, mi conflicto es con el hombre");

        citas[58] = new Cita();
        citas[58].setAutores("Bob Marley ");
        citas[58].setCitas("Mientras haya hombres de primera y segunda categoría, yo seguiré gritando guerra");

        citas[59] = new Cita();
        citas[59].setAutores("Bob Marley ");
        citas[59].setCitas("No vivas para que tu presencia se note, sino para que tu ausencia se sienta");

        citas[60] = new Cita();
        citas[60].setAutores("Bruce Lee");
        citas[60].setCitas("Un hombre sabio puede aprender mas de una pregunta tonta, que de lo que puede aprender un tonto de una respuesta sabia");


    }

    public Cita obtenerCitaAleatoria () {

        int numeroRandom = Util.generarNumeroAleatorio(citas.length);
        return citas [numeroRandom];

    }
}
