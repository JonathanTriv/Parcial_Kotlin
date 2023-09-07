class Estudiante( nombre:String, apellidos:String,  cedula:String, estadoCivil:String, var curso:String): Persona(nombre,apellidos,cedula,estadoCivil) {

    override fun toString(): String {
        return "Estudiante(curso='$curso')"
    }

}

