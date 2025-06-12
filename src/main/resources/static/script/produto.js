document.addEventListener("DOMContentLoaded", () => {
    const urlParams = new URLSearchParams(window.location.search);
    const produtoId = urlParams.get("id");
	
	

    if (produtoId) {
        fetch(`http://localhost:8080/produto/${produtoId}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error("Produto não encontrado");
                }
                return response.json();
            })
            .then(produto => {
                document.getElementById("produto-img").src = produto.imgUrl;
                document.getElementById("produto-nome").textContent = produto.nomeProduto;
                document.getElementById("produto-descricao").textContent = produto.descricaoProduto;
                document.getElementById("produto-preco").textContent = `R$ ${produto.precoProduto.toFixed(2)}`;
            })
            .catch(error => {
                console.error("Erro ao carregar produto:", error);
                alert("Erro ao carregar informações do produto.");
            });
			
			
    }
});
