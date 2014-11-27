def slice[A](i: Int, j: Int, l: List[A]): List[A] = l.slice(i, j)

slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))