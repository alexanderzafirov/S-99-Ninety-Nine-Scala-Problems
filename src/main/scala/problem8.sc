def compress[A](l: List[A]): List[A] = l match {
  case Nil => Nil
  case head :: tails => head :: compress(tails.dropWhile(_ == head))
}

compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
