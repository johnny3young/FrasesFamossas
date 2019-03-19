package com.example.black3.frasesfamosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView frasesTextView;
    private TextView autorTextView;
    private Button button;
    /*private String [] autores;
    private String [] citas; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frasesTextView = findViewById(R.id.frasesTextView);
        autorTextView = findViewById(R.id.autorTextView);
        button = findViewById(R.id.button);

        /* Dos formas de mostrar la info con ONClick o XML */
        /* 1era Forma */
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Me tocaste ouch....!!!!")};*/

        /* 2da Forma*/

            /* public void nuevaCita (View view) {
                Log.d(TAG, "Me tocaste ouch....!!!!");
            }*/

           /* autores = new String [61];
            citas = new String [61];

            autores[0] = "Walt Disney";
            citas[0] = "Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir";

            autores[1] = "Albert Einstein";
            citas[1] = "La imaginación es más importante que el conocimiento";

            autores[2] = "Steve Jobs";
            citas[2] = "Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona";

            autores[3] = "Albert Camus";
            citas[3] = "El éxito es fácil de obtener. Lo difícil es merecerlo.";

            autores[4] = "Irving Berlin";
            citas[4] = "El sabio no dice lo que sabe, y el necio no sabe lo que dice.";

            autores[5] = "Lao Tsé";
            citas[5] = "No hay que ir para atrás ni para darse impulso";

            autores[6] = "Mahatma Gandhi";
            citas[6] = "No hay caminos para la paz; la paz es el camino";

            autores[7] = "John Lennon";
            citas[7] = "Haz el amor y no la guerra";

            autores[8] = "Jacinto Benavente";
            citas[8] = "Lo peor que hacen los malos es obligarnos a dudar de los buenos";

            autores[9] = "Bob Marley";
            citas[9] = "Las guerras seguirán mientras el color de la piel siga siendo más importante que el de los ojos";

            autores[10] = "Confucio";
            citas[10] = "Aprende a vivir y sabrás morir bien";

            autores[11] = "Albert Einstein";
            citas[11] = "Cada día sabemos más y entendemos menos";

            autores[12] = "Albert Einstein";
            citas[12] = "El mundo no está en peligro por las malas personas sino por aquellas que permiten la maldad";

            autores[13] = "San Agustín";
            citas[13] = "La medida del amor es amar sin medida";

            autores[14] = "Lao Tsé";
            citas[14] = "Si das pescado a un hombre hambriento lo nutres durante una jornada. Si le enseñas a pescar, le nutrirás toda su vida";

            autores[15] = "Giovanni Boccaccio";
            citas[15] = "Vale más actuar exponiéndose a arrepentirse de ello, que arrepentirse de no haber hecho nada";

            autores[16] = "Platón";
            citas[16] = "El cuerpo humano es el carruaje; el yo, el hombre que lo conduce; el pensamiento son las riendas, y los sentimientos, los caballos";


            autores[17] = "Johnny III Young";
            citas[17] = "En la variedad está el placer";

            autores[18] = "Aristóteles";
            citas[18] = "El sabio no dice nunca todo lo que piensa, pero siempre piensa todo lo que dice";

            autores[19] = "Albert Einstein";
            citas[19] = "Hay dos cosas que son infinitas: el universo y la estupidez humana; de la primera no estoy muy seguro";

            autores[20] = "Friedrich Nietzsche";
            citas[20] = "El mundo es bello, pero tiene un defecto llamado hombre";

            autores[21] = "Benjamin Franklin";
            citas[21] = "La pereza viaja tan despacio que la pobreza no tarda en alcanzarla ";

            autores[22] = "René Descartes";
            citas[22] = "Pienso, luego existo";

            autores[23] = "Friedrich Nietzsche";
            citas[23] = "Lo que no te mata, te hace más fuerte";

            autores[24] = "Marco Tulio Cicerón";
            citas[24] = "De humanos es errar y de necios permanecer en el error";

            autores[25] = "Sócrates";
            citas[25] = "La verdadera sabiduría está en reconocer la propia ignorancia ";

            autores[26] = "Kovo";
            citas[26] = "La peor experiencia es la mejor maestra";

            autores[27] = "Martin Luther King";
            citas[27] = "No permitas que ningún ser humano te haga caer tan bajo como para odiarle";

            autores[28] = "William George Ward";
            citas[28] = "El pesimista se queja del viento; el optimista espera que cambie; el realista ajusta las velas";

            autores[29] = "Leonardo Da Vinci";
            citas[29] = "Aquel que más posee, más miedo tiene de perderlo";

            autores[30] = "Picasso";
            citas[30] = "La inspiración existe, pero tiene que encontrarte trabajando ";

            autores[31] = "Stephen Hawking";
            citas[31] = "Incluso la gente que afirma que no podemos hacer nada para cambiar nuestro destino, mira antes de cruzar la calle";

            autores[32] = "Mahatma Gandhi";
            citas[32] = "Ojo por ojo y el mundo acabará ciego";

            autores[33] = "Sócrates";
            citas[33] = "Solo sé que no sé nada";

            autores[34] = "Oscar Wilde";
            citas[34] = "La mejor manera de librarse de la tentación es caer en ella";

            autores[35] = "Galileo Galilei";
            citas[35] = "La duda es la madre de la invención";

            autores[36] = "Pablo Neruda";
            citas[36] = "Podrán cortar todas las flores, pero no podrán detener la primavera ";

            autores[37] = "Borges";
            citas[37] = "Uno llega a ser grande por lo que lee y no por lo que escribe ";

            autores[38] = "Sigmund Freud";
            citas[38] = "Uno es dueño de lo que calla y esclavo de lo que habla";

            autores[39] = "Goethe";
            citas[39] = "El único hombre que no se equivoca es el que nunca hace nada ";

            autores[40] = "Maquiavelo";
            citas[40] = "Vale más hacer y arrepentirse, que no hacer y arrepentirse ";

            autores[41] = "Mahatma Gandhi";
            citas[41] = "Si quieres cambiar al mundo, cámbiate a ti mismo";

            autores[42] = "Albert Schweitzer";
            citas[42] = "Con veinte años todos tienen el rostro que Dios les ha dado; con cuarenta el rostro que les ha dado la vida y con sesenta el que se merecen";

            autores[43] = "Sófocles";
            citas[43] = "Quien no haya sufrido lo que yo, que no me de consejos";

            autores[44] = "Irving Berlín";
            citas[44] = "La vida es un diez por ciento como la hacemos y un noventa por ciento como la tomamos";

            autores[45] = "Jean Jacques Rousseau";
            citas[5] = "El hombre que más ha vivido no es aquél que más años ha cumplido, sino aquel que más ha experimentado la vida";

            autores[46] = "Albert Einstein";
            citas[46] = "Todos somos muy ignorantes. Lo que ocurre es que no todos ignoramos las mismas cosas";

            autores[47] = "Albert Einstein";
            citas[47] = "El valor de un hombre debería verse en lo que da y no en lo que es capaz de recibir";

            autores[48] = "Albert Einstein";
            citas[48] = "La ciencia sin religión es coja, la religión sin la ciencia es ciega";

            autores[49] = "Confucio";
            citas[49] = "Aprender sin reflexionar es malgastar la energía";

            autores[50] = "Albert Einstein";
            citas[50] = "Los intelectuales resuelven problemas, los genios los previenen";

            autores[51] = "Albert Einstein";
            citas[51] = "Hay una fuerza motriz más poderosa que el vapor, la electricidad y la energía atómica: la voluntad";

            autores[52] = "Stephen Hawking";
            citas[52] = "La raza humana necesita un desafío intelectual. Debe ser aburrido ser Dios y no tener nada que descubrir";

            autores[53] = "Stephen Hawking";
            citas[53] = "La vida sería trágica si no fuera graciosa";

            autores[54] = "Stephen Hawking";
            citas[54] = "La inteligencia es la habilidad de adaptarse a los cambios";

            autores[55] = "Charles Chaplin";
            citas[55] = "Aprende como si fueras a vivir toda la vida, y vive como si fueras a morir mañana";

            autores[56] = "Charles Chaplin";
            citas[56] = "No hay nada permanente en este malvado mundo. Ni siquiera nuestros problema";

            autores[57] = "Charles Chaplin";
            citas[57] = "Estoy en paz con Dios, mi conflicto es con el hombre";

            autores[58] = "Bob Marley ";
            citas[58] = "Mientras haya hombres de primera y segunda categoría, yo seguiré gritando guerra";

            autores[59] = "Bob Marley ";
            citas[59] = "No vivas para que tu presencia se note, sino para que tu ausencia se sienta";

            autores[60] = "Bruce Lee";
            citas[60] = "Un hombre sabio puede aprender mas de una pregunta tonta, que de lo que puede aprender un tonto de una respuesta sabia";
            */

    }

    public void  nuevaCita (View view){

        GeneradorCitas generadorCitas = new GeneradorCitas();
        Cita cita = generadorCitas.obtenerCitaAleatoria();

    /* int numeroRandom = Util.generarNumeroAleatorio (citas.length);

    String cita = citas[numeroRandom];
    String autor = autores [numeroRandom];
    */

        autorTextView.setText(cita.getAutores());
        frasesTextView.setText(cita.getCitas());


    }


    };



