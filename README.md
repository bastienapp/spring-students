# Injection de dépendance

Cette application a pour but d'afficher la liste des étudiants apparenant à l'école de Toulouse.

Bordeaux, jaloux de cette formidable application, aimerait avoir la même qui afficherait ses élèves.

Problème : il faut adapter le code pour pouvoir changer la liste en fonction des écoles !

## 1 - État actuel : couplage fort

En regardant le code actuel du projet, tu pourras découvrir que la liste des élèves est "en dur" dans la classe `School`. Quand une classe crée les instances d'une autre classe, on appelle cela du couplage fort.

Afin d'afficher une autre liste, il faudrait créer des méthodes différentes, puis appeler ces méthodes selon les cas. Le code sera de plus en plus "sale" au fur et à mesure des ajouts et des modifications.

> Tu peux tester l'application avec la commande `mvn spring-boot:run`

## 2 - Passage à l'injection de dépendance : couplage faible

Afin d'améliorer le code existant et retirer le couplage fort, tu vas utiliser l'injection de dépendance.

* `Student` devra implémenter une nouvelle interface `StudentService`, qui possèdera la méthode `studentsList` qui retournera `List<Student>`.
* `StudentService` devra posséder une nouvelle implémentation `StudentServiceImplTls`, qui retournera une liste d'étudiants Toulousains (celle qui était précédemment dans la classe `School`).
* `School` deva récupérer sa liste d'étudiant à partir de `StudentService`, par injection de dépendance.

> Attention, tu devras parfois utiliser @Component

## 3 - Plusieurs implémentations

Une fois que cela fonctionne, crée une seconde implémentation de `StudentService` nommée `StudentServiceImplBdx`, qui retourne une liste d'étudiants Bordelais.

Faire en sorte qu'on puisse changer la liste d'étudiant en fonction de l'implémentation choisie, grâce à `@Qualifier`.
