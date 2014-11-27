def duplicate[A](l: List[A]): List[A] = l flatMap {
  e => List(e, e)
}

duplicate(List('a, 'b, 'c, 'c, 'd))