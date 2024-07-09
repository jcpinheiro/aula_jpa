package edu.ifma.dcomp.teste;

import edu.ifma.dcomp.estoque.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class CadastroProduto {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
        EntityManager em = factory.createEntityManager();

        Produto produto = new Produto();
        produto.setNome("Tablet Samsung");
        produto.setDescricao("Tablet 10pol");
        produto.setPrecoAtual(new BigDecimal(2000));

        em.getTransaction().begin();
        em.persist(produto);


        em.getTransaction().commit();

        em.close();
        factory.close();
    }


}
