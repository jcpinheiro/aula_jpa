package edu.ifma.dcomp.teste;

import edu.ifma.dcomp.estoque.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class BuscaProduto {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, 1);
        produto.setPrecoAtual(new BigDecimal(3300) );
        System.out.println(produto );

        em.getTransaction().commit();
        em.close();
        factory.close();
    }


}
