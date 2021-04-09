package FactoryMethod;


public class FabricaEnemigos extends Fabrica {

    public Enemigo Crear(String Tipo){

        switch (Tipo){

            case "NAVE": return new Nave();
            case "SOLDADO": return new Soldado();
            default: return null;

        }

    }

}


