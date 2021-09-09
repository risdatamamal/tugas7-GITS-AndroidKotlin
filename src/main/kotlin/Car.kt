// Kelas Car
class Car(name: String, types: String, color: String, tires: Int) {
    var carName = name
    var typeCar = types
    var carColor = color
    var numberOfTires = tires

    // function untuk menyimpan data yang akan dihasilkan
    fun result(): String {
        val _result =
                "------ Deskripsi Mobil ------" +
                "\nNama Mobil: " + carName +
                "\nType Mobil: " + typeCar +
                "\nWarna Mobil: " + carColor +
                "\nJumlah Ban: " + numberOfTires + "\n" +
                "-----------------------------"
        return _result
    }
}