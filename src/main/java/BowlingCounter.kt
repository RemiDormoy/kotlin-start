class BowlingCounter {

    private var totalScore: Int
    private var nombreDeBoulesJouees: Int
    private var scoreDeLaDerniereBoule: Int
    private var scoreDeLavantDerniereBoule: Int

    init {
        totalScore = 0
        nombreDeBoulesJouees = 0
        scoreDeLaDerniereBoule = 0
        scoreDeLavantDerniereBoule = 0
    }

    fun jeVoudraisConnaitreMonScore(): Int {
        return totalScore
    }

    fun jaiJouéUneBouleEtJaiFait(scoreDeLaBouleQueJeViensDeLancer: Int) {
        nombreDeBoulesJouees = nombreDeBoulesJouees + 1
        // on veut vérifier que les deux boules consécutives font 10
        val ilYAUnSpareEnCours = scoreDeLaDerniereBoule + scoreDeLavantDerniereBoule == 10
        if (ilYAUnSpareEnCours) {
            calculeScorePourUnSpare(scoreDeLaBouleQueJeViensDeLancer)
        } else {
            calculeScoreSansSpare(scoreDeLaBouleQueJeViensDeLancer)
        }
    }

    private fun calculeScorePourUnSpare(play: Int) {
        totalScore = totalScore + play * 2
    }

    private fun calculeScoreSansSpare(play: Int) {
        totalScore = totalScore + play
    }
}

fun main() {
    val counter = BowlingCounter()
    counter.jaiJouéUneBouleEtJaiFait(8)
    println(counter.jeVoudraisConnaitreMonScore())
}