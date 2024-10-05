package pizza.taghti.ma.pizzarecipes.service;

import java.util.ArrayList;
import java.util.List;

import pizza.taghti.ma.pizzarecipes.classes.Produit;
import pizza.taghti.ma.pizzarecipes.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }
    public boolean create(Produit o){
        return produits.add(o);
    }
    public boolean update(Produit o) {
        return false;
    }
    public boolean delete(Produit o) {
        return produits.remove(o);
    }
    public List<Produit> findAll() {
        return produits;
    }
    public Produit findById(int id) {
        for(Produit p : produits)
            if(p.getId() == id)
                return p;
        return null;
    }
}
