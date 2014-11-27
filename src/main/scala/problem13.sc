def encodeDirect[A](l: List[A]): List[(Int, A)] = l match {
  case Nil => Nil
  case _ => {
    val (group, next) = l.span(_ == l.head)
    (group.length, group.head) :: encodeDirect(next)
  }
}

encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))