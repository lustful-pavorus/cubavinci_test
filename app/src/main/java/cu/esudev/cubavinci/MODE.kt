package cu.esudev.cubavinci

enum class MODE(val mode:Int) {
    Asignature(0),
    TOE(1),
    Topics(2),
    ExerciseList(3),
    Tests(4),
    Test(5),
    Exercise(6);

    companion object {
        val EXTRAS_KEY = "MODE"
        fun getByValue(value: Int): MODE {
            values().forEach {
                item ->
                if (item.mode == value) {
                    return item
                }
            }
            return Asignature
        }
    }
}