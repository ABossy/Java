# JAVA Les Mots clés

## Objets
|    Nom         |     Definition      |  
| --------------- |------------------------- |
|class | Définit un objet de type « classe ».| 
|interface| Définit un objet de type "interface" qui spécifie un comportement mais pas son code.|
|enum| Définit un objet de type « énumération ».|
|extends|Indique qu'une classe ou une interface étend respectivement une autre classe ou d’autres interfaces.|
|implements| Indique qu'une classe implémente une ou plusieurs interfaces.|
|import| Référence des classes, des packages entiers ou des méthodes pour les utiliser dans le programme sans écrire leurs noms complets.|
|this| Référence l'objet courant.|
|super| Référence la classe mère de l'objet courant.|
|package| Indique le package auquel appartient l'objet.
|abstract| Indique qu’une classe ou une méthode est abstraite (devra être implémentée par héritage) .|
|native| Indique qu'une méthode est écrite de manière native, dans un autre langage que Java et dans un autre fichier.|

## Modificateurs
|    Nom         |     Definition      |  
| --------------- |------------------------- |
|private |Indique qu'un élément n'est accessible que dans la classe où il est définit.|
|protected |Indique qu'un élément n'est accessible que dans la classe où il est définit, ou dans les classes filles, ou encore dans les classes du même package.|
|public | Indique qu'un élément est accessible partout |

## États
|    Nom         |     Definition      |  
| --------------- |------------------------- |
|false| Représente une valeur booléenne négative.|
|true| Représente une valeur booléenne positive.|
|new|Opérateur permettant d'instancier un objet.|
|null| Valeur indiquant qu'une variable ne référence rien.|
|transient| Interdit qu'une variable soit sérialisée.|
|static|Indique qu'une variable, une méthode ou un bloc n'appartient pas à une instance particulière d'une classe.|
|strictfp |Garantit la précision et les arrondis des calculs flottants pour assurer la portabilité|
|final| Interdit qu'un élément soit modifié ou étendu.|
|volatile|Garantit la synchronisation d'une variable dans un contexte multithread.|

## Type
|    Nom         |     Definition      |  
| --------------- |------------------------- |
|void |Indique qu'une méthode ne renvoie pas de valeur.|
|boolean |Booléen true (vrai) et false (faux)|
|char |Caractère 16 bits|
|byte| Entier 8 bits signés|
|short| Entier 16 bits signés|
|int |Entier 32 bits signés|
|long |Entier 64 bits signés|
|float |Décimal 32 bits signés|
|double |Décimal 64 bits signés|


## Exemple
```java
public interface Animal {
String getCri();
}

public class Loup implements Animal {
protected String cri;
public Loup() {
cri = "hurle";
}


public String getCri() {
return cri;
}

}

public class Chien extends Loup {
public Chien() {
cri = "aboie";
}

}												 

```                                                                                            												

## Boucles
|    Nom         |     Definition      |  
| --------------- |------------------------- |
|while |Crée une boucle avec une condition d'arrêt.|
|for |Crée une boucle avec une initialisation de variable,une condition d'arrêt et une règle d'incrémentation.|
|do| Crée une boucle, associée à un « while », dont la condition d'arrêt est évaluée après l'itération.|
|continue| Stoppe l'exécution d'une boucle et reprend à l'itération suivante (ou au niveau d’un label)

```java
for(int i = 0, i < 10, i++) {
System.out.println("i: " +i);
}
``` 
