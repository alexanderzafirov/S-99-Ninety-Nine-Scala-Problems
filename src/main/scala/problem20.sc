def removeAt[A](i: Int, l: List[A]): (List[A], A) = l.splitAt(i) match {
  case (Nil, _) => throw new NoSuchElementException
  case (pre, e :: post) => (pre ::: post, e)
  case (pre, Nil) => throw new NoSuchElementException
}

removeAt(3, List('a, 'b, 'c, 'd))

