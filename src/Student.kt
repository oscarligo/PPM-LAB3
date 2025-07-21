data class Student(
    val name: String,
    val age: Int,
    val gender: String,
    val id: Int
) {
    override fun toString(): String {
        return "El estudiante $name tiene $age años "
    }
}
