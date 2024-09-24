class Planet(){
    var Star:String="Unknow Star"
    var Mass:Double=1.0
    var numberOfSatellites:Int=1
}


fun main() {
    val kotlinPlanet = Planet()
    kotlinPlanet.Star = "Java"
    kotlinPlanet.Mass = 2.0
    kotlinPlanet.numberOfSatellites = 0
}