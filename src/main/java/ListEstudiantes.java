import java.util.ArrayList;

/**
 * Created by carlosalberto on 6/3/2017.
 */

public class ListEstudiantes {

    private ArrayList<Estudiantes> listaEstudiantes;

///////////////////////////////////////////////////////////////////////////
    public ListEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {

        this.listaEstudiantes = listaEstudiantes;
    }

    public ArrayList<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    ////////////////////////////////////////////////////////////////////////////////////// Add
    public void agregarEstudiante(Estudiantes est){
         listaEstudiantes.add(est);
    }

/////////////////////////////////////////////////////// modificar

    public void modificarEstiante(String nombre,String apellido,int matricula, String telefono, int index){

        listaEstudiantes.get(index).setNombre(nombre);
        listaEstudiantes.get(index).setApellido(apellido);
        listaEstudiantes.get(index).setTelefono(telefono);
        listaEstudiantes.get(index).setMatricula(matricula);

    }
/////////////////////////////////////////////////////// eliminar

    public boolean deleteEstudiante(String name){
        boolean deleted = false;
        if(listaEstudiantes.remove(findEstudiante(name))!=null){
            deleted = true;
        }
        return deleted;
    }

    public int findEstudiante(String name){
        boolean find = false;

        int i= 0;
        while(!find){
            if(listaEstudiantes.get(i).getNombre().equalsIgnoreCase(name)){
                find = true;
            }else{
                i++;
            }
        }
        return i;
    }
////////////////////////////////////////////////////////////////////////
public void recorrer(){

    for (Estudiantes st : listaEstudiantes) {
        System.out.println("Nombre: " + st.getNombre());
        System.out.println("Apellido: " + st.getApellido());
        System.out.println("Matricula: " + st.getMatricula());
        System.out.println("Telefono: " + st.getTelefono());
    }


}

}
