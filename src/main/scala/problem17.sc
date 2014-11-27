def split[A](i: Int, l: List[A]): (List[A], List[A]) = l splitAt(i)

split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))