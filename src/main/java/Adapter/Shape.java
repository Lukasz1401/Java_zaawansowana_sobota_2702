package Adapter;

public interface Shape {
}

/*
Napisać Interfej Shape (kształt) z metodami drow(rysuj),
getCircumference (obwód). Zrobić 2 implementacje tego interfejsu (Square, Triangle)
Napisać klasę ShapreManager która ma listę Shape-ów.
Napisać metodę która dodaje do tej listy kolejny Shape, oraz metodę drawAllShapers
i printAllCircumference
Nastpemnie NapisacKlase Circle(NIE impelemtujaca Shape),
która  ma metody print (rysuj) oraz calculateCircumference
Napisz Adatper do klasy Circle tak aby spełniała interfej Shape.
Jaby przetestować działanie w metodzie main stwórz Shapermanager dodaj do niego kwadrat,
trójkat oraz adapter klasy Circle( oczywicie najpierw stworzyć samo Circle)
 */
