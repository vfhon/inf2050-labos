import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class JsonParser{

    public static ArrayList<Album> jsonFileToAlbums(String filename) throws IOException {
        ArrayList<Album> arrayAlbums = new ArrayList<Album>();
        String jsonText = DiskFile.loadFileIntoString(filename);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(jsonText);
        JSONArray data = (JSONArray) object.getJSONArray("collection");
        jsonToAlbum(data, arrayAlbums);
        return arrayAlbums;
    }

    private static void jsonToAlbum (JSONArray data, ArrayList<Album> arrayAlbums){
        for(int i = 0; i < data.size(); i++){
            JSONObject document = data.getJSONObject(i);
            String type = document.getString("type");
            String artiste = document.getString("artist");
            String titre = document.getString("title");
            String publication = document.getString("publication");
            String note = document.getString("rating");
            arrayAlbums.add(new Album (type, artiste, titre, Integer.parseInt(publication), Integer.parseInt(note)));
        }
    }
}
