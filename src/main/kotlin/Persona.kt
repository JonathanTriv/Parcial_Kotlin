open class Persona(var nombre:String,var apellidos:String, var cedula:String, var estadoCivil:String){

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellidos='$apellidos', cedula='$cedula', estadoCivil='$estadoCivil')"
    }
    fun cambioEstado(estado:String){
        estadoCivil = estado
        println("Su estado civil cambio a: $estadoCivil")
    }

}










