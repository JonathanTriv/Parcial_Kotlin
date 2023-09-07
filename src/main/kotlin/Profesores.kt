class Profesores(var departamento:String): Empleados(añoIncorporacion = "",numeroDespacho = "") {

    override fun toString(): String {
        return "Profesores(departamento='$departamento')"
    }
}