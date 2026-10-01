# Pseudo code des exercices

_Pseudo code à faire seulement jusqu'au tp4_

## Module 2

### Exo 1

```
ALGORITHME : calculatriceSimple
ENTREES :
- nbr1 : REEL
- nbr2 : REEL
- operateur : CARACTERE
SORTIES : 
- messageErreur : CHAINE
- resultat : REEL
```

```
DEBUT
    LIRE(nbr1)
    LIRE(nbr2)
    LIRE(operateur)

    SELON operateur FAIRE
        CAS '+' : 
            resultat <- nbr1 + nbr2
            AFFICHER("Résultat : " + resultat)
    
        CAS '-' : 
            resultat <- nbr1 - nbr2
            AFFICHER("Résultat : " + resultat)
           
        CAS '*' : 
            resultat <- nbr1 * nbr2
            AFFICHER("Résultat : " + resultat)

        CAS '/' : 
            SI nbr2 = 0 ALORS
                messageErreur <- "Erreur : division par zero"
                AFFICHER(messageErreur)
            SINON
                resultat <- nbr1 / nbr2
                AFFICHER("Résultat : " + resultat)
            FINSI
            
        AUTREMENT
                messageErreur <- "Erreur : operateur inconnu"
                AFFICHER(messageErreur)
    FINSELON
FIN
```