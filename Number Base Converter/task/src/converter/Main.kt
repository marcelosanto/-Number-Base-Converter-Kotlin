package converter

fun main() {
    while (true) {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
        val opt = readln()

        if (opt == "/exit") {
            break
        } else {
            val (sourceBase, targetBase) = opt.split(" ").map { it.toInt() }

            while (true) {
                print("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back)")
                val answer = readln()

                if (answer == "/back") {
                    break
                } else {
                    println("Conversion result: ${answer.toBigInteger(sourceBase).toString(targetBase)}")
                }

            }
        }
    }
}
