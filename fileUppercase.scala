import scala.io.Source

object fileUppercase extends App {


  val n = 3
  var words = Source.fromFile("C:\\Users\\k.jedra\\Desktop\\testFile.txt").getLines.mkString.split("\\W+")
  var newWords = List.empty[String]

  for (i <- words.indices) {
    if (i % n == 0) newWords = newWords :+ words(i).toUpperCase()
    else newWords = newWords :+ words(i)
  }
  newWords.foreach(x => print(x + " "))
}
