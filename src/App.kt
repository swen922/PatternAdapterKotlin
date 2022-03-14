
/** Адаптер, также известен как: Wrapper, Обёртка, Adapter */

fun main(args : Array<String>) {
    val roundHole = RoundHole(6.0)
    val rectHole = RectangleHole(5.0, 4.0)

    val roundPeg = RoundPeg(6.5)
    val squarePeg = SquarePeg(3.5)
    val rectPeg = RectanglePeg(5.6, 2.0)

    println(roundHole.canFit(roundPeg))
    println(rectHole.canFit(squarePeg))

    val roundRectAdapter = RoundToRectangleAdapter(roundPeg)
    println(rectHole.canFit(roundRectAdapter))

    val sqRoundAdapter = RectangleToRoundAdapter(squarePeg)
    println(roundHole.canFit(sqRoundAdapter))

    val rectRoundAdapter = RectangleToRoundAdapter(rectPeg)
    println(roundHole.canFit(rectRoundAdapter))
}