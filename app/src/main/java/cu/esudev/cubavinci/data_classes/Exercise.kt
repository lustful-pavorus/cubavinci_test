package cu.esudev.cubavinci.data_classes

class Exercise(var content:String?,
               var test_id:Int,
               var topic_id:Int) : DbModel(){
    override var id = 0L
}