//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // val <valtozoNeve> = "....."
    val b_nevem: String = "Marton"
    println ("Az en nevem  ${b_nevem}!")

    var szam: Float = 22f
    var szam_2: Float = 4f
    println ("${szam.toInt()} + ${szam_2.toInt()} = ${ (szam + szam_2).toInt() }")
    println ("${szam.toInt()} - ${szam_2.toInt()} = ${ (szam - szam_2).toInt() }")
    println ("${szam.toInt()} * ${szam_2.toInt()} = ${ (szam * szam_2).toInt() }")
    println ("${szam.toInt()} / ${szam_2.toInt()} = ${ (szam / szam_2).toInt() }")

    print("Kerlek irj be valamit: ")
var bekert_szoveg = readln()
    if (bekert_szoveg.isEmpty()){
        println ("HIBA: Nem adtal meg semmilyen szpveget!")
    }   else{
        (!bekert_szoveg.isEmpty())
        println (bekert_szoveg)}
}