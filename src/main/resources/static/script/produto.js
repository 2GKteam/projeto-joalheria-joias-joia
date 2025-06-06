document.addEventListener("DOMContentLoaded", () => {
   
    const urlParams = new URLSearchParams(window.location.search);
   
    const produtoId = urlParams.get("id");
   
    if (produtoId) {
       
        fetch(`http://localhost:8080/produto/${id_produto}`)
            .then(response => response.json())
            .then(produto => {
                document.getElementById("produto-img").src = produto.imgUrl;
                document.getElementById("produto-img").alt = produto.nomeProduto;

                document.getElementById("produto-nome").textContent = produto.nomeProduto;
               
                document.getElementById("produto-descricao").textContent = produto.descricaoProduto;
               
                document.getElementById("produto-preco").textContent = `R$ ${produto.precoProduto.toFixed(2)}`;
            })
            .catch(error => console.error("Erro ao carregar produto:", error));
    }
});