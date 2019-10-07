import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Writer{

    public static void main (String[] args){
        
        JSONArray albums = new JSONArray();

        JSONObject album1 = new JSONObject();
        album1.put("type", "album");
        album1.put("artist", "CCR");
        album1.put("title", "Cosmo's Factory");
        album1.put("publication", "1970");
        album1.put("rating", "4");
        albums.add(album1);

        JSONObject album2 = new JSONObject();
        album2.put("type", "album");
        album2.put("artist", "The beatles");
        album2.put("title", "Sgt. pepper's lonely hearts club band");
        album2.put("publication", "1967");
        album2.put("rating", "4");
        albums.add(album2);

        JSONObject album3 = new JSONObject();
        album3.put("type", "album");
        album3.put("artist", "Daniel Bélanger");
        album3.put("title", "Rêver mieux");
        album3.put("publication", "2001");
        album3.put("rating", "4");
        albums.add(album2);

        try{
        String jsonString = albums.toString(2); // 2 = indice d'indentation
        DiskFile.saveStringIntoFile("data/output.json", jsonString);
        }catch (IOException e){
            System.out.println(e);
        }
    }

}
