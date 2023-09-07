

fun main() {

    var opc = 0
    do {
        println("1.Libreta Militar")
        println("2.Facultad")
        println("3.Salir")
        opc = readln().toInt()

        when(opc){
            1->{
                var edad = 0
                var sisben = 0
                var descuento = 0.0
                println("Ingrese su edad: ")
                edad = readln().toInt()
                println("Ingrese su nivel de sisben: ")
                sisben = readln().toInt()
                if (edad > 18){
                    var mibreta = 350000.0
                    when(sisben){
                        1->{
                            descuento = (mibreta * 0.40)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }
                        2->{
                            descuento = (mibreta * 0.30)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }
                        3->{
                            descuento = (mibreta * 0.15)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }

                    }
                }else if(edad == 18){
                    var mibreta = 200000.0
                    when(sisben){
                        1->{
                            descuento = (mibreta * 0.60)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }
                        2->{
                            descuento = (mibreta * 0.40)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }
                        3->{
                            descuento = (mibreta * 0.20)
                            mibreta -= descuento
                            println("El precio de su libreta militar es de: $mibreta")
                        }

                    }
                }
            }
            2->{
                println("Menu")
                println("1. Estudiante")
                println("2. Profesor")
                println("1. Personal de Servicio")
                opc = readln().toInt()

                when(opc){
                    1->{
                        var E1 = Estudiante("Juan","Perez","1008945679","Soltero","A11")
                    }

                }


            }
        }

    }while (opc > 0 && opc < 4)

}