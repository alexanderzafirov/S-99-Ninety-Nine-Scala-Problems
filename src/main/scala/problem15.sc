def duplicateN[A](i: Int, l: List[A]): List[A] = l flatMap {
  e => List.fill(i)(e)
}

duplicateN(3, List('a, 'b, 'c, 'c, 'd))