package programutvikling_Oblig2;

//Oppgave 2.3
public class MyArrayList<E>{

    private Object[] list;

    public MyArrayList(){
        list = new Object[10];
    }

    public boolean setElement(E elem){
        boolean full = true;
        for(int i = 0; i < list.length; i++){
            if(list[i]==null){
                list[i] = elem;
                full = false;
                break;
            } else {
                full = true;
            }
        }
        return full;
    }

    public E getElement(int index) {
        return (E) list[index];
    }

    public int size(){
        int counter = 0;

        for(int i = 0; i < list.length; i++){
            if(list[i]!=null){
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }

}
