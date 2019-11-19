import org.junit.Test

class AjouteurDe1 {

    fun ajoute1(nombreAuquelOnVeutAjouter1: Int): Int {
        return nombreAuquelOnVeutAjouter1 + 1
    }

    fun ajoute1SiJeSuisImpair(nombreAuquelOnVeutAjouter1: Int): Int {
        val leNombreAuquelOnVeutAjouterUnEstPair = nombreAuquelOnVeutAjouter1 % 2 == 0
        if (leNombreAuquelOnVeutAjouterUnEstPair == false) {
            return ajoute1(nombreAuquelOnVeutAjouter1)
        } else {
            return nombreAuquelOnVeutAjouter1
        }
    }

    fun ajoute1SiJeSuisPair(nombreAuquelOnVeutAjouter1: Int): Int {
        val leNombreAuquelOnVeutAjouterUnEstPair = nombreAuquelOnVeutAjouter1 % 2 == 0
        if (leNombreAuquelOnVeutAjouterUnEstPair == true) {
            return ajoute1(nombreAuquelOnVeutAjouter1)
        } else {
            return nombreAuquelOnVeutAjouter1
        }
    }
}

class AjouteurDe1Test {

    @Test
    fun `je peux ajouter 1`() {
        val ajouteur = AjouteurDe1()
        val resultat = ajouteur.ajoute1(8)
        assert(resultat == 9)
    }

    @Test
    fun `je peux ajouter 1 si je suis pair`() {
        val ajouteur = AjouteurDe1()
        val resultat = ajouteur.ajoute1SiJeSuisPair(8)
        assert(resultat == 9)
    }

    @Test
    fun `je peux ajouter 1 si je suis impair`() {
        val ajouteur = AjouteurDe1()
        val resultat = ajouteur.ajoute1SiJeSuisImpair(7)
        assert(resultat == 8)
    }

    @Test
    fun `je peux pas ajouter 1 si je suis pair`() {
        val ajouteur = AjouteurDe1()
        val resultat = ajouteur.ajoute1SiJeSuisImpair(8)
        assert(resultat == 8)
    }

    @Test
    fun `je peux pas ajouter 1 si je suis impair`() {
        val ajouteur = AjouteurDe1()
        val resultat = ajouteur.ajoute1SiJeSuisPair(7)
        assert(resultat == 7)
    }
}