package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
        meuProduto.setNome("XBox");
        meuProduto.setValor(5000);
        //meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();
        ItemIncluso item1 = new ItemIncluso("Controles",2);
        itensInclusos.add(item1);

        ItemIncluso item2 = new ItemIncluso("Jogos",3);
        itensInclusos.add(item2);

        ItemIncluso item3 = new ItemIncluso("Cabos de Energia",2);
        itensInclusos.add(item3);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println();
        System.out.println("Nome produto: "+meuProduto.getNome());
        System.out.println("Valor: "+meuProduto.getValor());
        System.out.println("Marca: "+meuProduto.getMarca());
        System.out.println("Tamanho: "+meuProduto.getTamanho());

        System.out.println("Quantidade de itens: "+meuProduto.getItensInclusos().size());
        System.out.println();
        System.out.println("Itens dos produtos: ");
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getQuantidade()+" "+itemAtual.getNome());
        }
        System.out.println();
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("SONY",Tamanho.MEDIO);
        System.out.println(meuProdutoNacional.getMarca()+" "+meuProdutoNacional.getTamanho());
        meuProdutoNacional.setImpostoNacional(0.5578);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("SONY",Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-99);
    }
}
