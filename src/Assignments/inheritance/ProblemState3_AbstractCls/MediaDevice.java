package Assignments.inheritance.ProblemState3_AbstractCls;

public abstract class MediaDevice {
    String name;
    static int i = 0;

    public MediaDevice(String name) {
        this.name = name;
    }
    abstract void displayDetails();
}

class AudioPlayer extends MediaDevice{
    String SongName;
    String artist;

    public AudioPlayer(String name, String songname, String artist) {
        super(name);
        this.artist = artist;
        this.SongName = songname;
    }

    void play(){
        System.out.println("Play method in AudioPlayer...");
    }

    @Override
    void displayDetails() {
        System.out.println(" display details called from audio player...");
    }
}


class VideoPlayer extends MediaDevice{
    String title;
    int duration;

    public VideoPlayer(String name, String title, int duration) {
        super(name);
        this.title = title;
        this.duration = duration;
    }

    void play (){
        System.out.println("Play method call from vedio player");
    }
    @Override
    void displayDetails() {
        System.out.println(" display details called from VideoPlayer player...");
    }
}

