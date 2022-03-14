


class RoundHole {
    var diameter : Double = 0.0

    constructor(diameter: Double) {
        this.diameter = diameter
    }

    fun canFit(peg : RoundPeg): Boolean {
        return this.diameter >= peg.diameter
    }
}


class RectangleHole {
    var width : Double = 0.0
    var height : Double = 0.0

    constructor(width: Double, height: Double) {
        this.width = width
        this.height = height
    }

    fun canFit(peg : RectanglePeg): Boolean {
        val biggest = if (width > height) width else height
        if (biggest < peg.width || biggest < peg.height) {
            return false
        }
        val smallest = if (width < height) width else height
        if (smallest < peg.width && smallest < peg.height) {
            return false
        }
        return true
    }
}


