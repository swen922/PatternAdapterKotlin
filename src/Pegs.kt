
open class RoundPeg {
    open var diameter : Double = 0.0


    constructor(diameter: Double) {
        this.diameter = diameter
    }

    constructor()
}

open class RectanglePeg {
    open var width : Double = 0.0
    open var height : Double = 0.0

    constructor(width: Double, height: Double) {
        this.width = width
        this.height = height
    }

    constructor()


}

open class SquarePeg : RectanglePeg {

    open var side : Double = 0.0

    constructor(side: Double) : super(side, side) {
        this.side = side
    }

    constructor() : super()


}