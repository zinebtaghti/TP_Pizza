# TP Pizza

## Description
**TP-Pizza** est une application Android native permettant aux utilisateurs de parcourir et de découvrir différentes recettes de pizza. L'application propose une interface intuitive et conviviale, permettant la navigation entre une liste de recettes et les détails de chaque recette avec des informations complètes telles que les ingrédients et les étapes de préparation.

## Objectifs du projet :
1. Afficher une liste de recettes de pizza.
2. Permettre aux utilisateurs de consulter les détails d'une recette (ingrédients et instructions).
3. Fournir une interface utilisateur simple et attractive.

## Fonctionnalités
- **Liste des recettes** : Affiche une collection de recettes sous forme de liste.
- **Détails de la recette** : Permet de voir les ingrédients et les étapes pour préparer chaque pizza.
- **Partage de recettes** : Les utilisateurs peuvent partager une recette via leurs applications sociales.

## Structure du projet

### Activités principales
1. **SplashActivity** :
-une activité de démarrage avec une animation appliquée sur une 
image (logo de votre application) . 
2. **ListPizzaActivity** : 
   - Gère l'affichage de la liste des pizzas sous forme de RecyclerView.
   - Chaque élément de la liste affiche le nom, l'image et une description succincte de la recette.

3. **PizzaRecipesActivity** :
   - Affiche les détails d'une recette spécifique sélectionnée par l'utilisateur.
   - Les détails incluent l'image, les ingrédients et les instructions pour la préparation.
   - Un bouton "Partager" permet à l'utilisateur de partager la recette via d'autres applications.

### XML pour l'interface graphique

-**activity_splash.xml** : Fichier de mise en page pour la 'ListPizzaActivity' pour afficher une animation de démarage de l'application.
- **activity_list_pizza.xml** : Fichier de mise en page pour la MainActivity affichant la liste des pizzas.
  - Utilisation d'un RecyclerView pour afficher les pizzas.
  
- **activity_pizza_recipe.xml** : Fichier de mise en page pour l'activité des détails de la pizza.
  - Utilise des TextView et ImageView pour afficher les informations détaillées de la recette.
  - Un bouton de partage est inclus pour partager les informations via d'autres applications.
-**item.xml** : Fichier de mise en page des éléments de la liste des pizzas.
-**header.xml** : Fichier de mise en page de l'entete de l'application.  

## Logique Java
1.**SplashActivity** :
   -Afficher une activité animée pour certains temps pour monter le démarage de l'application.
1. **ListPizzaActivity.java** :
   - Charge la liste des recettes de pizza et les affiche dans un RecyclerView.
   - Gère la navigation vers l'activité des détails d'une recette via une Intent en transmettant les informations nécessaires.

2. **PizzaRecipesActivity.java** :
   - Affiche les détails de la recette sélectionnée en récupérant les données de l'Intent envoyée depuis la MainActivity.
   - Implémente la fonctionnalité de partage des informations de la recette.

## Technologies utilisées
- **Langage** : Java (Android SDK)
- **Interface utilisateur** : XML (pour les mises en page)
- **Plateforme** : Android

## Instructions d'installation

1. Clonez le dépôt GitHub :
   ```bash
   git clone https://github.com/zinebtaghti/TP_Pizza
2.Ouvrez le projet dans Android Studio.
3.Lancez l'application sur un émulateur Android ou un appareil physique connecté.

## utilisation
1.Ouvrez l'application pour accéder à la liste des recettes de pizza.
2.Cliquez sur une recette pour afficher ses détails, y compris les ingrédients et les instructions de préparation.
3.Utilisez le bouton de partage pour envoyer la recette via d'autres applications.

## Vidéo Démonstration

https://github.com/user-attachments/assets/8adea5b9-7a94-4288-8d72-d66c38e9efb4
