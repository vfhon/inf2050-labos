import java.io.IOException;
import java.util.ArrayList;

public class Reader{
    
    public static void main (String[] args){
        try{
        String filename = ( args.length > 0 ) ? args[1] : "data/json.txt";
        ArrayList<Album> arrayAlbums = JsonParser.jsonFileToAlbums(filename);
        printStats(arrayAlbums);     
        }catch (Exception e){
            System.out.println("Erreur de lecture du fichier");
            System.out.println(e);
        }
    }


    public static void printStats(ArrayList<Album> arrayAlbums){
        int nbAlbums = 0;
        int nbSingles = 0;
        int nbDepuis2003 = 0;
        int nbNoteCinq = 0;

        for (Album album : arrayAlbums){
            if (album.getType().equals("album")) ++nbAlbums;
            else ++nbSingles;
            if (album.getPublication() >= 2003) ++nbDepuis2003;
            if (album.getNote() == 5) ++nbNoteCinq;
        }

        System.out.printf("Nombre d'albums : %d\nNombre de singles : %d\nNombre de publications depuis 2003 : %d\nNombre de publications notés 5 : %d\n",
                nbAlbums, nbSingles, nbDepuis2003, nbNoteCinq);
    }

}
