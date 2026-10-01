# Pseudo code des exercices

_Pseudo code à faire seulement jusqu'au tp4_

## Module 1

### Exo 5

```
ALGORITHME : devisPeinture

ENTREES : 
- longueur : REEL
- largeur : REEL
- hauteur : REEL
SORTIES :
 - surfaceNet : REEL
 - nbrPotArrondi : ENTIER
 - prixTotal : REEL
VARIABLES :
- perimetre : REEL
- surface : REEL
- tauxPorteFenetre : REEL
- contenancePot : REEL
- prixPot : REEL
- nbrDePot : REEL
```

```
DEBUT
    LIRE(longeur)
    LIRE(largeur)
    LIRE(hauteur)
    
    contenancePot <- 10
    prixPot <- 29.90
    tauxPorteFenetre <- 0.8
    
    perimetre <- (longeur * largeur) * 2
    surface <- perimetre * hauteur
    surfaceNet <- surface * tauxPorteFenetre
     
    nbrPot <- surfaceNet / contenancePot
    nbrPotArrondi <- ArrondiSuperieur(nbrPot)

    prixTotal <- nbrPotArrondi * prixPot

    AFFICHER("La surface net est de : " + surfaceNet + "m². Il vous faudra " + nbrPotArrondi + " pot(s), pour un total de " + prixTotal + " euros.")
FIN
```