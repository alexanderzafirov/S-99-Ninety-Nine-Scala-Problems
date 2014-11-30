def rotate[A](i: Int, l: List[A]): List[A] =
  if (i < 0) rotate(i + l.length, l)
  else (l drop i) ::: (l take i)

rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

