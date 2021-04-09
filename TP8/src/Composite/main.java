package Composite;


public class main {

    public static void main(String[] args){
        SongGroup arcticMonkeys = new SongGroup();
        arcticMonkeys.groupName = "Arctic Monkeys";
        arcticMonkeys.groupDesc = "Alta banda de indie";


        // Cargo dos discos
        arcticMonkeys.listComponent.add(new SongGroup("My Favourite Worst Nightmare","Uno de sus mejores discos"));
        arcticMonkeys.listComponent.add(new SongGroup("AM","El ultimo disco"));

        // Le cargo dos canciones al primer disco
        arcticMonkeys.listComponent.get(0).add(new Song("Brianstorm","3:17"));
        arcticMonkeys.listComponent.get(0).add(new Song("Fluorescent Adolescent","3:17"));

        // Le cargo dos canciones al segundo disco
        arcticMonkeys.listComponent.get(1).add(new Song("R U Mine","3:17"));
        arcticMonkeys.listComponent.get(1).add(new Song("Knee Socks","3:17"));

//        // Le cargo un disco en vivo adentro del disco AM
//        arcticMonkeys.listComponent.get(1).add(new SongGroup("En vivo","Presentacion del disco en vivo"));
//        ((SongGroup) arcticMonkeys.listComponent.get(1)).listComponent.add(new Song("R U Mine LIVE","3:17"));
//        ((SongGroup) arcticMonkeys.listComponent.get(1)).listComponent.add(new Song("Do i Wanna Know LIVE","3:17"));

        System.out.println(arcticMonkeys.toString());
    }
}
