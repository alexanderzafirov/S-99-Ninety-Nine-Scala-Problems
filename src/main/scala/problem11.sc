def pack[A](l: List[A]): List[List[A]] = l match {
  case Nil => Nil
  case _ => {
    val (group, next) = l.span(_ == l.head)
    group :: pack(next)
  }
}

def encodeModified[A](l: List[A]): List[Any] = pack(l) map { l => if (l.length == 1) l.head else (l.size, l.head) }


encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
