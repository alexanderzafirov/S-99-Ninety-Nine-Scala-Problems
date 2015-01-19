import scala.util.Random

def randomSelect[A](i: Int, l: List[A]): List[A] = {
  def extract[A](i: Int, l: List[A]): (List[A], A) =
  l.splitAt(i) match {
    case (Nil, _) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }

  if (i <= 0) Nil
  else {
    val (rest, e) = extract(Random.nextInt(l.length), l)
    e :: randomSelect(i - 1, rest)
  }
}
randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))