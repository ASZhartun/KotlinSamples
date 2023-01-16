package objectDeclaration

object EntityFactory { // object - ������� ��������, ������� ��� ��� ����� ����������
    fun create() = Entity("id", "name")
}

class Entity (val id: String, val name : String) {
    override fun toString(): String {
        return "ID: $id; name: $name"
    }
}

fun main() {
    val entity = EntityFactory.create()
    println(entity.toString())
}