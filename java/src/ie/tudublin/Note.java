package ie.tudublin;

public class Note {
    char note;
    int duration;

    public Note(){
        note = 'A';
        duration = 2;
    }

    public String toString()
    {
        return this.note + " " + this.duration + " ";
    }
}



