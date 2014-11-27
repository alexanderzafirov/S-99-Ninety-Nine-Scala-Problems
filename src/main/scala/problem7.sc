def flatten(l: List[Any]): List[Any] = l flatMap {
  case ls: List[Any] => flatten(ls)
  case e => List(e)
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))
