package Composite;


import java.util.ArrayList;

public class SongGroup extends SongComponent{
    public String groupName;
    public String groupDesc;
    public ArrayList<SongComponent> listComponent = new ArrayList<>();

    public SongGroup() {
    }

    public SongGroup(String groupName, String groupDesc) {
        this.groupName = groupName;
        this.groupDesc = groupDesc;
    }

    public void add(SongComponent songComponent) {
        this.listComponent.add(songComponent);
    }

    public void remove(SongComponent songComponent) {
        this.listComponent.remove(songComponent);
    }

    public SongComponent get(int index) {
        return this.listComponent.get(index);
    }

    public String toString() {
        String result = "\nGroupName: " + groupName + ", GroupDesc: " + groupDesc + "\n";
        for (SongComponent sc : listComponent) {
            result += sc.toString() + "\n";
        }
        return result;
    }

}
