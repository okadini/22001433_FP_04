object q3 {
    def main(args:Array[String]) = {

        def toUpper(word:String):String = {

            var text:String = ""

            for(i <- word.indices) {
                if(word(i) >= 'A' && word(i) <= 'Z') {
                    text = text + word(i)
                }
                else {
                    text = text + (word(i) - 32).toChar
                }
            }

            text
        }

        def toLower(word:String):String = {

            var text:String = ""

            for(i <- word.indices) {
                if(word(i) >= 'a' && word(i) <= 'z') {
                    text = text + word(i)
                }
                else {
                    text = text + (word(i) + 32).toChar
                }
            }

            text
        }

        def formatNamesSecondLetter(name:String):String = {

            var text:String = ""

            text = text + name(0).toString

            text = text + toUpper(name(1).toString)

            text = text + name.tail.tail

            text
        }

        def formatNamesLastLetter(name:String):String = {

            var text = ""

            for(i <- 0 to (name.length)-2) {
                text = text + name(i)
            }

            text = text + toUpper(name((name.length)-1).toString)

            text
        }

        printf("toUpper => Benny => %s\n",toUpper("Benny"))
        printf("toLower => Saman => %s\n",toLower("Saman"))
        printf("formatNames => Niroshan => %s\n",formatNamesSecondLetter("Niroshan"))
        printf("formatNames => Kumara => %s\n",formatNamesLastLetter("Kumara"))
    }
}