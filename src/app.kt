fun main(){
    val ord=Ordenador(Raton("USB"), Pantalla(14.5f,"Samsung"),CPU(2048,3))
    println("Raton Tipo: " + ord.rat.tipo + "\nPantalla: " + "\nTamano: "+ord.pant.pulg + "\nMarca: "+ord.pant.marca)
    println("CPU:\nMemoria: " +ord.cpu.men +" MB\nVelocidad: " +ord.cpu.vel +" GHz")
}