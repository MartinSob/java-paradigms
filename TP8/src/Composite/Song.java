package Composite;


public class Song extends SongComponent{
    public String songName;
    public String songDesc;

    public Song(String songName, String songDesc) {
        this.songName = songName;
        this.songDesc = songDesc;
    }

    public String toString() {
        return "SongName: " + songName + ", SongDesc: " + songDesc;
    }

    // Solo sobreescribo get(), porque add y remove no me sirven
    //  en el leaf
    public void get(){
        System.out.println(this.toString());
    }
}
