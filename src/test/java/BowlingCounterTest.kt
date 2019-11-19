import org.junit.Test

class BowlingCounterTest {

    @Test
    fun `when game just began, score should be 0`() {
        val counter = BowlingCounter()

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 0)
    }

    @Test
    fun `when player scored 8 in first shot, score should be 8`() {
        val counter = BowlingCounter()
        counter.jaiJouéUneBouleEtJaiFait(8)

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 8)
    }

    @Test
    fun `when player scored 5 then 3, score should be 8`() {
        val counter = BowlingCounter()
        counter.jaiJouéUneBouleEtJaiFait(5)
        counter.jaiJouéUneBouleEtJaiFait(3)

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 8)
    }

    @Test
    fun `when player scored 6 then 4 then 3, score should be 14`() {
        val counter = BowlingCounter()
        counter.jaiJouéUneBouleEtJaiFait(6)
        counter.jaiJouéUneBouleEtJaiFait(4)
        counter.jaiJouéUneBouleEtJaiFait(3)

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 16)
    }

    @Test
    fun `when player scored 6, 3, 1, 5, score should be 15`() {
        val counter = BowlingCounter()
        counter.jaiJouéUneBouleEtJaiFait(6)
        counter.jaiJouéUneBouleEtJaiFait(3)
        counter.jaiJouéUneBouleEtJaiFait(1)
        counter.jaiJouéUneBouleEtJaiFait(5)

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 15)
    }


    @Test
    fun `when player scored 1, 1, 4, 6, and 5, score should be 22`() {
        val counter = BowlingCounter()
        counter.jaiJouéUneBouleEtJaiFait(1)
        counter.jaiJouéUneBouleEtJaiFait(1)
        counter.jaiJouéUneBouleEtJaiFait(4)
        counter.jaiJouéUneBouleEtJaiFait(6)
        counter.jaiJouéUneBouleEtJaiFait(5)

        val score = counter.jeVoudraisConnaitreMonScore()

        assert(score == 22)
    }

}