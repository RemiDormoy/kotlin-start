import org.junit.Test

class CompteurDeChoses {

    fun retiensQueJeTaiDit(nombre: Int) {

    }

    fun combienDeFoisJeTaiDitQuelqueChose() : Int {
        return 0
    }

    fun combienDeFoisJeTaiDitCa(nombre: Int) : Int {
        TODO()
    }
}

class CompteurDeChosesTest {

    @Test
    fun `au debut jai rien fait` () {
        val compteur = CompteurDeChoses()
        val resultat = compteur.combienDeFoisJeTaiDitQuelqueChose()
        assert(resultat == 0)
    }

    @Test
    fun `quand je fais 1 truc ça compte` () {
        val compteur = CompteurDeChoses()
        compteur.retiensQueJeTaiDit(4)
        val resultat = compteur.combienDeFoisJeTaiDitQuelqueChose()
        assert(resultat == 1)
    }

    @Test
    fun `quand je fais 8 truc ça compte` () {
        val compteur = CompteurDeChoses()
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        val resultat = compteur.combienDeFoisJeTaiDitQuelqueChose()
        assert(resultat == 8)
    }


    @Test
    fun `quand je fais 3 fois 8 ça compte` () {
        val compteur = CompteurDeChoses()
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(9)
        compteur.retiensQueJeTaiDit(7)
        compteur.retiensQueJeTaiDit(8)
        compteur.retiensQueJeTaiDit(0)
        val resultat = compteur.combienDeFoisJeTaiDitCa(8)
        assert(resultat == 3)
    }


    @Test
    fun `quand je fais 3 fois 4 ça compte` () {
        val compteur = CompteurDeChoses()
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(9)
        compteur.retiensQueJeTaiDit(7)
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(0)
        val resultat = compteur.combienDeFoisJeTaiDitCa(4)
        assert(resultat == 3)
    }

    @Test
    fun `quand je fais -1, ben on repart de 0` () {
        val compteur = CompteurDeChoses()
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(9)
        compteur.retiensQueJeTaiDit(-1)
        compteur.retiensQueJeTaiDit(7)
        compteur.retiensQueJeTaiDit(4)
        compteur.retiensQueJeTaiDit(0)
        val resultat = compteur.combienDeFoisJeTaiDitCa(4)
        assert(resultat == 1)
    }
}