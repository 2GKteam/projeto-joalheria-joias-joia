// Aguarda o carregamento da página
document.addEventListener("DOMContentLoaded", function() {
	// Seleciona o formulário pelo ID
    const form = document.getElementById("cadastroProdutoForm");

	// Adiciona um evento de submit no formulário
	form.addEventListener("submit", function(event) {
			event.preventDefault();

			// Captura os valores digitados nos campos
        const nome = document.getElementById("nome").value;
        const pre = document.getElementById("pre").value;
        const desc = document.getElementById("desc").value;
        const imgUrl = document.getElementById("imgUrl").value;
		const categoriaProduto = document.getElementById("categoriaProduto").value;
		const tipoProduto = document.getElementById("tipoProduto").value;
		const ornamentoProduto = document.getElementById("ornamentoProduto").value


		// Envia os dados para o backend usando fetch
        fetch("http://localhost:8080/produto", {
                method: "POST",
                headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome, 
					pre, 
					desc,
					imgUrl,
					categoriaProduto: {
						idCategoria: 1
					},
					tipoProduto: {
						idTipoProduto: 1
					},
					ornamentoProduto:{
						idOrnamento:1
					}
				})
            })
			.then(response => {
							if (!response.ok) {
								throw new Error('Erro ao cadastrar produto');
							}
							return response.json(); // Pega o corpo da resposta (esperando que venha o objeto com id)
						})
							// Redireciona para a página de endereço
							window.location.href = 'index.html';
						});

				})
