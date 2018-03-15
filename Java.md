# JAVA

## Installation

1.Installation Java SDK Version 8 u162

2.Nouveau Path dans les variables d'environnement

        C:\Program Files\Java\jdk1.8.0_162\bin

3.Installation des extensions Java sur mon VSCode

 - Java Extension Pack qui va installer d'autres dépendance pour fonctionner.

4.Création d'un Répertoire Hello_0 avec un fichier HelloWorld.java qui contient:
```java
 public class HelloWorld { 
         public static void main(String[] args) {  System.out.println("Hello, World!"); 
         } 
}        
```
Ce fichier est la définition d’une **classe ​HelloWorld**​, qui a une **méthode statique** (attachée  à la classe et non aux instances de cette classe) ​main​ et qui utilise la méthode statique **println** de la classe **​System.out** ​pour faire l’affichage. 

- Pour exécuter ce programme, il faut d’abord le compiler. 
Ouvrez un shell (cmd, bash, …) 

                PS P:\JAVA\Hello_0> ls


                PS P:\JAVA\Hello_0> javac HelloWorld.java

 La commande **​javac**​ (Java Compiler) produit le fichier compilé ​HelloWord.class​
                 
         PS P:\JAVA\Hello_0> ls

        PS P:\JAVA\Hello_0> java HelloWorld
        Hello, World!
       

  La  commande ​**java HelloWorld**​ exécute ces étapes :  
  - cherche la classe HelloWorld dans l’environnement (par défaut dans le répertoire  courant => définie dans ​HelloWord.class 
  - charge cette classe  
  - cherche la méthode par défaut, ​main​ et l’exécute 

## Créez l’arborescence de répertoires
 ​En utilisant Bash,  vous pouvez le faire avec la seule commande  
 
        mkdir -p Hello_1/src/main/java/hello 
  

Créez dans le répertoire ​hello​ les deux fichiers ​Greeter.java ​et ​HelloWorld.java​ qui  contiennent respectivement :    
```java
package hello; 
 
public class Greeter {
         public String sayHello() { 
                  return "Hello world!";
                   } 
        } 
   
package hello; 
 
public class HelloWorld { 
        public static void main(String[] args) { 
                 Greeter greeter = new Greeter();  
                 System.out.println(greeter.sayHello()); 
                 } 
        } 
```
* Le programme utilise maintenant deux classes et peut être compilé et exécuté comme suit



* les classes indiquent qu’elles appartiennent au  “package” ​hello​ - et cela correspond au répertoire ​hello​. 
Lors de l’exécution, **la classe ne  peut être trouvée que depuis le répertoire ​java​** car la classe cherchée ​hello.HelloWorld  (autrement dit la classe ​HelloWorld​ du package ​hello​ ne peut être trouvée que dans un  répertoire ​hello​).Cette notion de package est très utile pour organiser son code. 

## MAVEN

* Dans cette nouvelle version, nous introduisons un outil standard 
de “build”, **Maven**. 
Ces outils permettent en général de  gérer des dépendances (modules externes) et le cycle de compilation. 
Les frontières d’un  outil à un autre et surtout d’un langage à un autre sont assez souples.
**Maven** recouvre en  quelque sorte Composer (PHP) et Artisan (Laravel) que vous avez rencontrés.  

        Installez Maven  http://maven.apache.org/  

* maven Binary Zip archive (zip = windows)
* downloading Apache Maven 3.5.3
* On récupere le Path et on le copie sur les variables d'environnement.


**L’utilisation de Maven repose sur un Project Object  Model (POM), ici un seul fichier ​pom.xml​, à côté sur répertoire ​src​**  

        <?xml version="1.0" encoding="UTF-8"?>  <project>   <modelVersion>4.0.0</modelVersion> 
        <groupId>fr.campus-numerique-in-the-alps</groupId>   <artifactId>hello</artifactId>   
        <version>1</version>   <properties>  <maven.compiler.source>1.8</maven.compiler.source>  <maven.compiler.target>1.8</maven.compiler.target>  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>   
        </properties>  
        </project> 


* **mvn compile**​ 

Déclenche la **compilation du projet** ​hello​, en version 1. 

 Deux classes sont  trouvées et compilées, **les fichiers .​class**​ allant dans le **répertoire ​target/classes​**. 
Il faut  alors indiquer à Java le (ou les) chemin pour trouver les classes pour l’exécution. 

On utilise  ici l’option **​-cp​ (classpath)** pour indiquer de chercher dans le répertoire **​target/classes​.**    

* **mvn install**

“installe” le projet en créant le **jarfile**. 

Ce **jarfile** peut être passé comme un  répertoire pour indiquer un endroit où trouver des classes, via l’option ​-cp​ (le “classpath”).  

Les jarfiles permettent donc de packager des classes, créant des packages ou des  modules.

*********************************************************


## Les différents types de variables
Une déclaration de variable se fait comme ceci :
 
     <Type de la variable> <Nom de la variable> ;

Cette opération se termine toujours par un point-virgule « ; » (comme toutes les instructions de ce langage). 
Ensuite, on l'initialise en entrant une valeur.

### En Java, nous avons deux types de variables :

1. Des variables de type simple ou « primitif » :
ce sont tout bonnement des nombres entiers, des nombres réels, des booléens ou encore des caractères, et vous allez voir qu'il y a plusieurs façons de déclarer certains de ces types.

2. Des variables de type complexe ou des « objets »:

**Les variables de type numérique**

Le type **byte** (1 octet) peut contenir les entiers entre -128 et +127.
 ```java
        byte temperature;
        temperature = 64;   
```
Le type **short** (2 octets) contient les entiers compris entre -32768 et +32767.
 ```java
        short vitesseMax;
        vitesseMax = 32000;
```
Le type **int** (4 octets) va de -2 *109 à 2 *109 (2 et 9 zéros derrière… ce qui fait déjà un joli nombre).
 ```java
        int temperatureSoleil;
        temperatureSoleil = 15600000; //La température est exprimée en kelvins
```
Le type **long** (8 octets) peut aller de −9×1018  à 9×1018 (encore plus gros…).
 ```java
        long anneeLumiere;
        anneeLumiere = 9460700000000000L;
```
Le type **float** (4 octets) est utilisé pour les nombres avec une virgule flottante.
 ```java
        float pi;
      pi = 3.141592653f;
```
ou encore
 ```java
        float nombre;
        nombre = 2.0f;
```
Le type **double** (8 octets) est identique à **float**, si ce n'est qu'il contient plus de chiffres derrière la virgule et qu'il n'a pas de suffixe.
 ```java
        double division;
        division = 0.333333333333333333333333333333333333333333334d;

        Ici encore, on doit utiliser la lettre « d » - pour parfaire la déclaration de notre variable.
```
**Des variables stockant un caractère**

Le type **char** contient un caractère stocké entre apostrophes (« ' ' »), comme ceci :
 ```java
        char caractere;
        caractere = 'A';
```

**Des variables de type booléen**  

Le type **boolean**, lui, ne peut contenir que deux valeurs  :true(vrai) ou false(faux), sans guillemets (ces valeurs sont natives dans le langage, il les comprend directement et sait les interpréter).

 ```java
        boolean question;
        question = true;
```
**et aussi de type String**

Le type **String** permet de gérer les chaînes de caractères, c'est-à-dire le stockage de texte.

Il s'agit d'une variable d'un type plus complexe que l'on appelle objet. 
 ```java
        //Première méthode de déclaration
        String phrase;
        phrase = "Titi et Grosminet";

        //Deuxième méthode de déclaration
        String str = new String();
        str = "Une autre chaîne de caractères";

        //Troisième méthode de déclaration
        String string = "Une autre chaîne";

        //Quatrième méthode de déclaration
        String chaine = new String("Et une de plus !");
 ```
Attention : String commence par une majuscule !
            Lors de l'initialisation, on utilise des guillemets doubles ("")


1.on peut très bien compacter les phases de déclaration et d'initialisation en une seule phase ! Comme ceci :
 ```java
        int entier = 32;
        float pi = 3.1416f;
        char carac = 'z';
        String mot = new String("Coucou");
 ```
2.lorsque nous avons plusieurs variables d'un même type, nous pouvons résumer tout ceci à une déclaration :
 ```java
        int nbre1 = 2, nbre2 = 3, nbre3 = 0;
 ```
## Les Opérateurs arithmétiques

« + » : permet d'additionner deux variables numériques (mais aussi de concaténer des chaînes de caractères ; ne vous inquiétez pas, on aura l'occasion d'y revenir).

« - » : permet de soustraire deux variables numériques.

« * » : permet de multiplier deux variables numériques.

« / » : permet de diviser deux variables numériques

« % » : permet de renvoyer le reste de la division entière de deux variables de type numérique ; cet opérateur s'appelle le modulo.
 ```java
int nbre1, nbre2, nbre3;  //Déclaration des variables

        nbre1 = 1 + 3;            //nbre1 vaut 4
        nbre2 = 2 * 6;            //nbre2 vaut 12
        nbre3 = nbre2 / nbre1;    //nbre3 vaut 3
        nbre1 = 5 % 2;            //nbre1 vaut 1, car 5 = 2 * 2 + 1
        nbre2 = 99 % 8;           //nbre2 vaut 3, car 99 = 8 * 12 + 3
        nbre3 = 6 % 3;         //là, nbre3 vaut 0, car il n'y a pas de reste

        int nbre1, nbre2, nbre3;    //Déclaration des variables
```

Autres Déclaration de variable:
```java
        nbre1 = nbre2 = nbre3 = 0;  //Initialisation
        
        nbre1 = nbre1 + 1;    //nbre1 = lui-même, donc 0 + 1 => nbre1 = 1
        nbre1 = nbre1 + 1;    //nbre1 = 1 (cf. ci-dessus), maintenant, nbre1 = 1 + 1 = 2
        nbre2 = nbre1;         //nbre2 = nbre1 = 2
        nbre2 = nbre2 * 2;     //nbre2 = 2 => nbre2 = 2 * 2 = 4
        nbre3 = nbre2;         //nbre3 = nbre2 = 4
        nbre3 = nbre3 / nbre3; //nbre3 = 4 / 4 = 1
        nbre1 = nbre3;         //nbre1 = nbre3 = 1
        nbre1 = nbre1 - 1;     //nbre1 = 1 - 1 = 0
```
********************
## Capacité
* **byte** correspondrait à un dé à coudre, elle ne peut pas contenir grand-chose ;

* **int** serait un verre, c'est déjà plus grand ;

* **double** serait un baril. 

## Pour afficher le contenu d'une variable dans la console, appelez l'instruction 

    System.out.println(maVariable);, ou encore System.out.print(maVariable);


```java
double nbre1 = 10, nbre2 = 3;
int resultat = (int)(nbre1 / nbre2);
System.out.println("Le résultat est = " + resultat);
```

# Les Conversions, ou "cast"

 Les variables de type **double** contiennent **plus d'informations** que les variables de type **int**.

1.D'un type **int** en type **float**:
```java
int i = 123;
float j = (float)i;
```
2.D'un type **int** en **double**:
```java
int i = 123;
double j = (double)i;
```