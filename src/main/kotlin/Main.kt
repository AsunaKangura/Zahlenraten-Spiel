// Mit der Zeile in Zeile 3 prüfe ich, ob die Startzahl "kleiner" oder "gleich" der Endzahl ist.
// Wenn dies nicht der Fall ist, dann bekommt man die Meldung falsches Argument.
// Da wir in der Aufgabe eine Randomzahl zwischen 1 und 100 ausgeben sollten man die Abfrage Sinn.
// Es gibt hier zwei Wege, um dass abzufangen ich hätte auch prüfen können das die Startzahl und die Endzahl nicht identisch ist

fun random(start: Int, end:Int):Int {
    require(start <= end) {"falsches Argument"}
    return (start..end).random()
}
fun main(args: Array<String>) {
    var start: Int = 1
    var end: Int = 100

    var randomnumber = random(start, end)
    //println(randomnumber)
    //for(i in 1..6) println(random(start, end))
    println("Hallo Willkommmen zum Zahlenraten-Spiel")
    println("Ich werde eine Zufallszahl zwischen 1 und 100 generieren")
    println("Dann bekommst Du die Möglichkeit via Eingabe diese zu erraten")
    println("Verrate mir doch erstmal wie dein Name ist")
    var firstName = readln()
    println("Hallo $firstName")
    println("Nun hat das Games eine Zahl generiert")
    var count = 0
    var input: Int = 0
    while (input != randomnumber) {
        print("Bitte geben Sie eine Eingabe ein: ")
        input = readln().toInt()
        count++
    }
    println("Die zu erratende Zahl war: $input")
    println("Du hast : $count versuche gebraucht")
}