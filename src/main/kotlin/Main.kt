// Mit der Zeile in Zeile 3 prüfe ich, ob die Startzahl "kleiner" oder "gleich" der Endzahl ist.
// Wenn dies nicht der Fall ist, dann bekommt man die Meldung falsches Argument.
// Da wir in der Aufgabe eine Randomzahl zwischen 1 und 100 ausgeben sollten man die Abfrage Sinn.
// Es gibt hier zwei Wege, um dass abzufangen ich hätte auch prüfen können das die Startzahl und die Endzahl nicht identisch ist

fun main(args: Array<String>) {
    /*
        Die Variable Start und End benötige ich beim Aufrufen der Function Random.
        Die Erklärung warum wir in der Function ganz unten erklärt
    */
    var start: Int = 1
    var end: Int = 100

    var randomnumber = random(start, end)
    /*
        In dem Abschnitt wird die Anrede und die Aufforderung geschrieben das der Nutzer seinen Namen mitteilen soll
        und er dann mit seinem Namen angesprochen werden kann.
    */
    println("Hallo Willkommmen zum Zahlenraten-Spiel")
    println("Ich werde eine Zufallszahl zwischen 1 und 100 generieren")
    println("Dann bekommst Du die Möglichkeit via Eingabe diese zu erraten")
    println("Verrate mir doch erstmal wie dein Name ist")
    var firstName = readln()
    println("Hallo $firstName")
    println("Nun hat das Games eine Zahl generiert")
    println("Viel Glück")

    /*  Hier habe ich eine While Schleife aufgebaut, dass was in der Schleife steht,
        wird so lange ausgeführt bis die Eingabe und die generierte Zahl identisch sind.
        Die Variable Count wird für das zählen der Versuche verwendet. In der Variable Input kommt die Zahl des Nutzers rein.
        Beide Variablen (count,input) bekommen den Inizialisierungs-Wert = 0
    */
    var count = 0
    var input: Int = 0
    while (input != randomnumber) {
        print("Bitte geben eine Zahl ein: ")
        input = readln().toInt()
        count++
    }
    // Hier wird geschrieben, welche Zahl man zu erraten hatte.
    println("Die zu erratende Zahl war: $input")
    // Hier wir einem Ausgegeben wie viel Versuche man dafür gebraucht hat
    println("Du hast : $count versuche gebraucht")
}

// =======================================
// Ab hier kommen meine Functions.
// =======================================

/*
    Hier habe ich eine Funktion erstellt diese heiß random, um mir die Randomzahl generieren zu lassen.
    Wichtig da ich in Zeile 57 wo ich die Funktion deklariere festgelegt habe, dass ich eine
    Startzahl (start:Int) und eine Endzahl (end:Int) benötige um mit der Function zu arbeiten, muss ich beim Aufruf
    der Funktion zwei Zahlen mitgeben.
    Hier ist es wichtig darauf zu achten, dass ihr die Zahlen oder Variablen die eingesetzt werde, mit einem Komma getrennt sind.
    Damit gebe ich der Function mit zwischen welchen Zahlen die Funktion eine Randomzahl generieren soll.
*/
fun random(start: Int, end:Int):Int {
    require(start <= end) {"falsches Argument"}
    return (start..end).random()
}