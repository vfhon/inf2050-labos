public class Album{
    
    private String type;
    private String artiste;
    private String titre;
    private int publication;
    private int note;

    public Album(String type, String artiste, String titre, int publication, int note){
        this.type = type;
        this.artiste = artiste;
        this.titre = titre;
        this.publication = publication;
        this.note = note;
    }

    
    public String getType(){
        return this.type;
    }

    public String getArtiste(){
        return this.artiste;
    }

    public String getTitre(){
        return this.titre;
    }

    public int getPublication(){
        return this.publication;
    }

    public int getNote(){
        return this.note;
    }
}
