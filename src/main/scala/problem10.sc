def pack[A](l: List[A]): List[List[A]] = l match {
  case Nil => Nil
  case _ => {
    val (group, next) = l.span(_ == l.head)
    group :: pack(next)
  }
}

def encode[A](l: List[A]): List[(Int, A)] = pack(l) map { l => (l.length, l.head) }

encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
