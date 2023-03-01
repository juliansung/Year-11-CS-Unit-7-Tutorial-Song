import java.util.ArrayList;

public class Song {

    private String artist;
    private String title;

    private ArrayList<String> newListeners;

    public Song(String title, String artist){
        this.artist=artist;
        this.title=title;
        newListeners = new ArrayList();
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }

    public int howMany(ArrayList<String> list) {
        int count = 0;
        for (String string : list) {
            String name = string.toLowerCase();
            if (!newListeners.contains(name)) {
                newListeners.add(name);
                count++;
            }
        }
        return count;
    }


}
