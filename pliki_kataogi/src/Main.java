import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {




       File nazwaSciezki = new File("C:" + File.separator + "Users" + File.separator + "Ola" + File.separator + "Dropbox" + File.separator +"plikijava" + File.separator +"katalog testowy", "lekcja1.txt");





        wypiszSciezki (new File("C:" + File.separator + "Users" + File.separator + "Ola" + File.separator + "Dropbox"  ));


    }


    public static void wypiszSciezki(File nazwaSciezki){
        String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
        System.out.println(nazwaSciezki.getPath());

        for (int i = 0; i< nazwyPlikowIKatalogow.length; i++){
            File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i] );

            System.out.println(p.getPath());

            if (p.isDirectory()){
                wypiszSciezki(new File(p.getPath()));
            }

        }
    }
}
