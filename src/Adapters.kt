
class RectangleToRoundAdapter : RoundPeg {

    var inputRectanglePeg : RectanglePeg
    override var diameter : Double

    constructor(rectPeg : RectanglePeg) : super() {
        this.inputRectanglePeg = rectPeg
        this.diameter = calculateDiam(rectPeg.width, rectPeg.height)
    }

    private fun calculateDiam(width : Double, heigth : Double) : Double {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(heigth, 2.0)) // Возвращаем тупо гипотенузу, без округления, как в Джава-версии
    }
}


class RoundToRectangleAdapter : RectanglePeg {

    var inputRoundPeg : RoundPeg
    override var width : Double
    override var height : Double

    constructor(roundPeg: RoundPeg) : super(roundPeg.diameter, roundPeg.diameter) {
        this.inputRoundPeg = roundPeg
        this.width = roundPeg.diameter
        this.height = roundPeg.diameter
    }
}