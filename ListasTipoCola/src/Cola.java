import javax.swing.*;

public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }
    /// metodo para saber si la cola esta vacia
    public boolean ColaVacia(){
        if(inicioCola == null){
            return true;
        }else{
            return false;
        }
    }
    //metodo para inserta
    public void insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;

        if (ColaVacia()) {
        inicioCola = nuevo_nodo;
        finalCola = nuevo_nodo;
        }else{
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;

        }
    }
    public int Extraer(){
        if (!ColaVacia()){
            int informacion = inicioCola.informacion;

            if (inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            }else{
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }

    }
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";

        while (recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }

        String cadena [] = Cola.split(" ");


        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " "+cadena[i];

        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
