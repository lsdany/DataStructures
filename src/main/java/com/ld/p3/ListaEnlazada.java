package com.ld.p3;


public class ListaEnlazada{

    private Nodo inicio;
    private Nodo ultimo;

    public ListaEnlazada(){
        inicio=null;
    }

    public boolean estaVacia(){
        return inicio==null;
    }

    public void agregarInicio(Object dato){
        //1. crear Nodo
        Nodo nuevo = new Nodo(dato);
        //2. revisar si la lista no esta vacia
        if(!estaVacia()){
            nuevo.setSig(inicio);
        }else{
            ultimo = nuevo;
        }

        //3. el nuevo nodo es el inicial de la lista
        inicio = nuevo;
    }

    public void eliminarInicio(){
        //1.cambiar inicio al segundo nodo
        if(!estaVacia())
            inicio = inicio.getSig();

        if(inicio == null){
            ultimo = inicio;
        }
    }

    public void recorrer(){
        Nodo temp = inicio;
        while(temp!=null){
            //1.mostar el dato
            System.out.print(temp.getDato().toString()
                    +" -> ");
            //2. cambiar el apuntador al siguiente nodo
            temp=temp.getSig();
        }
        System.out.println("");
    }

    public void recorrer(Nodo nodo){

        if(nodo != null){

        }

    }


    public void agregarFinal(Object dato){
        //la lista esta vacia
        if(estaVacia()){
            agregarInicio(dato);
        }else{
            Nodo nodo = new Nodo(dato);
            ultimo.setSig(nodo);
            ultimo = nodo;

        }
    }

    public void eliminarFinal(){

        if(inicio == ultimo && inicio != null){
            inicio = ultimo = null;
        }else
            if(!estaVacia()){

                Nodo penultimo = devolverPenultimo();
                ultimo = penultimo;
                ultimo.setSig(null);
            }


    }


    public Nodo devolverPenultimo(){
        Nodo temp = inicio;

        while(temp.getSig() != ultimo){
            temp = temp.getSig();
        }

        return temp;
    }

    public static void main(String[] args){

        ListaEnlazada lista1 = new ListaEnlazada();

//        lista1.agregarInicio(50);
//        lista1.agregarInicio(35);
//        lista1.agregarInicio(5);
        lista1.agregarFinal(50);
        lista1.agregarFinal(35);
        lista1.agregarFinal(5);
        lista1.recorrer();
//        lista1.eliminarInicio();
        lista1.eliminarFinal();
        lista1.recorrer();
        lista1.eliminarFinal();
        lista1.recorrer();
        lista1.eliminarFinal();
        lista1.recorrer();
    }
}






