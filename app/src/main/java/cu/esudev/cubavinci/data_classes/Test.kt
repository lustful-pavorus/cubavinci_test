package cu.esudev.cubavinci.data_classes

class Test(var year:String, var convocatory:Int, var locked:Boolean) : DbModel() {
    override var id = 0L
}