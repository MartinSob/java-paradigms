package Composite;

// La clase no se puede instanciar pero no toda clase que herede
//  debera implementar todos los metodos, por eso los metodos
//  no son abstract y devuelven una excepcion

public abstract class SongComponent {

    public void add(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public SongComponent get(int index){
        throw new UnsupportedOperationException();
    }

}
