package io.javabrains

data class PersonKt(val lastName: String, val firstName: String, val age: Int)

object TeamFactoryKt {
	fun getTeam(): MutableList<PersonKt> = mutableListOf(PersonKt("Monteverdi", "Filippo", 37),
			PersonKt("Sposato", "Pier Paolo", 40), PersonKt("Raimondo", "Mario", 41),
			PersonKt("Stillo", "Massimo", 42), PersonKt("Gangemi", "Alfonso", 38),
			PersonKt("Signoretta", "Pasquale", 39), PersonKt("Beltrano", "Roberto", 43))
}